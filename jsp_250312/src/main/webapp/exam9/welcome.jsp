<%@page import="java.util.Enumeration"%>
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
		Object id = session.getAttribute("userID");
		
		Enumeration enum_name = session.getAttributeNames();
		
		//열거형이라 반복문 써야함
		while(enum_name.hasMoreElements()){
			String s_id = enum_name.nextElement().toString();
			String s_value = (String)session.getAttribute(s_id);
			
			out.print("<br>얻어온 세션 값 => "+s_value+"<br>");
		}
	

		String s_id = (String)id;
		if(s_id==null){
			response.sendRedirect("session_out.jsp");
		}
	%>
	<a href="session_out.jsp">로그아웃</a>
</body>
</html>