<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AffichageContact</title>
</head>
<body>
<<<<<<< HEAD
<table>
<tr>
<th>id</th><th>nom</th><th>prenom</th><th>rue</th><th>code postale</th><th>ville</th><th>pays</th>
</tr>
	<c:forEach var="personne" items="${listContact}">
	<tr>
	<td>${personne.pk} </td><td>${personne.nom} </td><td>${personne.prenom}</td>
	<td>${personne.adresse.rue} </td><td>${personne.adresse.codePostale}</td>
	<td>${personne.adresse.ville} </td><td>${personne.adresse.pays}</td>
	</tr>
	
	</c:forEach>
=======
	<h1>Liste de contacts</h1>
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
		<c:forEach var="personne" items="${p1sav}">
			<tr>
				<td>${personne.pk}</td>
				<td>${personne.nom}</td>
				<td>${personne.prenom}</td>
				<td>${personne.adresse.rue}</td>
				<td>${personne.adresse.codePostale}</td>
				<td>${personne.adresse.ville}</td>
				<td>${personne.adresse.pays}</td>
			</tr>
>>>>>>> 88d394bf3c1154bda11197ec58cceffef80be479

		</c:forEach>



	</table>

</body>
</html>