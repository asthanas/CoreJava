package co.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcomepage")
public class WelcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body style=background:linear-gradient(90deg,coral,yellow,coral)>");
		out.println("<h2 align=center>Zoomin Limited</h2>");
		out.println("<img style=display:block;margin:auto;width:150;border-radius:15px src=images/p2.jpg>");
		out.println("<hr>");
		out.println("<h3>Hello, " + request.getParameter("uid") + "</h3><hr>");
		out.println("</body></html>");
		
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies) {
		String uid = c.getName();
		String value = c.getValue();
		out.println(uid+" - "+value+"<br>");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
