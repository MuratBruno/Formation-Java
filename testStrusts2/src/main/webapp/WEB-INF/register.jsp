<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Enregistrement</title>
</head>
<body>
	<h3>Enregistrez-vous !!!</h3>

	<s:form action="register">
		<s:textfield name="personBean.firstName" label="First name" />
		<s:textfield name="personBean.lastName" label="Last name" />
		<s:textfield name="personBean.email" label="Email" />
		<s:textfield name="personBean.age" label="Age" />
		<s:submit id="submitId" value="Submit" />
		<s:submit id="showId" method="showTest" value="Show" />
	</s:form>
</body>
</html>