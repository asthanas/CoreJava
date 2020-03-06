<%
String uid = pageContext.getAttribute("name", PageContext.SESSION_SCOPE).toString();

out.println("<h2>Hello , "+ uid);

%>