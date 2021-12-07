package com.example.filmes.repository;

import com.example.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer>{ //interface - defino os metodos

    
}