package com.exemplo.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.exemplo.demo.dao.CategoriaDao;
import com.exemplo.demo.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao=new CategoriaDao();
        PrintWriter out=resp.getWriter();
        for (Categoria model : dao.read()) {
            out.printf("%d %s \n", model.getId(),model.getNome());
        }
    }
}
