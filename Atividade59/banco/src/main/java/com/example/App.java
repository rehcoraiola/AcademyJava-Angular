package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Categoria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sistema do banco" );
        Categoria model=new Categoria();

        model.setNome("testando JPA");

        EntityManagerFactory factory=Persistence.createEntityManagerFactory("banco");
        EntityManager em=factory.createEntityManager();

        List<Categoria> lista=em.createQuery("SELECT c FROM Categoria c",Categoria.class).getResultList(); //select from * categoria; Uso Categoria com 'C' pq é o nome da classe
        for (Categoria categoria : lista) {
            System.out.printf("%d - %s \n ",categoria.getId(),categoria.getNome());
        }

        em.getTransaction().begin();
        //insert
        em.persist(model); 
        em.getTransaction().commit();
    }
}
