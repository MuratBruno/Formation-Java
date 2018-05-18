<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
        <style type="text/css">
            .errors {
                color: blue;
                font-weight: bold;
            }
            
            .body {
            	body-background: black;
            	color: white;
            
            }
        </style>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css">
    </head>
    <body>
        <div class="container">
            <form:form method="POST" modelAttribute="loginForm">
                <h1><spring:message code='app.page.title'/></h1>
                <div class="form-group">
                    <spring:bind path="username">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fas fa-user"></i>
                                </div>
                            </div>
                            <spring:message code="app.page.placeholder.username" var="placeholderUsername"/>
                            <form:input type="email" class="form-control input_modal"
                                path="username" placeholder="${placeholderUsername}"/>
                        </div>
                        <form:errors cssClass="errors" path="username"/>
                    </spring:bind>
                </div>
                <div class="form-group">
                    <spring:bind path="password">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fas fa-lock"></i>
                                </div>
                            </div>
                            <spring:message code="app.page.placeholder.password" var="placeholderPassword"/>
                            <form:input type="password" class="form-control input_modal"
                                path="password" placeholder="${placeholderPassword}"/>
                        </div>
                        <form:errors cssClass="errors" path="password"></form:errors>
                    </spring:bind>
                </div>
                <button type="submit" class="btn button_submit_modal"
                    id="button_submit_connexion_modal"><spring:message code="app.page.button"/></button>
            </form:form>
            
             <!-- Dropdown for selecting language -->
             <div class="dropdown">
                <button class="btn btn-danger dropdown-toggle" type="button" id="dropdownMenuButton"
                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><spring:message code="app.lang.title"/></button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                   <a class="dropdown-item" href="?lang=fr"><spring:message code="app.lang.french"/></a>
                   <a class="dropdown-item" href="?lang=en"><spring:message code="app.lang.english"/></a>
                   <a class="dropdown-item" href="?lang=cn"><spring:message code="app.lang.chinese"/></a>
                </div>
             </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
          <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>