<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link type="text/css" rel="stylesheet" href="style.css" />
		<title>GestionContact</title>
	</head>
	
	<body>
		<h1>Gestion contacts</h1>
		
		 <div class="div-message">
<%-- 			<p class="succes-msg"> ${succesMessage} </p> --%>
<%-- 			<p class="error-msg"> ${errorMessage} </p> 	 --%>
		 </div>

		<div class="div-form">

			<form action="HomeServlet" method="post">
				<p>Choisir une opération :</p>
				<div>
					<input type="radio" id="search" name="check" value="search" checked>
					<label for="search">Rechercher un contact</label>
				</div>

				<div>
					<input type="radio" id="view" name="check" value="view">
					<label for="view">Afficher les contacts</label>
				</div>
			
				<div>
					<input type="radio" id="create" name="check" value="create">
					<label for="create">Ajouter un nouveau contact</label>
				</div>
				<div>
					<input class="valid-form" type="submit" id="submit" value="Valider"/>
				</div>
			</form>
		</div>
	</body>
</html>