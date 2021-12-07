package com.example.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class ConnectionFactory {
    private EntityManager entityManager;
    
    public ConnectionFactory(){
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("banco");
        this.entityManager=factory.createEntityManager(); 
    }
    public EntityManager getConnection(){
        return entityManager;
    }
}
