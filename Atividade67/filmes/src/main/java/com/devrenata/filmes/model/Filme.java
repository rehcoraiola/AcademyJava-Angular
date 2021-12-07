package com.devrenata.filmes.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String nomeDiretor;

    @Getter @Setter
    private String genero;   
    
    // public void setGenero(String genero) {
    //     this.genero = genero;
    // }
    // public void setId(int id) {
    //     this.id = id;
    // }
    // public void setNome(String nome) {
    //     this.nome = nome;
    // }
    // public void setNomeDiretor(String nomeDiretor) {
    //     this.nomeDiretor = nomeDiretor;
    // }
    // public String getGenero() {
    //     return genero;
    // }
    // public int getId() {
    //     return id;
    // }
    // public String getNome() {
    //     return nome;
    // }
    // public String getNomeDiretor() {
    //     return nomeDiretor;
    // }
}