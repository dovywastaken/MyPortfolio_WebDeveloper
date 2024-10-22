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
	

	<h4>----- 세션을 삭제하기 전 -----</h4>
	<p> 설정된 세션 이름 ID : <%=id %>
	<p> 설정된 세션 값 PW : <%=pw %>
	
	<% session.removeAttribute("id");
	%>
	
	<h4>----- 세션을 삭제한 후 -----</h4>
	<p> 설정된 세션 이름 ID : <%=id %>
	<p> 설정된 세션 값 PW : <%=pw %>
	
</body>
</html>