package com.devrenata.filmes.repository;

import com.devrenata.filmes.model.Genero;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface GeneroRepository extends PagingAndSortingRepository<Genero,Integer>{
    
}
