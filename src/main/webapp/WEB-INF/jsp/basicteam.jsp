<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri= "iplapp" prefix="ipl"  %>
<%@ taglib tagdir= "/WEB-INF/tags" prefix="ipltag"  %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<ipltag:header headertext="HEADER"></ipltag:header>

<h3>Team</h3>
<div>
<ul>
<li>Team Name: ${team.teamName}</li>
<li>Team Total six: ${team.totalSix}</li>
<li>Team NetRunRate: ${team.netRunRate}</li>
</ul>
</div> 

<h3>Players</h3>
<ul>
<c:forEach items = "${team.players}" var = "players" >
       <li> ${players} </li>      
</c:forEach>
</ul>

<h3>Members</h3>
<ul>
<c:forEach var = "members" items = "${team.members}"  >
       <li> ${members}</li>
</c:forEach>
</ul> 
<ipltag:teamtag team = "${team}" /> 	

 <ipltag:footer footertext="FOOTER"></ipltag:footer>
     
</body>
</html>