<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <pre>
<sp:form action="InsertDepartment" method="post" modelAttribute="department">
	Enter Department No: <sp:input path="deptno" />
	Enter Department Name: <sp:input path="dname" />
	Enter Department Location: <sp:input path="loc" />
	<input type="submit" />
</sp:form>
</pre>
</body>
</html>