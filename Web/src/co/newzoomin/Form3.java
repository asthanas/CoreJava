package co.newzoomin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Form3")
public class Form3 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("t4");
		String s2 = request.getParameter("t5");
		
		HttpSession session = request.getSession();
		session.setAttribute("Exp", s1);
		session.setAttribute("Lang", s2);
		
		/*
		Cookie c1= new Cookie("Exp", s1);
		Cookie c2= new Cookie("Lang", s2);
		c1.setMaxAge(60*60*24*30);
		
		response.addCookie(c1);
		response.addCookie(c2);
		*/
		
		response.setContentType("text/html");
		
		
		PrintWriter out= response.getWriter();
		out.println("<body bgcolor=cyan>");
		out.println("<h2>"+session.getId()+" - "+session.isNew()+"</h2>" );
		out.println("<form action=Form4>");
		out.println("<h2>");
		out.println("Expected Salary <input type=text name=t6 size=25> <br><br>");
		out.println("<input type=submit value=SUBMIT>");
		out.println("</form></body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
