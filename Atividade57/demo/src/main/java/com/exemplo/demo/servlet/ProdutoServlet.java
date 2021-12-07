// package com.exemplo.demo.servlet;
// import java.io.IOException;
// import java.io.PrintWriter;

// import com.exemplo.demo.models.Produto;

// import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
// import jakarta.servlet.http.HttpServlet;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// @WebServlet(urlPatterns ="/produto")
// public class ProdutoServlet extends HttpServlet{
//     @Override
//     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         PrintWriter out=resp.getWriter();

//         Produto model=new Produto();
//         model.setNome(req.getParameter("nome"));
//         model.setValor(Float.parseFloat(req.getParameter("valor")));
//         model.setIdCat(Integer.parseInt(req.getParameter("idCat")));

//         // String nome = req.getParameter("nome");
//         // String valor= req.getParameter("valor");
//         // String idCategoria = req.getParameter("idCat");

//         if(model.getValor() != null && idCategoria != null){
//             float vl= Float.parseFloat(valor);
//             int id= Integer.parseInt(idCategoria);
//             out.printf("Servlet Produto \t %s  R$: %.2f \t Id: %d",nome,vl,id);
//         }else{
//             out.printf("Servlet Produto \t %s",nome);
//         }
//     }
   
// }
