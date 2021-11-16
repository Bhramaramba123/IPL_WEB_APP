<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="headertext" type="java.lang.String"%>


<style>
.myDiv {
  border: 5px outset red;
  background-color: lightblue;
  
}
.myDiv.h3
{
 text-align: right;
}
.h4
{
 text-align: left;
}

</style>

<div class="myDiv">
<h3>${headertext}</h3>
</div>



