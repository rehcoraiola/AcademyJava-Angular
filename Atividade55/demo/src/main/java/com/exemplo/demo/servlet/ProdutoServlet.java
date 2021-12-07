package com.exemplo.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/produto")
public class ProdutoServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String nome = req.getParameter("name");
        String valor= req.getParameter("valor");
        String idCategoria = req.getParameter("idCat");

        if(valor != null && idCategoria != null){
            float vl= Float.parseFloat(valor);
            int id= Integer.parseInt(idCategoria);
            out.printf("Servlet Produto \t %s  R$: %.2f \t Id: %d",nome,vl,id);
        }else{
            out.printf("Servlet Produto \t %s",nome);
        }
    }
}
