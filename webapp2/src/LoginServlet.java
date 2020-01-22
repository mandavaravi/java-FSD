

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	String uName, passW;
    
	public void init() {
		System.out.println("inside init");
	}
	// post method doesn't show the passowrd in urls - so secure
	//  oiutput is the same in get and post, diff is url
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		// out.println("Bonjure Madame ");
		// System.out.println("Wrogn");   //prints in the console
		//System.out.println("inside service method");
		uName = request.getParameter("UserName");
		passW = request.getParameter("Password");
		
		request.setAttribute("User", uName);
		if(uName.equals("r") && passW.equals("r")) {
			//RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			//rd.forward(request, response);  // sends data to another page
			
			response.sendRedirect("servlet2?User=" + uName);  //redirects to another page
			
		}
		else {
			response.sendRedirect("Login.html");
		}
		
	}
	
	public void destroy() {
		System.out.println("inside destroy");
	}

	
	
}
