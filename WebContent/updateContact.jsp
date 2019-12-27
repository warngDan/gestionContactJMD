<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link type="text/css" rel="stylesheet" href="style.css" />
		<title>ModifierContact</title>
	</head>
	<body>
	
	<div class="div-form">
		<form action="ValideUpdateServlet" method="post">
			<div>
					<select name="civilite" required>
						<option value="M" selected="selected">Monsieur</option>
						<option value="Mme">Madame</option>
						<option value="Mlle">Mademoiselle</option>
					</select>
				</div>
				
				<div>
					<label for="nom">Nom :</label>
					<input type="text" name="nom" size="21" placeHolder="${p.nom}" required />
				</div>
				<div>
					<label for="prenom">Prénom :</label>
					<input type="text" name="prenom" size="21" placeHolder="${p.prenom}" required />
				</div>
				<div>
					<label for="rue">Rue :</label>
					<input type="text" name="rue" size="50" placeHolder="${p.adresse.rue}" />
				</div>
				<div>
					<label for="cp">Code postale :</label>
					<input type="text" name="cp" size="5" placeHolder="${p.adresse.codePostale}" />
				</div>
				<div>
					<label for="ville">Ville :</label>
					<input type="text" name="ville" size="21" placeHolder="${p.adresse.ville" />
				</div>
				
				<div>
					<label for="pays">Pays :</label>
					<input type="text" name="pays" size="18" placeHolder="${p.adresse.pays}" />
				</div>
				<div>	
					<input class="valid-form" type="submit" id="submit" value="Valider" />
					<input class="valid-form" type="reset" />
				</div>
		</form>
	</div>
	<%@include file="linkHome.jsp"%>
</body>
</html>