<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Red</title>
</head>
<body bgcolor="red">
	<center>
		<h3>[jsp:forward 액션 태그에 대한 예제]</h3>
	</center>
	<hr>
	이 파일은 red02.jsp 입니다.<br>
	웹 브라우저에 배경색이 빨간색으로 나타날까요?<br>
	노란색으로 나타날까요?<br>
	forward 액션 태그가 실행되면 이 페이지의 내용은 출력되지 않습니다.<br>
	<jsp:forward page="yellow02.jsp">
		<jsp:param value="red02.jsp" name="url"/>
		<jsp:param value="Happy New Year!" name="news"/>
	</jsp:forward>
</body>
</html>