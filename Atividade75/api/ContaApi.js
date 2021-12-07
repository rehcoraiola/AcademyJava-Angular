import { Router } from "express";
import Conta from "../model/Conta.js";
import ContaDao from "../Repository/ContaDao.js";

const ContaApi=Router();

const repository= new ContaDao();

ContaApi.get('/', async(req,resp)=>{
    const listar = await repository.findAll();
    resp.send(listar);
})
ContaApi.post('/', async(req,resp)=>{
    let{numero,agencia,saldo} = req.body;
    const conta=new Conta(numero,agencia,saldo); 
    
    const retorno = await repository.create(conta);
    resp.send(retorno);
})
ContaApi.put('/:id', async(req,resp)=>{
    const conta=new Conta();
    let id=req.params.id;

    let{numero,agencia,saldo} = req.body;
    const conta=new Conta(numero,agencia,saldo,id);
    
    //Outra forma de fazer
    // conta.agencia=req.body.agencia;
    // conta.numero=req.body.numero
    // conta.saldo=req.body.saldo

    const retorno = await repository.update(conta);
    resp.send(retorno);
})
ContaApi.delete('/:id', async(req,resp)=>{
    const retorno = await repository.delete(req.params.id);
    resp.send(JSON.stringify(retorno))  //.status(201);
})

export default ContaApi;