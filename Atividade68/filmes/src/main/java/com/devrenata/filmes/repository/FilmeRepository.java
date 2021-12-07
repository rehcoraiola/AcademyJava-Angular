package com.devrenata.filmes.repository;

import java.util.List;

import com.devrenata.filmes.model.Filme;

import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.CrudRepository;  - Inicio com ele
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmeRepository extends PagingAndSortingRepository<Filme,Integer>{ //interface - defino os metodos

    @Override
    default Iterable<Filme> findAll() {
        return findAll(Sort.by(Sort.Direction.ASC,"id")); //Ordenando pelo ID
    }

    List<Filme> findByNome(String nome); //Ele filtra direto pelo nome sem o WHERE
}

