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
	    <form enctype='multipart/form-data' method="post" action="Insert_nbre_places">
		<h3>Diposer la liste de nombre de places</h3>
		<br/>
		Veillez publier la liste contenant pour chaque école partenaire l'ensemble des filières qu'elle offre 
    et le nombre des places par filière sous format Excel .
		<br/>
		<br/>
		<p>
		<label id="lettreMotivDirc">La liste des places: </label>
		<input id="notes" name="notes"   type="file"  required  /><span style="color:#900;"> Format Excel   </span>
		<br/>
		<br/>
		<br/>
		<br/>
		
		<input   type="submit" id="sub" value="Envoyer" />
		 
	</p>
	</form>
	</fieldset>
	
  </body>
</html>