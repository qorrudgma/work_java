<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals("admin")&&pw.equals("admin1234")){
// 		Cookie("useID", id) : 쿠키 이름이랑 값
		Cookie cookie_id = new Cookie("useID", id);
		cookie_id.setMaxAge(60*60);// 한시간
		cookie_id.setPath("/");
		response.addCookie(cookie_id);
		response.sendRedirect("welcome.jsp");
	}else{
		response.sendRedirect("cookie.jsp");
	}
%>