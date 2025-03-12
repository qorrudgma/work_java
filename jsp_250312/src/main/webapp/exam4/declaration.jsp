<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>declaration</title>
</head>
<body>
	<%!
		String getString(String data){
			return data.toString();
		}
	%>
	<%
		out.print(getString("Hello, Java Server Pages"));
	%>
	<!-- 강사님 방법 -->
	<%!
		String str="Hello, Java Server Pages";
	
		public String getString(){
			return str;
		}
	%>
	<%
		out.print(getString());
	%>
</body>
</html>