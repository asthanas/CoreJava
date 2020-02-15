package co.newzoomin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Form4")
public class Form4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<body bgcolor=cyan>");
		out.println("<h2>");
		out.println("T1 - "+request.getParameter("t1")+"<br>");
		out.println("T2 - "+request.getParameter("t2")+"<br>");
		out.println("T3 - "+request.getParameter("t3")+"<br>");
		out.println("T4 - "+request.getParameter("t4")+"<br>");
		out.println("T5 - "+request.getParameter("t5")+"<br>");
		out.println("T6 - "+request.getParameter("t6")+"<br>");
		out.println("</body>");
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
