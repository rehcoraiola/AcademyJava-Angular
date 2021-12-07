package com.exemplo.demo.models;

public class Produto {
    private String nome;
    private float valor;
    private int idCat;

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getIdCat() {
        return idCat;
    }
    public String getNome() {
        return nome;
    }
    public float getValor() {
        return valor;
    }
}
