<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Insert title here</title>

    </head>

    <body>

        <form action="file.upload" enctype="multipart/form-data" method="POST">

            <input type="file" name="file"><br>

            <input type="text" name="test"> <br>

            <input type="submit" value="Envoyer">

        </form>

    </body>

</html>