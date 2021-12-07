package com.devrenata.filmes.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.devrenata.filmes.model.Genero;
import com.devrenata.filmes.repository.GeneroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/genero")
public class GeneroApi {
    @Autowired
    private GeneroRepository repo;

    @GetMapping
    public List<Genero> list(){
        return (List<Genero>)repo.findAll();
    }

    @PostMapping
    public String create(@RequestBody Genero model){
        repo.save(model);
        return "Salvo com sucesso";
    }

    @DeleteMapping
    public String delete(@PathVariable int id){
        repo.deleteById(id);
        return "Deletado com sucesso";
    }
    
    //Versão de Update desconsiderando id da URL, apenas o dia do Body
    @PutMapping("{id}")
    public String update(@PathVariable int id, @RequestBody Genero model){
        model.setId(id);
        repo.save(model);
        return"Alterado com sucesso";
    }
}
