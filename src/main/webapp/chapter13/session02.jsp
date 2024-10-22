<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
	<%
		String id = (String)session.getAttribute("id");
		String pw = (String)session.getAttribute("pw");
	%>
	
	<p>설정된 세션의 속성 값 [1] : <%=id %> <br>
	<p>설정된 세션의 속성 값 [2] : <%=pw %> <br>
	<a href="chapter13/session03.jsp">☞ 세션 확인하러 가기 ☜</a>
</body>
</html>