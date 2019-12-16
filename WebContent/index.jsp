<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>heloooo</h1>
<p> p0 : ${p0}
	
<p>
<table>
	<c:forEach var="personne" items="${p1sav}">
	<tr>
	<td>${personne.nom} </td><td>${personne.prenom}</td>
	</tr>
	
	</c:forEach>
	
	

</table>

</body>
</html>