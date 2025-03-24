<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="script.js" type="text/javascript"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="magic.member.MemberBean" id="mb"></jsp:useBean>
	<jsp:setProperty property="*" name="mb"/>
		<%
			MemberDBBean manager = MemberDBBean.getInstance();
		
			if(manager.confirmID(mb.getMem_uid()) == 1){ // 아이디 중복
				%>
					<script>
						alert('중복되는 아이디가 존재합니다.');
// 						history : 이전 탭으로 이동
						history.back();
					</script>
				<%
			}else{ // 아이디 중복이 아님
				int re = manager.insertMember(mb);
				if(re == 1){
					%>
						<script>
							alert('회원가입을 축하드립니다.\n회원으로 로그인 해주세요.');
							location.href="login.jsp";
						</script>
					<%
				}else{
					%>
						<script>
							alert('회원가입에 실패했습니다.');
							location.href="login.jsp";
						</script>
					<%
				}
			}
		%>
</body>
</html>