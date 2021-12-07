<%
    int id= (int)request.getAttribute("id");
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
    <h4>Cadastro do id <%= id %></h4>
    <a href="/demo-1/categoria/listar">Categoria Listar</a>
</body>
</html>