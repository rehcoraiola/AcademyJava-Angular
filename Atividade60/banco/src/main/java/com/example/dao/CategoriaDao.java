package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Categoria;



public class CategoriaDao {
    private EntityManager entityManager;

    public CategoriaDao(){
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("banco");
        this.entityManager=factory.createEntityManager(); 
    }
    public void create(Categoria model){        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);             //insert
        this.entityManager.getTransaction().commit();
        //return model.getId(); Se quiser retornar o id criado
    }

    public List<Categoria> read(){ 
        return this.entityManager.createQuery("SELECT c FROM Categoria c",Categoria.class).getResultList();
    }

    public void update(Categoria model){ 
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model);   //Busca a linha e altera o que esta diferente
        this.entityManager.getTransaction().commit();
    }

    public void delete(int id){ //errooo
        Categoria model=this.entityManager.find(Categoria.class, id); //(tabela, campoda classe)
        if(model != null){
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(model); 
            this.entityManager.getTransaction().commit();
        } 
    }
    
}