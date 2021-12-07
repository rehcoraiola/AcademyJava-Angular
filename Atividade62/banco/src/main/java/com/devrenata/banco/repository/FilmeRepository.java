package com.devrenata.banco.repository;

import com.devrenata.banco.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer>{ //interface - defino os metodos

    
}
