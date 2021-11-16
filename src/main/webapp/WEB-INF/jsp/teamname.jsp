<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "iplapp" prefix="ipl" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir= "/WEB-INF/tags" prefix="ipltag"  %>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style><%@include file="/WEB-INF/style.css"%></style>
</head>

<body>
<ipltag:header headertext="HEADER"></ipltag:header>

<ipl:teamName var = "AttRCB" teamName = "RCB" basic = "true"/>
<ipl:teamName var = "AttCSK" teamName = "CSK" basic = "true" />
<ipl:teamName var = "AttRR" teamName = "RR" basic = "true"/>
<ipl:teamName var = "AttKKR" teamName = "KKR" basic = "true"/>
<ipl:teamName var = "AttDC" teamName = "DC" basic = "true"/>
<ipl:teamName var = "AttMI" teamName = "MI" basic = "true" />
<ipl:teamName var = "AttPK" teamName = "PK" basic = "true"/>
<ipl:teamName var = "AttSH" teamName = "SH" basic = "true"/>


<table>
<tr>
<th>Frenchaices</th>
<th>CaptainName</th>
</tr>
<tr>
<ipltag:teamnametag teamdetails ="${AttRCB}"></ipltag:teamnametag>
<ipltag:teamnametag teamdetails ="${AttCSK}"></ipltag:teamnametag> 
<ipltag:teamnametag teamdetails ="${AttRR}"></ipltag:teamnametag>
<ipltag:teamnametag teamdetails ="${AttKKR}"></ipltag:teamnametag> 
<ipltag:teamnametag teamdetails ="${AttDC}"></ipltag:teamnametag>
<ipltag:teamnametag teamdetails ="${AttMI}"></ipltag:teamnametag> 
<ipltag:teamnametag teamdetails ="${AttPK}"></ipltag:teamnametag>
<ipltag:teamnametag teamdetails ="${AttSH}"></ipltag:teamnametag> 
</tr>
</table>

<div id="btnContainer">
  <button class="btn" onclick="listView()"><i class="fa fa-bars"></i> List</button> 
  <button class="btn active" onclick="gridView()"><i class="fa fa-th-large"></i> Grid</button>
<!--   <button class="btn active" onclick="tableView()"><i class="fa fa-table"></i> Table</button> -->
</div>
<br>

<div class="row">
  <div class="column" style="background-color: lightblue;">
    <img src="Resource/images/RCB.jpg" alt="Girl in a jacket" width="50" height="60">
    <h2>${AttRCB.teamName}</h2><br>
    <h3>${AttRCB.CaptainName}</h3> 
  </div>
  <div class="column" style="background-color: lightblue;">
   <img src="Resource/images/CSK.png" alt="Girl in a jacket" width="50" height="60">
   <h2>${AttCSK.teamName}</h2><br>
    <h3>${AttCSK.CaptainName}</h3>
  </div>
  <div class="column" style="background-color: lightblue;">
  <img src="Resource/images/RR.png" alt="Girl in a jacket" width="50" height="60">
   <h2>${AttRR.teamName}</h2><br>
    <h3>${AttRR.CaptainName}</h3>
  </div>
  <div class="column" style="background-color: lightblue;">
  <img src="Resource/images/KKR.jpg" alt="Girl in a jacket" width="50" height="60"> 
    <h2>${AttKKR.teamName}</h2><br>
    <h3>${AttKKR.CaptainName}</h3>
  </div>
</div>

<div class="row">
  <div class="column" style="background-color: lightblue;">
    <img src="Resource/images/DC.jpg" alt="Girl in a jacket" width="50" height="60">
    <h2>${AttDC.teamName}</h2><br>
    <h3>${AttDC.CaptainName}</h3>
  </div>
  <div class="column" style="background-color: lightblue;">
   <img src="Resource/images/MI.jpg" alt="Girl in a jacket" width="50" height="60">
   <h2>${AttMI.teamName}</h2><br>
   <h3>${AttMI.CaptainName}</h3>
  </div>
  <div class="column" style="background-color: lightblue;">
<!--    <img src="Resource/images/RCB.jpg" alt="Girl in a jacket" width="50" height="60"> -->
   <h2>${AttPK.teamName}</h2><br>
   <h3>${AttPK.CaptainName}</h3>
  </div>
  <div class="column" style="background-color: lightblue;">
    <img src="Resource/images/SH.jpg" alt="Girl in a jacket" width="50" height="60">
    <h2>${AttSH.teamName}</h2><br>
    <h3>${AttSH.CaptainName}</h3>
  </div>
</div>




<script>
var elements = document.getElementsByClassName("column");

var i;
function listView() {
  for (i = 0; i < elements.length; i++) {
    elements[i].style.width = "100%";
  }
}

function gridView() {
  for (i = 0; i < elements.length; i++) {
    elements[i].style.width = "50%";
  }
}
/* function tableView() {
	  for (i = 0; i < elements.length; i++) {
	    elements[i].style.width = "50%";
	  }
}
 */
var container = document.getElementById("btnContainer");
var btns = container.getElementsByClassName("btn");
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function() {
    var current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
</script>




      
<ipltag:footer footertext="FOOTER"></ipltag:footer>
  
  
</body>
</html>