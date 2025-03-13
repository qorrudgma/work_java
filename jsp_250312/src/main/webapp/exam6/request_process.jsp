<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(request.getParameter("id").equals("admin")
			&&request.getParameter("pw").equals("admin1234")){

		//response.sendRedirect("request.jsp?id="+URLEncoder.encode(r_id, "UTF-8"));
		//response.sendRedirect("request.jsp?pw="+URLEncoder.encode(r_pw, "UTF-8"));
		
		out.print("전송된 요청 파라미터: id=" +id+"pw:"+pw );
	}else{
		response.sendRedirect("request.jsp");
	}
	
	//request.getQueryString(): 전송된 데이터들 봄
	// url에서 ?이후부터가QueryString이다 키와 값으로 되어있다
	String value = request.getQueryString();
	out.print("전송된 요청 파라미터:"+value);
	
%>