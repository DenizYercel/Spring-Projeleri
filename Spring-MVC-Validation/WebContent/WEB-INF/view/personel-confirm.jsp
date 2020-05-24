<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personel Bilgileri</title>
</head>
<body>

Personel Name: ${kisi.firstName} <br/>
Personel lastname: ${kisi.lastName}<br/>
Personel Salary : ${kisi.salary} <br/>
Personel PostalCode :${kisi.postalCode}<br/>
Personel RestDay :${kisi.restDay}<br/>
Personel Department:${kisi.department}<br/>
Personel Gender : ${kisi.gender}<br>
Side Benefits :<ul>
<c:forEach var="rec" items="${kisi.sideBenefits}" >
<li>${rec}</li>
</c:forEach>
</ul>



</body>
</html>