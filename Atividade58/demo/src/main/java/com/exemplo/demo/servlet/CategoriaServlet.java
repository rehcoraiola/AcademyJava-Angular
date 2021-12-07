package com.exemplo.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.exemplo.demo.dao.CategoriaDao;
import com.exemplo.demo.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao=new CategoriaDao();
        Categoria model=new Categoria();

     

        model.setNome(req.getParameter("nome"));
        model.setDesc(req.getParameter("desc"));
        model.setId(dao.insert(model));

        
        req.setAttribute("id",model.getId());


        RequestDispatcher rd = req.getRequestDispatcher("categoria-sucesso.jsp");//reencaminhar para outro lugar
        rd.forward(req, resp);

        //PrintWriter out=resp.getWriter();
        //out.printf("Categoria salva com id %d",model.getId());
    }
    
}