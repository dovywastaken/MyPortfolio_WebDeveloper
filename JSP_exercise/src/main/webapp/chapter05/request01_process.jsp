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
	String id = (String) request.getAttribute("id");
	String pw = (String) request.getAttribute("passwd");
	%>
	
	<p>아이디:<%=request.getAttribute("id")%>
	<p>비밀번호:<%=request.getAttribute("pw")%>
</body>
</html>