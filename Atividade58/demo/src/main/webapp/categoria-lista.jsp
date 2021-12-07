<%@ page import="com.exemplo.demo.models.Categoria, java.util.ArrayList" %>
<% 
    ArrayList<Categoria> categorias=(ArrayList<Categoria>)request.getAttribute("categorias");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>Lista de Categoria</h1>
<form action="/demo-1/categoria/listar" method="get">
    Filtro<input type="text" name="nome" id="nome">
    <input type="submit" value="Filtrar">
</form>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>NOME<th>
            <th><th>
        </tr>
    </thead>
    <tbody>
        <% for (Categoria model : categorias) { %>
        <tr>
            <td><%= model.getId() %></td>
            <td><%= model.getNome() %></td>
            <td>
                <a href="/demo-1/categoria/carregar?id=<%= model.getId() %>">Alterar</a>
                <a href="/demo-1/categoria/deletar?id=<%= model.getId() %>">Deletar</a>
            <td>
        </tr>
        <%}%>
    </tbody>
    </table>
</body>
</html>