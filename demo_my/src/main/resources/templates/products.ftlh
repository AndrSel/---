<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style type="text/css">
        h1 {
            color: blue;
        }
        form {
            padding: 5px;
            border: 1px solid black;
            border-radius: 30px;
            color: white;
            background: rgb(186,3,195);
            background: linear-gradient(90deg, rgba(186,3,195,1) 0%, rgba(255,31,31,1) 50%, rgba(255,0,168,1) 100%);
            margin: 0 20vw;
        }
        .form-elem-wrapper {
            display: flex;
            flex-direction: column;
            justify-content: center;
            border: 2px solid white;
            border-radius: 20px;
            margin: 5px;
        }
        .form-p {
            font-size: 20px;
            font-weight: bold;
            text-shadow: 1px 0 1px #000;
            margin: 3px auto;
        }
        .form-input {
            margin: 0 20px;
            border: 2px solid white;
            border-radius: 5px;
        }
        .submit-div {
            display: flex;
            justify-content: center;
        }
        .submit-input {
            margin: 0 auto;
        }
        .form-input-file {
            margin: 0 auto;
        }


    </style>
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
            <p>${product.title} ${product.price} руб.</p>
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
    <div class="form-elem-wrapper">
        <p class="form-p">Название</p>
        <input class="form-input" type="text" name="title"/><br>
    </div>
    <div class="form-elem-wrapper">
        <p class="form-p">Описание</p>
        <input class="form-input" type="text" name="description"/><br>
    </div>
    <div class="form-elem-wrapper">
        <p class="form-p">Цена</p>
        <input class="form-input" type="number" name="price"/><br>
    </div>
    <div class="form-elem-wrapper">
        <P class="form-p">Автор</P>
        <input class="form-input" type="text" name="author"/><br>
    </div>
    <div class="form-elem-wrapper">
        <p class="form-p">Город</p>
        <input class="form-input" type="text" name="city"/><br>
    </div>
    <div class="form-elem-wrapper">
        <p class="form-p">1 фотография</p>
        <input class="form-input-file" type="file" name="file1"/><br>
    </div>
    <div class="form-elem-wrapper">
        <p class="form-p">2 фотография:</p>
        <input class="form-input-file" type="file" name="file2"/><br>
    </div>
    <!--3 фотография: <input type="file" name="file3"/><br>-->
    <div class="submit-div">
        <input class="submit-input" type="submit" value="Добавить объявление"/><br>
    </div>
</form>




</body>
</html>