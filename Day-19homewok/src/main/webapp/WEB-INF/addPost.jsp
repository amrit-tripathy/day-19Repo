<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="addPost" method="post">
        <label for="id">ID:</label>
        <input type="number" id="id" name="id" required>
        <br><br>
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required>
        <br><br>
        <label for="content">Content:</label>
        <textarea id="content" name="content" required></textarea>
        <br><br>
        <label for="author">Author:</label>
        <input type="text" id="author" name="author" required>
        <br><br>

        <button type="submit">Add Post</button>
    </form>
</body>
</html>