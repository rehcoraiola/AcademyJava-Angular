package com.exemplo.demo.servlet;

import java.io.IOException;

import com.exemplo.demo.dao.CategoriaDao;
import com.exemplo.demo.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/alterar")
public class CategoriaAlterarServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("id"));
        String nome= req.getParameter("nome");

        Categoria model=new Categoria();
        model.setId(id);
        model.setNome(nome);

        CategoriaDao dao=new CategoriaDao();
        dao.update(model);

        RequestDispatcher rd=req.getRequestDispatcher("/categoria-alterado-sucesso.jsp");
        rd.forward(req, resp);
    }
}