<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RésultatRecherche</title>
</head>
<body>
	<h1>Résultat de la recherche</h1>
	<table>
		<tr>
			<th>id</th>
			<th>nom</th>
			<th>prenom</th>
			<th>rue</th>
			<th>code postale</th>
			<th>ville</th>
			<th>pays</th>
		</tr>
		<c:forEach var="personne" items="${lstContacts}">
			<tr>
				<td>${personne.pk}</td>
				<td>${personne.nom}</td>
				<td>${personne.prenom}</td>
				<td>${personne.adresse.rue}</td>
				<td>${personne.adresse.codePostale}</td>
				<td>${personne.adresse.ville}</td>
				<td>${personne.adresse.pays}</td>
			</tr>
			</c:forEach>
	</table>

</body>
</html>
</body>
</html>