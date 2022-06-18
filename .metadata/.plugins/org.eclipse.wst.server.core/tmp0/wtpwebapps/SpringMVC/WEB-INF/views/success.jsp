<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h2>Using Request Param</h2>
<h1>Welcome, ${name } </h1>
<h1>Your Email address is :  ${email }</h1>
<h1>Your password is ${password } try to keep safe.</h1> --%>
<br>
<br>
<%-- <h2>Using Method Attribute</h2>
<h1>Welcome, ${u.name } </h1>
<h1>Your Email address is : ${u.email }</h1>
<h1>Your password is ${u.password } try to keep safe.</h1> --%>

<h6>Using Method Attribute for register controller</h6>

<h1 style ="color:green">${msg }</h1>

<h1>Welcome, ${u.name } </h1>
<h1>Your address is ${u.address }.</h1>
<h1>${u.name } is ${u.gender }.</h1>
<h1>Your Email address is : ${u.email }</h1>
<h1>Your password is ${u.password } try to keep safe.</h1>

</body>
</html>