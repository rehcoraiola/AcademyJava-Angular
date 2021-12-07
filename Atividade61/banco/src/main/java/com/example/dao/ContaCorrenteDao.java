package com.example.dao;

import javax.persistence.EntityManager;


import com.example.model.ContaCorrente;

import java.util.List;

public class ContaCorrenteDao {
    private EntityManager entityManager;
  
    public ContaCorrenteDao() {
      this.entityManager=new ConnectionFactory().getConnection();  
    }

    public void create(ContaCorrente model){
        this.entityManager.getTransaction().begin();
        //insert
        this.entityManager.persist(model); 
        this.entityManager.getTransaction().commit();
    }

    public List<ContaCorrente> read(){ 
        return this.entityManager.createQuery("SELECT c FROM ContaCorrente c",ContaCorrente.class).getResultList();
    }

    public void update(ContaCorrente model){ 
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model); 
        this.entityManager.getTransaction().commit();
    }

    public void delete(int id){ //errooo
        ContaCorrente model=this.entityManager.find(ContaCorrente.class, id); //(tabela, campoda classe)
        if(model!=null){
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(model); 
            this.entityManager.getTransaction().commit();
        }
       
    }
    
}