<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>declaration01</title>
</head>
<body>
	<%-- <% %> : 스크립트 릿으로 자바코드 기술 --%>
	<%-- <%! %> : 변수, 메소드 선언 --%>
	<%! int data = 50; %>
	<%
		out.print("value of the variable is : " + data);
	%>
</body>
</html>