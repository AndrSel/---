<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo</title>
</head>
<body>
<h1>Demo</h1><hr>
<h4>информация об объявлении</h4>
<#list images as img>
<img src="/images/${img.id?if_exists}" height="150px"/><br><br>
</#list>
<b>Название: </b>${product.title?if_exists}<br>
<b>Описание: </b>${product.description?if_exists}<br>
<b>Цена: </b>${product.price?if_exists}<br>
<b>Город: </b>${product.city?if_exists}<br>
<b>Автор: </b>${product.author?if_exists}<br>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить объявление"/>
</form>
</body>
</html>