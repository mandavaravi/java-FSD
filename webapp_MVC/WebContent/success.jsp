<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ page import="com.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
loginClass lc = (loginClass)request.getAttribute("Model");
out.println("Hi, " + lc.getUsername() );

%>
</body>
</html>