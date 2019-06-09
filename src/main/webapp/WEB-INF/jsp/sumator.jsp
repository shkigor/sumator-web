<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/css/style.css">
    <title>Сумматор</title>
</head>
<body>
<h1>Сумматор</h1>
<form method="post" action="/sumator">
    <input type="text" name="number1" placeholder="Enter first number" value="${number1}">
    <label for="number2">+</label>
    <input type="text" name="number2" placeholder="Enter second number" value="${number2}">
    <label for="result">=</label>
    <input type="text" name="result" placeholder="Result" value="${result}">
    <button type="submit" value="Calculate">Подсчитать</button>
</form>
</body>
</html>