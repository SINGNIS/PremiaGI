<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Premia for General Insurance</title>
</head>
<body>
<div align="center" style="border-color: black;border:medium visibility=true;border-bottom-color: green; ">
<div><label>Select Language</label>
<%-- <spring:message code ="label.Language"/> --%>
<a href="/?siteLanguage=en">English</a>
<a href="/?siteLanguage=hi">Hindi</a></div>
<form:form action="login" method="POST" commandName="user">
<div>
<table>
<tr><td><spring:message code="label.UserEmailidx"/></td><td><form:input path="user_emailid" /></td></tr>
<tr><td><spring:message code="label.Passwordx"/></td><td><form:password path="user_password" /></td></tr>
<tr><td><spring:message code="label.Loginx"/></td><td><button type="submit" value="LoginButton">Click Here</button></td></tr>
</table>
</div>
</form:form>
<a href="<%=response.encodeURL("userregister")%>">click here</a>
</div>
</body>
</html>