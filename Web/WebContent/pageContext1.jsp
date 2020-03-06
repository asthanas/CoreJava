<%
 String uid = request.getParameter("uid");

 out.println("<h2>Hello, "+ uid);
 pageContext.setAttribute("name", uid, PageContext.SESSION_SCOPE);
%>
<hr>
</h2>
<a href="pageContext2.jsp">Next Page</a>