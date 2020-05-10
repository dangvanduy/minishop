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
	String ten = (String)request.getAttribute("tendangnhap") ;

%>
<h3><%=ten %></h3>	
<a href="chitiet/12;tensp=aa">Trang Chi Tiet</a>
<form action="chitiet" method="post">
	<input type="text" name="name"/>
	<input type="submit" value="aaaaaaaaaaas">
</form>
</body>
</html>