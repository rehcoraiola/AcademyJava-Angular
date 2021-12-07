package com.devrenata.filmes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "serie")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String nomeDiretor; 

    @Getter @Setter
    @ManyToOne      //Ligação feito de Genero(Many) para serie(one)
    private Genero genero; 
}