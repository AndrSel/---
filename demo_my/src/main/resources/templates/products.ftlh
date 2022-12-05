<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo</title>
</head>
<body>
<h1>Demo</h1><hr>
<!--<form action="/" method="get">
    <input type="text" name="title"/><br>
    <input type="submit" value="Поиск"/>
</form>-->
<p>
    <#list products as product>
        <div>
            <p>${product.id} ${product.title} ${product.price} руб.</p>
            <p>${product.description}</p>
            <a href="/product/${product.id}">Подробнее</a>
            <hr>
        <#else>
            <h3>Товаров нет</h3>
        </div>

    </#list>
</p>


<h3>Создать новое объявление</h3>

<form action="/product/create" method="post" enctype="multipart/form-data"><br>
    Название: <input type="text" name="title"/><br>
    Описание: <input type="text" name="description"/><br>
    Цена: <input type="number" name="price"/><br>
    Автор: <input type="text" name="author"/><br>
    Город: <input type="text" name="city"/><br><br>
    1 фотография: <input type="file" name="file1"/><br>
    2 фотография: <input type="file" name="file2"/><br>
    <!--3 фотография: <input type="file" name="file3"/><br>-->
    <input type="submit" value="Добавить объявление"/><br>
</form>




</body>
</html>