<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Submit Example</title>
    </head>
    <body>
        <form action="GitInputServlet" method="GET">
            <label for="name">名</label>
            <input type="text" id="name" name="name" /></br>
            <label for="caste">姓</label>
            <input type="text" id="caste" caste="caste" /></br>
            <input type="submit" value="送信" />
        </form>
    </body>
</html>