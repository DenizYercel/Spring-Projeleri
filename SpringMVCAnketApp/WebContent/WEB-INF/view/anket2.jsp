<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2.Sayfa</title>
</head>
<body>
<f:form action="sonuc" method="GET" modelAttribute="anket">
Enter Age: <f:input path="age"/> <br><br/><br>
City: <f:select path="city"><br><br/>
		<f:options items="${anket.cities}"/>
</f:select><br><br>
	

Mezuniyet : <f:radiobutton path="mezuniyet" value="OrtaOkul"/>OrtaOkul
		 <f:radiobutton path="mezuniyet" value="Lise"/>Lise
		  <f:radiobutton path="mezuniyet" value="Üniversite"/>Üniversite
		 
		 <br/><br/>
Days :<br>
<f:checkbox path="days" value="Pazartesi"/>Pazartesi<br>
<f:checkbox path="days" value="Sali"/>Sali<br>
<f:checkbox path="days" value="Çarşamba"/>Çarşamba<br>
<f:checkbox path="days" value="Perşembe"/>Perşembe<br><br>
 
 
<input name="Gonder" type="Submit" value="Anketi Gönder" />
</f:form>
</body>
</html>