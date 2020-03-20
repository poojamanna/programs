<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User form</title>
</head>
<body>
<form:form action="displayUserInfo" modelAttribute="user">
Name: <form:input path="name"/></br>
Age: <form:input path="age"/></br>
<%-- </p>
Gender: Male: <form:radiobutton path="gender" value="male"/>
        Female: <form:radiobutton path="gender" value="female"/>
        </p> --%>
Fav movies:  <form:checkbox path="movies"  name="like" value="Kabhi khushi kabhi gum"/>Kabhi khushi kabhi gum </br> 
             <form:checkbox path="movies"  name="like" value="Devdas"/>Devdas</br>
             <form:checkbox path="movies"  name="like" value="Main hoon na"/>Main hoon na</br>
             <form:checkbox path="movies"  name="like" value="Dhoom"/>Dhoom   </br>  
        <input type="submit" value="Submit">
</form:form>
</body>
</html>