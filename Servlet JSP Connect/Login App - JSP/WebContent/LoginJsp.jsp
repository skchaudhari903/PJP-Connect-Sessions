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
String userName = request.getParameter("uname");
String password = request.getParameter("pwd");
if(userName.equals("Admin") && password.equals("wipro@123")){
	out.print("<font color=green><b>Welcome Admin !</b></font>");
}else{
	out.print("<font color=red><b>Invalid user name or password</b></font>");
}
%>
</body>
</html>