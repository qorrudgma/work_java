<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="h01.jsp"></jsp:include>
	<%-- <%!
		public String getMonth(){
			Calendar cal=Calendar.getInstance();
			cal.add(Calendar.MONTH, 2);
			
			int year=cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH)+1;
			int days = cal.get(Calendar.DATE);
			
			return year+"-"+month+"-"+days;
		}
	%>
	<br>
	<%= getMonth() %> --%>
	<%!
		Calendar cal=Calendar.getInstance();
	%>
	<%= cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE) %>
</body>
</html>