package com.devrenata.banco.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class Agencia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero;
   
    public void setId(int id) {
        this.id = id;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getId() {
        return id;
    }
    public int getNumero() {
        return numero;
    }
    
    
}


