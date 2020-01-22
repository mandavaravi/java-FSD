<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginServlet">

<table align="center" border="">

<tr>
<th > UserName: </th> <td> <input type="text" name="UserName"> </td>
</tr>

<tr>
<th > Password: </th> <td> <input type="password" name="Password" > </td>
</tr>

<tr>
<td><input type="submit" value="Submit"></td>
<td> <input type="reset" value="Reset"> </td>
</tr>

</table>
</form>
</body>
</html>