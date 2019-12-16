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
<tr>
<th>nom</th><th>prenom</th><th>rue</th><th>code postale</th><th>ville</th><th>pays</th>
</tr>
	<c:forEach var="personne" items="${p1sav}">
	<tr>
	<td>${personne.nom} </td><td>${personne.prenom}</td>
	<td>${personne.adresse.rue} </td><td>${personne.adresse.codePostale}</td>
	<td>${personne.adresse.ville} </td><td>${personne.adresse.pays}</td>
	</tr>
	
	</c:forEach>
	
	

</table>

</body>
</html>