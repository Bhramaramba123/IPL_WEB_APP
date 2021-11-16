<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Login Page</title>
	</head>

	<body>
		<!-- <form action="LoginServlet" method="get">

			Please enter your username 		
			<input type="text" name="un"/><br>		
		
			Please enter your password
			<input type="text" name="pw"/>
			
			<input type="submit" value="submit">			
		
		</form> -->
		<form action="LoginServlet" method="post">
Enter username :<input type="text" name="username"> <br>
Enter password :<input type="password" name="password"><br>
<input type="submit" value="Login">
</form>
	</body>
</html>