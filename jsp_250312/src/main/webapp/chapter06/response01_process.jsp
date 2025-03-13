<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response01_process</title>
</head>
<body>
	<%
		String userid = request.getParameter("id");
		String userpw = request.getParameter("pw");
		
		if(userid.equals("aaa")&&userpw.equals("1234")){
			response.sendRedirect("response01_success.jsp");
		}else{
			response.sendRedirect("response01_fail.jsp");		
		}
	%>
</body>
</html>