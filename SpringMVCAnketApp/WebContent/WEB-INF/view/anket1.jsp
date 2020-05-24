<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Anket 1.Sayfa</title>
</head>
<body>
<f:form action="survey2"  modelAttribute="anket">
First Name: <f:input path="firstName"/> <br><br/>
Last Name: <f:input path="lastName" /> <br><br/>
<!--  Department: <f:select path="department">
	<f:option value="HR" label="Human Resources"/>
	<f:option value="AC" label="Accounting" />
	<f:option value="SA" label="Sales"/>
	<f:option value="OR" label="Production"/>
	</f:select>    --> 
	

Department : <f:select path="department">
			<f:options items="${anket.departments}"/>
</f:select><br/><br/>

Gender : <f:radiobutton path="gender" value="M"/>Male
		 <f:radiobutton path="gender" value="F"/>Female
		 
		 <br/><br/>
Side Benefits :<br>
<f:checkbox path="sideBenefits" value="araba"/>Araba<br>
<f:checkbox path="sideBenefits" value="yemek"/>Yemek<br>
<f:checkbox path="sideBenefits" value="saglik sigortasi"/>Sigorta<br>
<f:checkbox path="sideBenefits" value="ucak hizmeti"/>Uçak Hizmeti<br><br>
 
 
<input name="Gonder" type="Submit" value="Ankete Devam Ediniz" />
</f:form>
</body>
</html>