<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="teamdetails" type="java.util.HashMap" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tr>
    <td>${teamdetails.teamName}</td>
    <td>${teamdetails.Shortname}</td>
    <td>${teamdetails.CaptainName}</td>
    <td>${teamdetails.PlaceName}</td>
    <td>${teamdetails.CoachName}</td> 
    
  <c:choose> 
        <c:when test= "${teamdetails.Shortname == 'RCB'}" >
                 <td><a href="/webapp/team?name=RCB"><h4><u>Click here to see more details</u></h4></a></td>
        </c:when>
        <c:when test= "${teamdetails.Shortname == 'CSK'}" >
                 <td><a href="/webapp/team?name=CSK"><h4><u>Click here to see more details</u></h4></a></td>
        </c:when>
        <c:when test= "${teamdetails.Shortname == 'RR'}" >
                 <td><a href="/webapp/team?name=RR"><h4><u>Click here to see more details</u></h4></a></td>
        </c:when>
        <c:when test= "${teamdetails.Shortname == 'KKR'}" >
                 <td><a href="/webapp/team?name=KKR"><h4><u>Click here to see more details</u></h4></a></td>
        </c:when>
        <c:when test= "${teamdetails.Shortname == 'DC'}" >
                 <td><a href="/webapp/team?name=DC"><h4><u>Click here to see more details</u></h4></a></td>
        </c:when>
        <c:when test= "${teamdetails.Shortname == 'MI'}" >
                 <td><a href="/webapp/team?name=MI"><h4><u>Click here to see more details</u></h4></a></td>
        </c:when>
        <c:when test= "${teamdetails.Shortname == 'PK'}" >
                 <td><a href="/webapp/team?name=PK"><h4><u>Click here to see more details</u></h4></a></td>
        </c:when>
       
        <c:otherwise>
                 <td><a href="/webapp/team?name=SH"><h4><u>Click here to see more details</u></h4></a></td>
        </c:otherwise>
  </c:choose>
</tr>
  