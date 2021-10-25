<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<h3>Team</h3>
<ul>
<li>Team Name: ${team.teamName}</li>
<li>Team Total six: ${team.totalSix}</li>
<li>Team NetRunRate: ${team.netRunRate}</li>
</ul>

<h3>Players</h3>

<ul>

<c:forEach items = "${team.players}" var = "players" >
       <li> ${players} </li>
       
</c:forEach>
</ul>

 <h3>Members</h3>
<ul>
<c:forEach items = "${team.members}" var = "members" >
       <li> ${members}</li>
      </c:forEach>
</ul>     
     
     <a href="https://www.w3schools.com/">Visit W3Schools.com!</a>
</body>
</html>