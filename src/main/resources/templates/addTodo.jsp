<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add ToDo Item</title>
</head>
<body>
<h1>Add ToDo Item</h1>
<%-- Display any error messages --%>
<c:if test="${not empty errorMessage}">
    <p style="color: red">${errorMessage}</p>
</c:if>
<%-- HTML form to add new items --%>
<form method="post" action="/todos/add">
    <input type="text" name="todo" placeholder="Enter a new ToDo item" required>
    <button type="submit">Add</button>
</form>
</body>
</html>l>