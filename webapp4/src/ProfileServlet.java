

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProfileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();  
		request.getRequestDispatcher("link.html").include(request, response);  

        HttpSession session = request.getSession(false);
        if(session!=null){  
            String user=(String)session.getAttribute("User");  
              
            out.print("Hello, "+ user +" Welcome to Profile");  
        }  
        else{  
        	out.print("Please login first");  
        	request.getRequestDispatcher("login1.html").include(request, response);  
        }  
        out.close();
	}
	
}
