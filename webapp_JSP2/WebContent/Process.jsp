<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="/error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int a = Integer.parseInt(request.getParameter("No1"));
int b = Integer.parseInt(request.getParameter("No2"));
int c= a/b;
out.println("Result : " + c);
%>
</body>
</html>