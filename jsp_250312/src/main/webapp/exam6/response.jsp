<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
	<%
		response.setIntHeader("Refresh", 5);
		Calendar today=Calendar.getInstance();
	%>
	현재시간은 
	<%=
		today.get(Calendar.HOUR)
			+":"+today.get(Calendar.MINUTE)
			+":"+today.get(Calendar.SECOND)
	%>
	<%
		if(today.get(Calendar.AM_PM)==0){
			out.print("AM");
		}else{			
			out.print("PM");
		}
	%>
	<br>현재시간은
	<%
		Calendar calendar=Calendar.getInstance();
	
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		if(calendar.get(Calendar.AM_PM)==0){
			am_pm="AM";
		}else{
			am_pm="PM";			
		}
		
		String ct=hour+":"+minute+":"+second+" "+am_pm;
		out.print(ct);
	%>
	<br><h2><a href="response_data.jsp">Google 홈페이지로 이동하기</a></h2>
</body>
</html>