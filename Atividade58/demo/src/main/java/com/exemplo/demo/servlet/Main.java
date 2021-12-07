package com.exemplo.demo.servlet;

import com.exemplo.demo.dao.CategoriaDao;
import com.exemplo.demo.models.Categoria;

public class Main {
    public static void main(String[] args) {

        CategoriaDao dao=new CategoriaDao();

        for (Categoria c : dao.read()) {
            System.out.println(c.getId());
        }
    }
}
