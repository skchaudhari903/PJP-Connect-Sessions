<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String result=(String)request.getAttribute("result");
String name=request.getParameter("uname");
if (result.equals("Success"))
{
%>
	<h1 style="color:blue">Welcome <%=name %></h1>
<%
}
else
{
%>
	<h1 style="color:red">Sorry <%=name %>, you are not a valid user</h1>
<%
} 
%>
</body>
</html>