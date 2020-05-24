<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personel Bilgileri</title>
<style>
.error{color:red;}
</style>
</head>
<body>
<f:form action="saveform" method="GET" modelAttribute="kisi">
First Name: <f:input path="firstName"/><f:errors path="firstName" cssClass="error"/> <br><br/>

Last Name: <f:input path="lastName" /> <br><br/>

Salary:<f:input path="salary"/><f:errors path="salary" cssClass="error" /><br/><br/>
<!--  Department: <f:select path="department">
	<f:option value="HR" label="Human Resources"/>
	<f:option value="AC" label="Accounting" />
	<f:option value="SA" label="Sales"/>
	<f:option value="OR" label="Production"/>
	</f:select>    --> 

Rest Day: <f:input path="restDay"/> <f:errors path="restDay" cssClass="error" /><br/><br/>
	
PostalCode:<f:input path="postalCode"/><f:errors path="postalCode" cssClass="error" /><br/><br/>

Department : <f:select path="department">
			<f:options items="${kisi.departments}"/>
</f:select><br/><br/>

Gender : <f:radiobutton path="gender" value="M"/>Male
		 <f:radiobutton path="gender" value="F"/>Female
		 
		 <br/><br/>
Side Benefits :<br>
<f:checkbox path="sideBenefits" value="araba"/>Araba<br>
<f:checkbox path="sideBenefits" value="yemek"/>Yemek<br>
<f:checkbox path="sideBenefits" value="saglik sigortasi"/>Sigorta<br>
 
 
<input name="Gonder" type="Submit" />
</f:form>
</body>
</html>