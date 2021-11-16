<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir= "/WEB-INF/tags" prefix="ipltag"  %>
<%@ taglib uri= "iplapp" prefix="ipl" %>
<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
<%@include file="/WEB-INF/style.css"%>
</style>
</head>

<body>
<ipltag:title titletext="HOMEPAGE"></ipltag:title>
<ipltag:header headertext="HEADER "></ipltag:header>

<a href="/webapp/login"><h4><u>Login: </u></h4></a>
<a href="/webapp/addtoDB"><h4><u>Add player details to DB: </u></h4></a>
<a href="/webapp/teamname"><h4><u>TeamNames: </u></h4></a>

<!-- <a href="/webapp/team?name=RCB"><h4><u>Rayal Chalengers Bangalore </u></h4></a>
<a href="/webapp/team?name=CSK"><h4><u>Channai Super Kings </u></h4></a> -->
<!-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ -->

<table>
<ipltag:tableheadingtag tableheading ="BasicInfo" ></ipltag:tableheadingtag> 
<c:forEach var="team" items="${set}" >
<ipl:teamName var="teamdata" teamName ="${team}" basic = "true"/> 
<ipltag:basictag teamdetails="${teamdata}"></ipltag:basictag>  
</c:forEach>
</table>

<!-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ -->
<ipltag:footer footertext="FOOTER"></ipltag:footer>
</body>
</html>