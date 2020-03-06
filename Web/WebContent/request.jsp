<%!
String uid,pwd;
%>
<h2>
<%
	uid = request.getParameter("uid");
	pwd = request.getParameter("pwd");
	out.println("Username = "+ uid+"<br>");
	out.println("Password = "+ pwd);
%>
<hr>
Server Name : <%=request.getServerName() %> <br>
Server Port : <%=request.getServerPort() %>	<br>
Appliction Path : <%=request.getContextPath() %> <br>
Method : <%=request.getMethod() %>	<br>
Protocal : <%=request.getProtocol() %> <br>
ContentType : <%=request.getContentType() %> <br>
Content Length : <%=request.getContentLength() %> <br>
</h2>