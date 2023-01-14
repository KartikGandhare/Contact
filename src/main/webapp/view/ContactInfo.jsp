<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http:// www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.BikkatIt.com</title>
</head>
<body bgcolor="pink">

<h3> save contact Here</h3>

<font color='orange'> ${success }</font>
<font color='red'> ${error}</font>

<form:form action="saveContact? contactId=${contact.contactId}"  modelAttribute="contact" method="POST">

<table>
  <tr>
    <td>Contact Name</td>
    <td><form:input path="contactname"/></td>
  </tr>
  
  <tr>
    <td>Contact Email</td>
    <td><form:input path="contactemail"/></td>
  </tr>
  
   <tr>
    <td>Contact Number</td>
    <td><form:input path="contactnumber"/></td>
  </tr>
  
  <tr>
    <td><input type="submit"  value="Save"/></td>
  </tr>
  
</table>


></form:form>

</body>
</html>