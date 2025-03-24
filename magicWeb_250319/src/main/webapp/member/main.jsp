<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%
 	if(session.getAttribute("Member") == null){
 		%>
 			<jsp:forward page="login.jsp"></jsp:forward>
 		<%
 	}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="logout.jsp">
		<table border="1" align="center">
			<tr align="center">
				<td colspan="2">안녕하세요. <%= session.getAttribute("userName")%>(<%= session.getAttribute("userID")%>) 님</td>
			</tr>
			<tr>
				<td align="center">
					<input type="submit" value="로그아웃">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value="회원정보변경"  onclick="location='memberUpdate.jsp'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>