<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="magic.member.MemberBean" id="mb"></jsp:useBean>
<jsp:setProperty property="*" name="mb"/>
<%
	String uid = (String) session.getAttribute("userID");
	mb.setMem_uid(uid);
	MemberDBBean manager = MemberDBBean.getInstance();
	int re = manager.updateMember(mb);
	if(re== 1){
		%>
			<script>
				alert("입력하신대로 회원정보가 수정되었습니다.");
				location.href="main.jsp";
			</script>
		<%
	}else{
		%>
			<script>
				alert("수정이 실패되었습니다.");
				location.href="main.jsp";
			</script>
		<%
	}
	
%>
