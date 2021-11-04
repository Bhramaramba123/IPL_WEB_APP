<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "iplapp" prefix="ipl" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

td, th {
  border: 3px solid #dddddd;
  text-align: center;
  padding: 4px;
}

</style>
<title>Home JSP</title>
</head>
<body>
<a href="/webapp/teamname"><h4><u>TeamNames:</u></h4></a>
<a href="/webapp/team?name=RCB"><h4><u>Rayal Chalengers Bangalore</u></h4></a>
<a href="/webapp/team?name=CSK"><h4><u>Channai Super Kings</u></h4></a>
<table>
  <tr>
    <th>Team Name</th>
    <th>Captain Name</th>
    <th>Place</th>
    <th>More Details</th>
  </tr>
  <tr>
   <td>Royal Challengers Bangalore</td>
    <td>Virat Kohli</td>
    <td>Delhi</td>
    <td><a href="/webapp/team?name=RCB"><h4><u>Click here to see more details</u></h4></a></td>
  </tr>
  <tr>
    <td>Chennai Super Kings</td>
    <td>Mahendra Singh Dhoni</td>
    <td>Ranchi</td>
    <td><a href="/webapp/team?name=CSK"><h4><u>Click here to see more details</u></h4></a></td>
  </tr>
</table>

<table>
	<tr>
		<td>  <ipl:teamName  teamName="CSK" />    </td>	
		${team.teamName}	
	</tr>
</table>

</body>
</html>