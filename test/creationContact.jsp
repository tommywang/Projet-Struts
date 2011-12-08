<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%><%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<html:html>
<head>
<title>Add Contact</title>
</head>
<body>
This a Form
<html:form action="/AddContact">
<table>
<tr>
<td align="center" colspan=2>
</td>
</tr>
<tr>
<td align="right" >
First name
</td>
<td align="left" >
<html:text property="firstname" size="30" maxlength="30"/>
</td>
</tr>
</table>
</html:form>
</body>
</html:html>
