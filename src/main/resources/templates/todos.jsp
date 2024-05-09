<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>ToDo List</title>
</head>
<body>
<h1>ToDo List</h1>
<ul>
    <!-- Loop through the todos using Thymeleaf expression -->
    <li th:each="todo : ${todos}" th:text="${todo}"></li>
</ul>
</body>
</html>