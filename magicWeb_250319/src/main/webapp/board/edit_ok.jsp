<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");
%>
<jsp:useBean class="magic.board.BoardBean" id="board"></jsp:useBean>
<jsp:setProperty property="*" name="board"/>
<%
    int b_id = Integer.parseInt(request.getParameter("b_id"));
    BoardDBBean db = BoardDBBean.getInstance();
	int result = db.editBoard(board);
	
    if(result == 1){
//     	비밀번호 일치로 글목록 이동
%>
        <script>
            alert("수정되었습니다.");
        </script>
<%
	response.sendRedirect("list.jsp");
    }else if(result==0){// 비밀번호 틀림
%>
        <script>
            alert("비밀번호가 맞지 않습니다.");
            history.back();
        </script>
<%
    }else if(result ==-1){// 삭제 실패
    	%>
        <script>
            alert("수정에 실패했습니다.");
            history.back();
        </script>
<%
    }
%>
