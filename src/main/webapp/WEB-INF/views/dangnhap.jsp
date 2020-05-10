<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body id="body-login">
	<div id="body-flex-login">
		<div id="container-login">
		<div id="container-login-left">
				<div id="header-top-left" class="header-login">
					<span id="text-logo">Welcome</span><br/>
					<span id="hint-text-logo">Hãy tạo nên phong cách của bạn cùng Minishop ! </span>
				</div>
				
				<div id="header-bottom-left">
					<p><img alt="icon_oval" src='<c:url value="/resources/Image/icon_oval.png" />' /><span>Luôn cập nhật xu hướng thời trang mới nhất </span></p>
					<p><img alt="icon_oval" src='<c:url value="/resources/Image/icon_oval.png" />' /><span>Giảm hơn 50% tất cả các mặt hàng giành cho khách VIP </span></p>
					<p><img alt="icon_oval" src='<c:url value="/resources/Image/icon_oval.png" />' /><span>Tận tình tư vấn để tạo nên phong cách của bạn</span></p>
				</div>
			</div>
			
			<div id="container-login-right">
					
			</div>
			
		</div>
	</div>
	
	
</body>

</html>