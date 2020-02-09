package co.zoomin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  out.println("<html><body style=background:linear-gradient(90deg,coral,yellow,coral)>");
		  out.println("<h2 align=center>Zoomin limited</h2>");
		  out.println("<img style=display:block;margin:auto;width:150;border-radius:15px src=images/p2.jpg>");
		  out.println("<hr>");
		  out.println("<h3>Hello, "+request.getParameter("uid")+"</h3><hr>");
		  out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
