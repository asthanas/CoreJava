<%!String name = "Zoomin";

	int addNum(int x, int y) {
		int s = x + y;
		return s;
	}%>
<h2>
	<%
		int n = 10;
		out.println("My name = " + name + "<hr>");
		out.println("Sum = " + addNum(11, 24));
	%>
</h2>
