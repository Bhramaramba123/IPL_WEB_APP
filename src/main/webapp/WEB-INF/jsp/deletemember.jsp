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



<h1>Delete Member Form</h1>
<form action="MemberServletRemoveMember" method="post">
<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" /></td>
				</tr>
		
</table>
			<input type="submit" value="Submit" />
			
</form>




<ipltag:footer footertext="FOOTER"></ipltag:footer>
</body>
</html>