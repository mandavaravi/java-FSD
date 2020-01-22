

import java.io.*;
import java.sql.*;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		String email = request.getParameter("userEmail");
		String country = request.getParameter("userCountry");
		
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			Statement st = con.createStatement();
			int count = st.executeUpdate("insert into student.register values('" +name+"','" +password+ "','" +email+ "','" + country +"') ");
			out.println(count +"rows updated");
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}

}
