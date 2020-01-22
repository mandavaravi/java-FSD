

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class aa
 */
public class aa extends HttpServlet {
	String user,pass;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();  
		 request.getRequestDispatcher("link.html").include(request, response);  
		
		user = request.getParameter("UserName");
		pass = request.getParameter("Password");
		request.setAttribute("User", user);
		
		if(user.equals("rrr") && pass.equals("rrr")) {
			HttpSession session=request.getSession();  
	        session.setAttribute("User",user);  
		}
		else {
			out.print("Sorry, username or password error!");  
			request.getRequestDispatcher("Login.html").include(request, response);
		}
		out.close();
	}


}
