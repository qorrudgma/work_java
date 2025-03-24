<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="script.js" type="text/javascript"></script>
</head>
<body>
	<form name="reg_frm" method="post" action="registerOk.jsp">
		<table border="1" align=center>
			<tr height="50">
				<td colspan="2" align="center">
				<h1>회원 가입 신청</h1>
				<p>'*' 표시 항목은 필수 입력 항목입니다.</p>
				</td>
			</tr>
			<tr height="30">
				<td width="80">User ID</td>
				<td><input type="text" name="mem_uid" size="20">*</td>
			</tr>
			<tr height="30">
				<td width="80">암호</td>
				<td><input type="password" name="mem_pwd" size="20">*</td>
			</tr>
			<tr height="30">
				<td width="80">암호 확인</td>
				<td><input type="password" name="chk_pw" size="20">*</td>
			</tr>
			<tr height="30">
				<td width="80">이 름</td>
				<td><input type="text" name="mem_name" size="20">*</td>
			</tr>
			<tr height="30">
				<td width="80">E-mail</td>
				<td><input type="email" name="mem_email" size="30">*</td>
			</tr>
			<tr height="30">
				<td width="80">주 소</td>
				<td><input type="text" name="mem_addr" size="40"></td>
			</tr>
			<tr>
				<td colspan = "2" align="center">
<!-- 				submit 버튼 2개를 사용하지 못하기 때문에 button 을 많이 사용한다 -->
				<input type="button" value="등록" onclick="check_ok()">
				<input type="reset" value="다시입력">
				<input type="button" value="가입안함" onclick="location.href='login.jsp'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>