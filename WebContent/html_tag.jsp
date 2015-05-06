<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="img/Penguins.jpg" width="50px">
	<br>
	<a href="table.jsp">table.jsp</a>
	<a href="param?a=10&b=hello">paramServlet.java</a>
	
	<br>
	<form action="param" method="post">
		<input type="text" name="a" value="">
		<br>
		<br>
		<br>
		<input type="text" name="b" value="">
		<br>
		<br>
		<br>
		<input type="submit" value="제출">
		
	</form>
	
</body>
</html>