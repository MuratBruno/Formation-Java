<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>

</head>

<body>

    <form action="MailServlet" method="POST">

        Email : <input type="email" name="email" placeholder="Votre mail"> <br>

        Subject : <input type="text" name="text" placeholder="Votre sujet"> <br>

        Mail Content : 

        <textarea rows="4" cols="50">

        

        </textarea> 

        <br>

        <input type="submit" name="submitInput" value="Envoyer le mail">

    </form>

</body>

</html>