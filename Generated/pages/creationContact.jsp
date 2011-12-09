<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested"%>
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
<bean:message key="firstName.field"/>
</td>
<td align="left" >
<html:text property="toto" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right" >
<bean:message key="lastName.field"/>
</td>
<td align="left" >
<html:text property="lastName" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right" >
<bean:message key="email.field"/>
</td>
<td align="left" >
<html:text property="email" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right" >
<bean:message key="password.field"/>
</td>
<td align="left" >
<html:password property="password" size="20" maxlength="20"/>
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
