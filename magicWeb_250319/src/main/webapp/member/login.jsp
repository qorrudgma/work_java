<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="loginOk.jsp">
		<table border="1" align=center>
			<tr height="30">
				<td width=100 align=center>사용자 ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr height="30">
				<td width=100 align=center>비밀번호</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td colspan = "2" align="center">
					<input type="submit" value="로그인">
					<input type="button" onclick= "location.href='register.jsp'" value="회원가입">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>