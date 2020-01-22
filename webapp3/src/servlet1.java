

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
public class servlet1 extends HttpServlet {
	String name;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		name =  request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("User", name);
		out.println("<a href='servlet2'>Click for servlet2</a>");
	}

}
