import Conta from "./model/Conta.js";
import ContaDao from "./Repository/ContaDao.js";

console.log("Banco")

const c1=new Conta();
c1.agencia=121
c1.numero=444
c1.saldo=888.99

console.log(c1.agencia, c1.numero,c1.saldo)

const repository= new ContaDao();
const listar = repository.findAll();
console.log(listar);

const create= repository.create(c1);
const update= repository.update(c1);
const deletar= repository.delete(2);


