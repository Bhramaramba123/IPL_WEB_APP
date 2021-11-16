<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri= "iplapp" prefix="ipl"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir= "/WEB-INF/tags" prefix="ipltag"  %>
    
<!DOCTYPE html>
<html>
<head>
<title>Team</title>
</head>
<body>
<ipltag:title titletext="${team.teamName}"></ipltag:title>

<ipltag:header headertext="${team.teamName}"></ipltag:header>


<div>
<ipltag:edittag edit ="Basic Edit Options" ></ipltag:edittag>
</div>


 <ipltag:teamtag team = "${team}" /> 	
<%-- <jsp:include page="basicteam.jsp" />   --%>
<ipltag:footer footertext="${team.teamName}"></ipltag:footer>

</body>
</html>