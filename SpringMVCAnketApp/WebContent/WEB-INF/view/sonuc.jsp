<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personel Bilgileri</title>
</head>
<body>

Name: ${anket.firstName} <br/>
Lastname: ${anket.lastName}<br/>
Department:${anket.department}<br/>
Gender : ${anket.gender}<br>
Side Benefits :<ul>
<c:forEach var="rec" items="${anket.sideBenefits}" >
<li>${rec}</li>
</c:forEach>
</ul>

Age : ${anket.age}<br/>
City :${anket.city} <br/>
Mezuniyet:${anket.mezuniyet}<br/>
Days: <ul>
<c:forEach var="day" items="${anket.days}" >
<li>${day}</li>
</c:forEach>
</ul>






</body>
</html>