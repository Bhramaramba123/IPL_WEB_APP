<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib tagdir= "/WEB-INF/tags" prefix="ipltag"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Player</title>
</head>
<body>
<ipltag:header headertext="HEADER"></ipltag:header>

<h1>Update Player Form</h1>
<form action="PlayerServlet_updateplayer" method="get">
<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" /></td>
				</tr>
				<tr>
					<td>Second Name</td>
					<td><input type="text" name="secondname" /></td>
				</tr>
				<!-- <tr>
					<td>Team Name</td>
					<td><input type="text" name="teamname" /></td>
				</tr> -->
		
</table>
			<input type="submit" value="Submit" />
			
</form>
<ipltag:footer footertext="FOOTER"></ipltag:footer>
</body>
</html>