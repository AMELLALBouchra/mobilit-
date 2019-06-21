<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
 <head>
    <title>Publier la documentation</title>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="inscreption.css">
 </head>
 <body id="body">
    <h2><img src="1.png" height="100px" width="200px" alt="l'INPT" style="float: left;" ></br>Mobilité Internationale </h2>
    
	<nav>
        <div class="table">
            <ul>
                <li class="menu.home">
                    <a href="Authentification.html">Acceil</a>
                </li>
                <li class="menu.events">
                    <a href="AfficherEvent.jsp">Documentation</a>
                </li>
                <li class="menu.events">
                    <a href="AfficherEvent.jsp">A propos de nous</a>
                </li>
                </li>
            </ul>
        </div>
    </nav>
  
	<fieldset class="pubrapport">
		<h3>Publier la documentation</h3>
		<br/>
		Veillez publier la documentation contenant l'ensemble des informations sur les écoles partenaires en format PDF .
		<br/>
		<br/>
		<p>
		
		<br/>
		<form enctype='multipart/form-data' method="post" action="Serv_put_documentation">
		<label id="lettreMotivDirc">Documentation : </label>
		<input id="fichier" name="fichier"   type="file"  required  /><span style="color:#900;"> Format(pdf)</span>
		<br/>
		<br/>
		<br/>
		<br/>
		<input id="form_inscription" name="form_inscription" value="form_inscription" type="hidden" />
		<input   type="submit" id="sub" value="Publier" />
		 
	  
	   </form>
	</fieldset>
	<fieldset class="pubrapport">
		Si vous publier cette documentation et elle existe déja une publiée , cette dérniere sera supprimée automatiquement et remplacée par la nouvelle documentation.
	</fieldset>
  </body>
</html>