<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RésultatRecherche</title>
</head>
	<body>
		<h1>Résultat de la recherche</h1>
	
		<div class=div-form>

			<form action="UpdateServlet" method="post">
				<table>
					<tr>
						<th>Cocher</th>
						<th>Nom</th>
						<th>Prénom</th>
						<th>Rue</th>
						<th>Code postale</th>
						<th>Ville</th>
						<th>Pays</th>
					</tr>
					<c:forEach var="personne" items="${lstContacts}">
					<tr>
						<td><input type="radio" id="${personne.pk}" name="checkup" value="${personne.pk}"></td>
						<td>${personne.nom}</td>
						<td>${personne.prenom}</td>
						<td>${personne.adresse.rue}</td>
						<td>${personne.adresse.codePostale}</td>
						<td>${personne.adresse.ville}</td>
						<td>${personne.adresse.pays}</td>
					</tr>
					</c:forEach>
				</table>
	
				<div>
					<input class="update-form" type="submit" id="submit" value="Modifier" />
				</div>	
			</form>
		</div>
		<div class=div-form>
			<form action="DeleteServlet" method="get">
				
					<input type="hidden" id="idToDelete" name="idToDelete" value="" />
				<div>
					<input class="form" type="submit" id="submit" value="Supprimer" />
				</div>
			</form>
		</div>
		<%@include file="linkHome.jsp" %>
		<script type="text/javascript">
		
			const checkupElmt = document.getElementByName("checkup");
			
			checkupElmt.addEventListener("change", function () {
				document.getElementById("idToDelete").value = checkupElmt.value;
			})
		
		</script>
		
		
		
	</body>
</html>

