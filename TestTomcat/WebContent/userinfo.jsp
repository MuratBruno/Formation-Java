<%@ page import="com.aplose.smooss.beans.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<style>
body{
	background-color: black;
	color: white;
	text-align: center;
}
h1{
	border:10px;
	border-radius:5px;"
}
</style>
</head>
<body>
	
<h1>TEST JSP ACTIONS</h1>
	<jsp:useBean id="userinfo" class="com.aplose.smooss.beans.UserInfo"
		scope="request" />
	<jsp:setProperty property="name" name="userinfo" value="USERTEST" />

	<h2>
		Name Methode JAVA :
		<%=((UserInfo) request.getAttribute("userinfo")).getName()%></h2>
	<h2>
		Name Methode JSP:
		<jsp:getProperty name="userinfo" property="name" /><br>
	</h2>
</body>
</html>