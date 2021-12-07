package com.example.filmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable=false)
    private String nome;
    private String nomeDiretor;
    private String genero;
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
    public String getGenero() {
        return genero;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeDiretor() {
        return nomeDiretor;
    }
}
