<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%--  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
      <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add new Employee</h2>
<form:form modelAttribute="form">
		<form:errors path="" element="div"/>
		<div>
		<form:label path="empName"> Name</form:label>
		<form:input path = "empName"/>
		<form:errors path = "empName"/>
		</div>
		<div>
		<input type="submit" value="Click here">
		</div>
</form:form>

</body>
</html>