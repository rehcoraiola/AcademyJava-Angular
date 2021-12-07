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

@WebServlet(urlPatterns = "/categoria/carregar")
public class CategoriaBuscarIdServlet extends HttpServlet{
    @Override  //ATENÇÃO ALTERADO doGet   
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao=new CategoriaDao();
        Categoria model=new Categoria();

        int id= Integer.parseInt(req.getParameter("id"));
        dao.readById(id);

        RequestDispatcher rd=req.getRequestDispatcher("/categoria-alterar.jsp");
        req.setAttribute("model", model);
        rd.forward(req, resp);

    }
}
