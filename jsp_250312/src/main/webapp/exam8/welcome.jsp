<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		for(int i=0; i<cookies.length; i++){
			if(cookies[i].getName().equals("userID")){
				%>
				<!-- 쿠키 값에 이름과 값이 두개가있는데 쿠키값(value)자체가 id이기 때문에 getValue를 사용한다. -->
				<h4><%= cookies[i].getValue() %>님 반갑습니다.</h4>
				<%
			}
		}
	%>
	<a href="cookie_out.jsp">로그아웃</a>
</body>
</html>