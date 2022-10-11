<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Hello to Jakarta EE</h1>
<form action="hello-servlet" method="get">
    <h2>Enter your name and send the request</h2>
    <label for="name">Your Name:</label>
    <input type="text" id="name" name="name">
    <input type="submit" value="Send">
</form>
</body>
</html>