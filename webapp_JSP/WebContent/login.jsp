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
String uName,pass;
uName = request.getParameter("UserName");
pass = request.getParameter("Password");
//out.println("uName: " + uName + "  " + "pass: " + pass);
if(uName.equals("rr") && pass.equals("rr")){
	//response.sendRedirect("jsp2.jsp?User= " + uName);  //can also give like-> User= '"+uName+"'");
	// request.getRequestDispatcher("jsp2.jsp").forward(request,response);
	//session.setAttribute("User", uName);
	//pageContext.setAttribute("User", uName, pageContext.SESSION_SCOPE);  //APPLICATION_SCOPE(in both docs) also
	//to use REQUEST_SCOPE we must use request.getRequestDispatcher only 
	//out.println("<a href='jsp2.jsp'>jsp2</a>");
	out.println(config.getInitParameter("servlet1"));
}
else{
	response.sendRedirect("Home.html");
}
%>

</body>
</html>