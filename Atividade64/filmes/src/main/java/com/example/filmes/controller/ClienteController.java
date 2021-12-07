package com.example.filmes.controller;

import java.util.List;

import com.example.filmes.repository.ClienteRepository;
import com.example.filmes.model.Cliente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller                                             //controler de req
public class ClienteController {
    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository=repository;
    }

    @GetMapping("/cliente")       //busca por essa rota
    public String Clientes(Model req){ //recebendo da requisicao
        List<Cliente> lista=(List<Cliente>)repository.findAll();

        req.addAttribute("cliente", lista);
        return "cliente";    //chama os Clientes.html do template 
    }

    @GetMapping("cliente/form")    
    public String formulario(Model req){
        Cliente model=new Cliente();
        req.addAttribute("cliente",model);
        return "clientes-form";
    }

    @PostMapping("/cliente/salvar")
    public String salvar(Cliente model){ //espera receber pq os names do formularios são iguais da classe
        //salvar no bancio
        repository.save(model);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/deletar/{id}")
    public String deletar(@PathVariable int id){ //Variavel vinda da URL
        repository.deleteById(id);
        return "redirect:/cliente";
    }

   @GetMapping("/cliente/editar/{id}") //Entre {} significa parametro
        public String editar(@PathVariable int id, Model req){ //Variavel vinda da URL
        Cliente model= repository.findById(id).get();
        req.addAttribute("cliente",model);
        return "clientes-form"; 
   }
    
}


