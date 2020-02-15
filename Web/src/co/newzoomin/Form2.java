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


@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("t1");
		String s2 = request.getParameter("t2");
		String s3 = request.getParameter("t3");
		
		HttpSession session = request.getSession();
		session.setAttribute("Name", s1);
		session.setAttribute("Age", s2);
		session.setAttribute("Address", s3);
		
		/*
		Cookie c1= new Cookie("Name", s1);
		Cookie c2= new Cookie("Age", s2);
		Cookie c3= new Cookie("Address", s3);
		c1.setMaxAge(60*60*24*90);
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		*/
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<body bgcolor=cyan>");
		out.println("<h2>"+session.getId()+" - "+session.isNew()+"</h2>" );
		out.println("<form action=Form3>");
		out.println("<h2>");
		out.println("Years of Exp <input type=text name=t4 size=25> <br><br>");
		out.println("Languages Known <input type=text name=t5 size=25> <br><br>");
		out.println("<input type=submit value=SUBMIT>");
		out.println("</form></body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
