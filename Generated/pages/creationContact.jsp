<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<html:html>
<head>
<title>
<bean:message key="add.contact"/>
</title>
</head>
<body>
<html:form action="/AddContact">
<html:errors />
<table>
<tr>
<td align="center" colspan=2>
Please Enter the Following Details</td>
</tr>
<tr>
<td align="right" >
First Name</td>
<td align="left" >
<html:text property="firstName" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right" >
Last Name</td>
<td align="left" >
<html:text property="lastName" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right" >
E-mail address</td>
<td align="left" >
<html:text property="email" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="left" >
<html:submit>Save</html:submit>
</td>
</tr>
</table>
</html:form>
</body>
</html:html>
