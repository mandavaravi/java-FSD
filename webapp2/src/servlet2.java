

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servlet2 extends HttpServlet {
	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		/*
		 ServletConfig sc = getServletConfig();
		out.println( sc.getInitParameter("Mobile") );
		ServletContext sc1 = getServletContext();
		out.println(sc1.getInitParameter("Email"));
		*/
		out.println(request.getAttribute("User") + getServletConfig().getServletName());
		
	}

}
