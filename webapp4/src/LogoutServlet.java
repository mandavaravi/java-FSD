

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();  
        request.getRequestDispatcher("link.html").include(request, response);  
        
        HttpSession session = request.getSession();  
        session.invalidate();
        
        out.print("You are successfully logged out!");    
        out.close();  
	}

}
