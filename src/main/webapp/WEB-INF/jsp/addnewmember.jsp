<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib tagdir= "/WEB-INF/tags" prefix="ipltag"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ipltag:header headertext="HEADER"></ipltag:header>

<h1>Add New Member Form</h1>
<form action="MemberServletAddMember" method="post">
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
					<td>Role</td>
					<td><input type="text" name="role" /></td>
				</tr>
				<tr>
					<td>TeamName</td>
					<td><input type="text" name="teamname" /></td>
				</tr>
</table>
			<input type="submit" value="Submit" />
			
</form>
<ipltag:footer footertext="FOOTER"></ipltag:footer>
</body>
</html>