<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		Date now = new Date();
		//import 안하면 아래처럼 해야함
		//java.util.Date now = new java.util.Date();
		out.print("Today: " + now);
	%>
</body>
</html>