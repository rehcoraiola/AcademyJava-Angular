package com.exemplo.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import com.exemplo.demo.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria cat=new Categoria();

        cat.setNome(req.getParameter("name"));
        cat.setDesc(req.getParameter("desc"));
                
        PrintWriter out=resp.getWriter();
        out.printf("Servlet Categoria \t %s - %s",cat.getNome(),cat.getDesc());
    }
    
}