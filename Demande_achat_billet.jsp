<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<head>
    <title>Demande de billet</title>
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
  <h3>Demande d'achat de billet d'avion</h3>
<form   method="post" action="ServlDemande_billrt" >
	 
	<fieldset class="pubrapport">
			 
	<p>
		<label id="nom">Nom :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="nom" name="nom"   type="text"   />  
	</p>
	<p>
		<label id="prenom">Pr&eacute;nom :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="prenom" name="prenom"   type="text"   />  
	</p>
		<p>
		<label id="prenom">Ecole partenaire :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="prenom" name="ecole_part"   type="text"   />  
	</p>
		<p>
		<label id="prenom">Ville de départ :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="prenom" name="ville_depart"   type="text"   />  
	</p>
	<p>
		<label id="emailINPT">ville d'arrivé :</label>
		<input class="validate[required,custom[email]] text-input"     id="emailINPT" name="ville_arrive"   type="text"   /> 
		
	</p>
	
	<p>
		<label id="MatEtud">Date de départ :</label>
		<input class="validate[required] text-input"  MAXLENGTH="20"  id="MatEtud" name="date_depart"   type="date"   /> 
		
	</p>
	
	<p>
	<!--"regex":"/^[0-9\-\(\)\ ]+$/",-->
		<label id="tel "> T&eacute;l&eacute;phone mobile  :</label>
		<input class="validate[required,custom[telephone],length[10,10]] text-input" id="tel" name="tel_mobile"   type="text"   /> 
		 (format 06********)
	</p>
		<p>
		<label id="prenom">T&eacute;l&eacute;phone fixe :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="prenom" name="tel_fixe"   type="text"   />
		(format 05********)
	</p>
				<p>
		<label id="prenom">Email :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="prenom" name="email"   type="mail"   />
	
	</p>
	<p>
		<label id="prenom">CNI ou carte de séjour :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="prenom" name="cni"   type="text"   />
		
	</p>
	</fieldset>
	<!--<fieldset>
	<legend><b>Les notes S1 , S2 , S3 </b></legend>
	<br> <b><span style="color:#955;"> Format(  17,05   --  15,00  --  09,65  )  </b>  </span>  
	 
	<p>
		<label id="s1"> Note S1 :</label>
		<input class="validate[required,custom[onlyNumber],length[0,5]] text-input" id="s1" name="s1"  MAXLENGTH="5"  type="text"   />   
	</p>
	<p>
		<label id="s2"> Note S2 :</label>
		<input class="validate[required,custom[onlyNumber],length[0,5]] text-input" id="s2" name="s2"  MAXLENGTH="5"   type="text"   />   
	</p>
	<p>
		<label id="s3"> Note S3 :</label>
		<input class="validate[required,custom[onlyNumber],length[0,5]] text-input" id="s3" name="s3"  MAXLENGTH="5"   type="text"   />    
	</p>
	
	</fieldset>-->
	
	
	
	<fieldset class="pubrapport">
    

		<input id="form_inscription" name="form_inscription" value="form_inscription" type="hidden" />
		<input   type="submit" id="sub" value="Valider" />
 </fieldset>
</form>
 </div>


</body>
</html>