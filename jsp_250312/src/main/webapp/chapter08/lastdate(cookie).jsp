<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie lastDate = null;
	String msg = "";	// 화면 출력 메시지
	boolean found = false;
	String newValue = "" + System.currentTimeMillis(); //현재 시간 정보를 위한 값(long타입)
	Cookie[] cookies = request.getCookies();
	
	if(cookies != null){
		out.print("@# cookies.length=> "+cookies.length);
		
		for(int i=0; i<cookies.length; i++){
			lastDate = cookies[i];
			// 반복하면서 쿠키 이름이lastDateCookie가 있으면 처음 방문이 아님
			if(lastDate.getName().equals("lastDateCookie")){
				found=true;
				break;
			}
		}
		if(!found){ // 첫방문이라는 뜻
			msg = "처음 방문입니다...";
			// 처음 방문일때 쿠키를 생성
			lastDate = new Cookie("lastDateCookie",newValue);
			// 쿠키 만드는 1,2,3단계
			lastDate.setMaxAge(365*24*60*60);
			lastDate.setPath("/");
			response.addCookie(lastDate);
		}else{	// 첫방문이 아님
			//String conv = lastDate.getValue();
			long conv = Long.parseLong(lastDate.getValue());
			// Date 객체로 의미있는 시간 정보를 출력
			msg="당신의 마지막 방문 :" + new Date(conv);
			//다음 방문을 위한 값
			lastDate.setValue(newValue);
			response.addCookie(lastDate);
		}
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><%= msg %></h2>
</body>
</html>