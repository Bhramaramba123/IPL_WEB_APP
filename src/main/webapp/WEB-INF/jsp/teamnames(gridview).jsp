<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "iplapp" prefix="ipl" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir= "/WEB-INF/tags" prefix="ipltag"  %>

<!DOCTYPE html>
<html>
<head>
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

<div id="btnContainer">
  <button class="btn" onclick="listView()"><i class="fa fa-bars"></i> List</button> 
  <button class="btn active" onclick="gridView()"><i class="fa fa-th-large"></i> Grid</button>
</div>
<br>

<div class="row">
  <div class="column" style="background-color:#aaa;">
    <h2>Column 1</h2>
    <p>Some text..</p>
  </div>
  <div class="column" style="background-color:#bbb;">
    <h2>Column 2</h2>
    <p>Some text..</p>
  </div>
</div>

<div class="row">
  <div class="column" style="background-color:#ccc;">
    <h2>Column 3</h2>
    <p>Some text..</p>
  </div>
  <div class="column" style="background-color:#ddd;">
    <h2>Column 4</h2>
    <p>Some text..</p>
  </div>
</div>

<script>
// Get the elements with class="column"
var elements = document.getElementsByClassName("column");

// Declare a loop variable
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