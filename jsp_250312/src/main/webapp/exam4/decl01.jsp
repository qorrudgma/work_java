<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int num=337;
		
		public int getInt(){
			return num;
		}
	%>
	<%= getInt() %>
	<!-- ------ -->
	<%!
		int num1=-337;
		
		public int getInt1(int a){
			if(a<0){
				a=-a;
			}
			return a;
		}
	%>
	<%= getInt1(num1) %>
</body>
</html>