<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>param 액션 태그</h3>
	<jsp:include page = "param02_data.jsp">
		<jsp:param value='<%= java.net.URLEncoder.encode("오늘의 날짜와 시각") %>' name="title"/>
		<jsp:param value='<%= java.util.Calendar.getInstance().getTime().toLocaleString() %>' name="date"/>
	</jsp:include>
</body>
</html>