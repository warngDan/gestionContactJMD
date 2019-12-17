<%@ taglib uri="http://java.sun.com.jsp.jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Résultat</title>
</head>
<body
	<table>
			<tr>
				<th>id</th>
				<th>nom</th>
				<th>prenom</th>
			</tr>
			<c:forEach var="personne" items="${lstContact}">
			<tr>
				<td>${personne.pk} </td>
				<td>${personne.nom} </td>
				<td>${personne.prenom}</td>
				
	<td>${personne.adresse.ville} </td><td>${personne.adresse.pays}</td>
	</tr>
	
	</c:forEach>
	
	

</table>

</body>
</html>