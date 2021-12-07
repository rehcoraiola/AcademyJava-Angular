package com.devrenata.filmes.repository;

import com.devrenata.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer>{ //interface - defino os metodos

}

