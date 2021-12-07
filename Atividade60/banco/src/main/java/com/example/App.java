package com.example;

import com.example.dao.CategoriaDao;
import com.example.model.Categoria;

public class App 
{
    public static void main( String[] args )
    {
        CategoriaDao dao=new CategoriaDao();
        Categoria model=new Categoria();

        model.setId(1);
        model.setNome("testando JPA");
        dao.create(model); //como foi usado 'persist' já tem o id como retorno
        System.out.println(model.getId());  //retorna o id gerado

        //DELETAR
        dao.delete(2);

        //LISTAR
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s \n ",categoria.getId(),categoria.getNome());
        }
           
    }
}
