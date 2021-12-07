package com.devrenata.filmes.api;
import java.util.List;

import com.devrenata.filmes.model.Filme;
import com.devrenata.filmes.repository.FilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController         //cria um JSON
@RequestMapping("/api/filme")   //Indica a rota unica
public class FilmeApi{  
    @Autowired      //Cria Injeção de dependência -public FilmeApi(FilmeRepository repository) {this.repository = repository;}
    private FilmeRepository repository;

    @GetMapping
    public List<Filme> filmes(String nome){
        if(nome != null){
            return (List<Filme>)repository.findByNome(nome); 
        }
        return (List<Filme>)repository.findAll(); 
    }

    @PostMapping 
    public String salvar(@RequestBody Filme model){ //@RequestBody - diz que vem do corpo os dados
        repository.save(model);
        return "salvo com sucesso";
    }

    @DeleteMapping("/{id}")    
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "deletado com sucesso";
    }

    @PutMapping("/{id}") 
    public String update(@RequestBody Filme model,@PathVariable int id){
        if(model.getId()==id){
            repository.save(model);
            return "redirect:/filme";
        }
        return "id da url diferente do body";
    }


}