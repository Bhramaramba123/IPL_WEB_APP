<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri= "iplapp" prefix="ipl"  %>
<%@ taglib uri= "ipltag" prefix="m"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Team</title>
</head>
<body>
<a href="/webapp/player_add"> <h3> Add New Player </h3> </a>
<a href="/webapp/player_remove"><h3> Delete Player </h3> </a>

<a href="/webapp/member_add"><h3>Add New Member </h3> </a>
<a href="/webapp/member_remove"><h3>Delete Member </h3> </a>

 
<jsp:include page="basicteam.jsp" />  
<m:teamtag  page="basicteam.jsp" />  

</body>
</html>