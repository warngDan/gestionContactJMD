<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ServletCreate" method="post">
<select name="civilite" required>
   <option value="M" selected="selected">Monsieur</option>
   <option value="Mme" >Madame</option>
   <option value="Mlle">Mademoiselle</option>
</select>
<p>
   Votre nom :<br />
   <input type="text" name="nom" placeHolder="votre nom" required/>
</p>
<p>
   Votre prénom :<br />
   <input type="text" name="prenom" placeHolder="votre prenom" required/>
</p><br />

<div>Adresse :<br />

<p> Rue :<input type="text" name="rue" placeHolder="la rue" /></p>
<p> code postale :<input type="text" name="cp" placeHolder="code postale" /></p>
<p> ville :<input type="text" name="ville" placeHolder="ville" /></p>
<p> pays :<input type="text" name="pays" placeHolder="France" /></p>
</div>
		<input class="valid-form" type="submit" id="submit" value="Valider"/>
	    <input class="valid-form" type="reset"/>
			
		</form>					
</body>
<%@include file="linkHome.jsp" %>
</html>