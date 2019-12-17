<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Recherche</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
    	
		<h1>Rechercher contact</h1>
    
        <div>
            <form method="post" action="SearchContactServlet">
                <fieldset>
                    <legend>Informations contact</legend>
    
                    <label for="nomContact">Nom <span class="requis">*</span></label>
                    <input type="text" id="nomContact" name="nomContact" placeholder="Saisir le nom" size="20" maxlength="20" required />
                    <br />
                    
                    <label for="prenomContact">Prénom </label>
                    <input type="text" id="prenomContact" name="prenomContact" placeholder="Saisir le prénom" size="20" maxlength="20" required />
                    <br />

                </fieldset>
                <input type="submit" value="Valider"  />
                <input type="reset" value="Annuler" />
            </form>
        </div>
    </body>
</html>