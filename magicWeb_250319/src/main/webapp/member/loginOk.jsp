<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@page import="java.lang.reflect.Member"%>
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
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberDBBean manager = MemberDBBean.getInstance();
		int check = manager.userCheck(id, pwd);
		MemberBean mb = manager.getMember(id);
		
		if(mb == null){
			%>
			 <script>
			 	alert("존재하지 않는 회원");
			 	history.go(-1);
			 </script>
			<%
		}else{
			String name = mb.getMem_name();
			if(check == 1){
				session.setAttribute("userID",id);
				session.setAttribute("userName",name);
				session.setAttribute("Member", "yes");
				response.sendRedirect("main.jsp");
			}else if(check == 0) {
				%>
				 <script>
				 	alert("비밀번호가 맞지 않습니다.");
				 	history.go(-1);
				 </script>
				<%
			}
			else{// 아이디가 불일치(로직상 경우에 맞지 않음)
				%>
				 <script>
				 	alert("아이디가 맞지 않습니다.");
				 	history.go(-1);
				 </script>
				<%
			}
		}
	%>
</body>
</html>