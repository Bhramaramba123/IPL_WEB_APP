<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="ipl" uri= "iplapp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir= "/WEB-INF/tags" prefix="ipltag"  %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<ipltag:header headertext="HEADER"></ipltag:header>

<table>
	<tr>
		<td>  <ipl:teamName teamName = "CSK" basic = "true"/>    </td>		
	</tr>
</table>
<ipltag:footer footertext="FOOTER"></ipltag:footer>
</body>
</html>