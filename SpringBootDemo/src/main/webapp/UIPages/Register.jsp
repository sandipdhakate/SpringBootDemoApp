<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
<h2>Enter bellow the employee details to get registered</h2>
<form action="addEmployee" method="Post">
Employee ID : <input type="number" name="Id">
First name : <input type="text" name="firstName">
Last name : <input type="text" name="lastName">
Age : <input type="number" name="age">
salary : <input type="number" name="salary">
<input type="submit">
</form>
</body>
</html>