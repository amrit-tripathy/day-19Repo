<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="deletePost" method="post">
        <label for="id">Post ID:</label>
        <input type="number" id="id" name="id" required>
        <br><br>
       <button type="submit">Delete Post</button>
    </form>
</body>
</html>