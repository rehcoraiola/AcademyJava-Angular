package com.example;


import com.example.dao.ContaCorrenteDao;
import com.example.model.ContaCorrente;

public class App 
{
    public static void main( String[] args )
    {
         ContaCorrenteDao dao=new ContaCorrenteDao();
         ContaCorrente model=new ContaCorrente();
         
         model.setNome("renata");
         model.setDescricao("cc");

        dao.create(model);
    }
}
