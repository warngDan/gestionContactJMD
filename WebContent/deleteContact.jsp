<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Recherche</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
    	
		<h1>Rechercher un contact</h1>
    
        <div>
            <form method="post" action="ServletSup">
               
    			<div>
                    <label for="nomContact">Nom </label>
                    <input type="text" id="nomContact" name="nomContact" placeholder="Saisir le nom" size="20" maxlength="20" required />
                 </div>
                   <div> 
                    <label for="prenomContact">Prénom </label>
                    <input type="text" id="prenomContact" name="prenomContact" placeholder="Saisir le prénom" size="20" maxlength="20"/>
                   </div>

          
                <input type="submit" value="Valider"  />
                <input type="reset" value="Annuler" />
            </form>
        </div>
    </body>
    <%@include file="linkHome.jsp" %>
</html>