<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<h1>Add New Player Form</h1>
<form action="PlayerServlet_addplayer" method="post">
<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
					<tr>
					<td>Gender</td>
					<td><input type="text" name="gender" /></td>
				</tr>
				<tr>
					<td>Place</td>
					<td><input type="text" name="place" /></td>
				</tr>
				<tr>
					<td>PrimaryRole</td>
					<td><input type="text" name="primaryrole" /></td>
				</tr>
				<tr>
					<td>IsCaptain</td>
					<td><input type="text" name="iscaptain" /></td>
				</tr>
				
				<tr>
					<td>IsWicketKeeper</td>
					<td><input type="text" name="iswicketkeeper" /></td>
				</tr>
				<tr>
					<td>TeamName</td>
					<td><input type="text" name="teamname" /></td>
				</tr>
</table>
			<input type="submit" value="Submit" />
			
</form>

</body>
</html>