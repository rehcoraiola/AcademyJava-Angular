<%@ page import="" %>
<% 
    ArrayList<Categoria> categorias=(ArrayList<categoria>)getAttribute("categoria");
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
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>NOME<th>
        </tr>
    </thead>
    <tbody>
        <% %>
        <tr>
            <th><%= model.getId() %></th>
        </tr>
        <%}%>
    </tbody>
    </table>
</body>
</html>