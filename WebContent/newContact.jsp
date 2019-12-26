<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Ajouter contact</title>
	</head>
	<body>
		<div class=div-form>
			<form action="CreateServlet" method="post">
			
				<div>
					<select name="civilite" required>
						<option value="M" selected="selected">Monsieur</option>
						<option value="Mme">Madame</option>
						<option value="Mlle">Mademoiselle</option>
					</select>
				</div>
				
				<div>
					<label for="nom">Nom :</label>
					<input type="text" name="nom" placeHolder="Nom" required />
				</div>
				<div>
					<label for="prenom">Prénom :</label>
					<input type="text" name="prenom" placeHolder="Prenom" required />
				</div>
				<div>
					<label for="rue">Rue :</label>
					<input type="text" name="rue" placeHolder="Rue" />
				</div>
				<div>
					<label for="cp">Code postale :</label>
					<input type="text" name="cp" placeHolder="Code postale" />
				</div>
				<div>
					<label for="ville">Ville :</label>
					<input type="text" name="ville" placeHolder="Ville" />
				</div>
				
				<div>
					<label for="pays">Pays :</label>
					<input type="text" name="pays" placeHolder="France" />
				</div>
				<div>	
					<input class="valid-form" type="submit" id="submit" value="Valider" />
					<input class="valid-form" type="reset" />
				</div>
			</form>
		</div>
	</body>
<%@include file="linkHome.jsp"%>
</html>