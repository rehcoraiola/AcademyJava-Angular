package com.exemplo.demo.models;

public class Categoria {
    private int id;
    private String nome;
    private String desc;

    public Categoria(){}


    public Categoria(int id, String nome){
        this.id=id;
        this.nome=nome;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public String getNome() {
        return nome;
    }
}
