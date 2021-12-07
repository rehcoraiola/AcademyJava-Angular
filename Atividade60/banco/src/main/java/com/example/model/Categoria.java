package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
}
