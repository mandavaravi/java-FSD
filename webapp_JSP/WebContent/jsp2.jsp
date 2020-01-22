<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//out.println("Welcome " + request.getParameter("UserName"));  
//have to use the same name as in html tag if we use request.getRequestDispatcher in login
//String s = session.getAttribute("User").toString();
String s = (String)pageContext.getAttribute("User",pageContext.SESSION_SCOPE);
out.println("Hello " + s);
%>
</body>
</html>