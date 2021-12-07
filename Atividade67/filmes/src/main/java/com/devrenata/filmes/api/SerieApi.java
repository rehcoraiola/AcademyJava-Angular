package com.devrenata.filmes.api;

import java.util.List;

import com.devrenata.filmes.model.Serie;
import com.devrenata.filmes.repository.SerieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/serie")
public class SerieApi {
    
    @Autowired
    private SerieRepository repo;

    @GetMapping
    public List<Serie> list(){
        return (List<Serie>)repo.findAll();
    }
    @PostMapping
    public String create(@RequestBody Serie model){
        repo.save(model);
        return "Salvo com sucesso";
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        repo.deleteById(id);
        return "Deletado com sucesso";
    }

    //Versão de Update desconsiderando id da URL, apenas o dia do Body
    @PutMapping("{id}")
    public String update(@PathVariable int id, @RequestBody Serie model){
        model.setId(id);
        repo.save(model);
        return"Alterado com sucesso";
    }
}
