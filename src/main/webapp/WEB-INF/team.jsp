<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Team</title>
</head>
<body>

<ol>
<li>Team Name: ${team.teamName}</li>
<li>Team Total six: ${team.totalSix}</li>
<li>Team NetRunRate: ${team.netRunRate}</li>
<li></li>
</ol>

 <c:forEach items = "${team.players}" var = "players" >
         ${players}
      </c:forEach>
</body>
</html>