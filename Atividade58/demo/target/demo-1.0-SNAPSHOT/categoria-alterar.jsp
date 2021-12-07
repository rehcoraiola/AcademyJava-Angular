<%@ page import="com.exemplo.demo.models.Categoria" %>
<% 
    Categoria model=(Categoria)request.getAttribute("model");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1> Categoria - Alterar</h1>
     <form action="/categoria/alterar" method="post">     <%-- ATENÇÃO ALTERADO categoria/salvar --%>
        id<input type="text" name="id" id="id" value="<%= model.getId() %>"><br/>
        nome<input type="text" name="nome" id="nome" value="<%= model.getNome() %>"><br/>
        <input type="submit" value="Alterar">

    </form>
</body>
</html>