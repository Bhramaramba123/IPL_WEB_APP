<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ attribute name="team" type="in.co.ipl.model.Team" %>


<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h3>Team from tag</h3>
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
<c:forEach var = "members" items = "${team.members}"  >
       <li> ${members}</li>
</c:forEach>
</ul> 

	




 
   

     
</body>
</html>