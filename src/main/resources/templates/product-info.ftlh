<!DOCTYPE HTML>
<html>
<body>
<h1><a href="/" style="text-decoration: none">BUYSELL</a></h1>
<hr>
<h4>Подробная информация о товаре</h4>
<b>Название товара: </b>${product.title}<br>
<b>Описание товара: </b>${product.description}<br>
<b>Цена: </b>${product.price}<br>
<b>Город: </b>${product.city}<br>
<b>Имя: </b>${product.author}<br>
<h3>Создать новый товар</h3>
<form action="/product/delete/${product.id}" method="post">

    <input type= "submit" value="Удалить товар"/>
</form>
</body>
</html>