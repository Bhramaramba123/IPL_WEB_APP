<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<h1>Delete Player Form</h1>
<form action="PlayerServlet_removeplayer" method="post">
<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" /></td>
				</tr>
		
</table>
			<input type="submit" value="Submit" />
			
</form>

</body>
</html>