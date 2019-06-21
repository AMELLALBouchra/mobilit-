<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>

  <head>
    <title>Presentation</title>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="Autres.css">
  </head>
  <body>
    
    
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
    
    <div id="centre" style="overflow: hidden; width: auto; height: 100%;">
        </div>
    <br/>
    <br/>
   <fieldset class="publRapp1">
    <form method="post" action="ServlAuthentification" >
				 
	 <p>
		<h3>Connexion</h3>
		<br/>
		<label id="Ad mail">login :</label>
		<input MAXLENGTH="40" id="nom" name="login"   type="text" required="required"  />  
	 </p>
	
     <p>			
		<label id="password">Mot de passe  :</label>
	 
		<input type="password" id="motdepasse"  name="mdp" required="required" />
	 </p>
     <p>
        <br/>
		<input id="form_inscription" name="form_inscription" value="form_inscription" type="hidden" />
		<input   type="submit" id="sub" value="Se connecter" />
     </p>
     <div id="menu" style="overflow: hidden; width: auto; height: 100%; ">
	
	  <ul>
		<li><a href="MotDePasseOublie.html">Mot de passe oublié ?</a></li>
		
	  </ul>
    </div>
     </form>
    </fieldset>
    
   
    <br/>
    <fieldset class="pre">
   
    <p> Si vous &ecirc;tes int&eacute;ress&eacute;  par la mobilit&eacute; vers nos partenaires internationaux,nous vous invitons    &agrave; se connecter
	 via votre login et mot de passe
	 </p>
	 <h3>Liste des partenaires internationaux :</h3>
	 <p>
		- Centrale SUPELEC.<span style="color:#4285f4;"></br>  </span> - ENSIMAG.<span style="color:#4285f4;"></br>  </span>  - ENSEEIHT. <span style="color:#4285f4;"> </br> </span> - ESATIC.<span style="color:#4285f4;"></br> </span>  - ESPRIT.
<span style="color:#4285f4;"> </br> </span> - Ecole des Mines de Saint Etiennes. <span style="color:#4285f4;"></br> </span> - INSA Centre Val de Loire. <span style="color:#4285f4;"></br>  </span>  - INSA DE LYON. <span style="color:#4285f4;"> </br> </span>
- INSA DE RENNES. <span style="color:#4285f4;"></br></span> - SUP'COM TUNIS. <span style="color:#4285f4;"> </br></span>  - T&eacute;l&eacute;com Saint Etiennes. <span style="color:#4285f4;"> </br></span> - TELECOM SUD PARIS. <span style="color:#4285f4;">
</br></span>   -T&eacute;l&eacute;com Lille.  <span style="color:#4285f4;"> </br></span>  - T&eacute;l&eacute;com ParisTech. <span style="color:#4285f4;"></br> </span> 
 - IMT Atlantique. <span style="color:#4285f4;"></br> </span> 
 - Universit&eacute; Nice Sophia Antipolis.  <span style="color:#4285f4;"> </br></span> - Universit&eacute; de Cukurova. <span style="color:#4285f4;"></br> </span>  - Universit&eacute; de Sherbrooke. 
 <span style="color:#4285f4;"> </br></span>  - Universit&eacute; de Bretagne Occidentale.
	 </p>
    
 
    </fieldset>
    
    
 	   
 </body>

</html>
    