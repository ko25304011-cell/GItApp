<%@ page language = "java" content Type ="text/html; charset=UTF-8" import="java.util.*"%>
<!DOCTYPE html>

<html lang="ja">
    <head>
        <meta charset=" UTF-8">
        <title>Submit Example</title>
    </head>
    <body>
        <form action = "GitInpurServlet" method = "get">
            <label for = "name">名</label>
            <label for = "caste">姓</label>
            <input type="text" id = "name" name=" name">
            <input type="text" id = "caste" cast="caste">
            <input type="submit" value ="送信">
        </form>
    </body>
</html>