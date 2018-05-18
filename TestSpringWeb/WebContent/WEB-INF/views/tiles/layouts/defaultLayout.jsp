<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:message code="" />
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title" /></title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheetBS"></link>
<link rel="stylesheet" href="<spring:theme code='stylesheet'/>" type="text/css" />
</head>

<body>
	<header id="header">
		<tiles:insertAttribute name="header" />
	</header>

	<section id="sidemenu">
		<tiles:insertAttribute name="menu" />
	</section>

	<section id="site-content">
		<tiles:insertAttribute name="body" />
	</section>

	<footer id="footer">
		<tiles:insertAttribute name="footer" />
	</footer>
</body>
</html>