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
		<tr>
			<td>${contact.pk}</td>
			<td>${contact.nom}</td>
			<td>${contact.prenom}</td>
			<td>${contact.adresse.rue}</td>
			<td>${contact.adresse.codePostale}</td>
			<td>${contact.adresse.ville}</td>
			<td>${contact.adresse.pays}</td>
		</tr>
	</table>

</body>
</html>
</body>
</html>