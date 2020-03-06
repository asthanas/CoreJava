<%
String uid = request.getParameter("uid");
String pwd = request.getParameter("pwd");
if(uid.contentEquals("admin") && pwd.contentEquals("123"))
	response.sendRedirect("https://www.google.com");
else
	response.sendError(response.SC_UNAUTHORIZED,"Invalid Username / Password ");
%>
