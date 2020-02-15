package co.zoomin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/welcome")
//@WebFilter("/*")
public class ZoominFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String uid=request.getParameter("uid");
		String pwd=request.getParameter("pwd");
		
		if(uid.contentEquals("admin")&&pwd.contentEquals("123"))
			chain.doFilter(request, response);
		else {
			PrintWriter out = response.getWriter();
			out.println("<p style=font-size:20px;text-align:center;color:red>Invalid Username/Password </p>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		/*
		 	PrintWriter out = response.getWriter();
			out.println("<p style=font-size:40px;text-align:center;color:red;margine-top:100px>Invalid Username/Password </p>");
		 */
	}

	public void destroy() {}

}
