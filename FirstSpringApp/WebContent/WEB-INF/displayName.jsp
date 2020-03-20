<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Name view</title>
</head>
<body>
Today is : ${date} </br>
Hello ${name} </br>

_____________________________<br/>
List of team members

<c:forEach var="temp" items="${team}">
<br/>${temp}
</c:forEach>
</body>
</html>