<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ValideUpdateServlet" method="post">
<p>Civilité:<select name="civilite" required>
   <option value="M" selected="selected">Monsieur</option>
   <option value="Mme" >Madame</option>
   <option value="Mlle">Mademoiselle</option>
</select></p>

<p>
  Nom :<br />
   <input type="text" name="nom" value="${p.nom}" required/>
</p>
<p>
   Prénom :<br />
   <input type="text" name="prenom" value="${p.prenom}" required/>
</p><br />

<div>Adresse :<br />

<p> Rue :<input type="text" name="rue" value="${p.adresse.rue}" /></p>
<p> code postale :<input type="text" name="cp" value="${p.adresse.codePostale}" /></p>
<p> ville :<input type="text" name="ville" value="${p.adresse.ville}" /></p>
<p> pays :<input type="text" name="pays" value="${p.adresse.pays}" /></p>
</div>
		<input class="valid-form" type="submit" id="submit" value="Valider"/>
	    <input class="valid-form" type="reset"/>
		
		</form>		
		<%@include file="linkHome.jsp" %>			
</body>
</html>