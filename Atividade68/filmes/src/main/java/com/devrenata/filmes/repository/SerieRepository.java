package com.devrenata.filmes.repository;

import com.devrenata.filmes.model.Serie;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface SerieRepository extends PagingAndSortingRepository<Serie,Integer>{
    
}
