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
	String id = (String)session.getAttribute("id");
	String pw = (String)session.getAttribute("pw");
	%>
	
	<p> 세션 설정이 성공했습니다 <br>
	<p><%=id %>님 환영합니다.
</body>
</html>