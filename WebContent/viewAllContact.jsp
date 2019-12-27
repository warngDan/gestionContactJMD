<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>AffichageContacts</title>
	</head>
	<body>

		<h1>Liste de contacts</h1>
		
		<div class="div-message">
			<p class="succes-msg"> ${succesMessage} </p>
			<p class="error-msg"> ${errorMessage} </p> 	
		 </div>
		<table>
					<tr>
						<th>Id</th>
						<th>Nom</th>
						<th>Prénom</th>
						<th>Rue</th>
						<th>Code postale</th>
						<th>Ville</th>
						<th>Pays</th>
					</tr>
					<c:forEach var="personne" items="${listContact}">
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

		<%@include file="linkHome.jsp" %>
	</body>

</html>