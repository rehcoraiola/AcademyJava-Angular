package com.example.filmes.controller;

import java.util.List;

import com.example.filmes.model.Filme;
import com.example.filmes.repository.FilmeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller                                             //controler de req
public class FilmesController {
    private FilmeRepository repository;

    public FilmesController(FilmeRepository repository) {
        this.repository=repository;
    }

    @GetMapping("/filme")       //busca por essa rota
    public String filmes(Model req){ //recebendo da requisicao
        List<Filme> lista=(List<Filme>)repository.findAll();

        req.addAttribute("filmes", lista);
        return "filmes";    //chama os filmes.html do template 
    }

    @GetMapping("filme/form")    
    public String formulario(Model req){
        Filme model=new Filme();
        req.addAttribute("filme",model);
        return "filmes-form";
    }

    @PostMapping("/filme/salvar")
    public String salvar(Filme model){ //espera receber pq os names do formularios são iguais da classe
        //salvar no bancio
        repository.save(model);
        return "redirect:/filme";
    }

    @GetMapping("/filme/deletar/{id}")
    public String deletar(@PathVariable int id){ //Variavel vinda da URL
        repository.deleteById(id);
        return "redirect:/filme";
    }

   @GetMapping("/filme/editar/{id}") //Entre {} significa parametro
        public String editar(@PathVariable int id, Model req){ //Variavel vinda da URL
        Filme model= repository.findById(id).get();
        req.addAttribute("filme",model);
        return "filmes-form"; 
   }
    
}
