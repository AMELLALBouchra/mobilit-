<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<head>
    <title>L'inscription</title>
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
  
	
	 
	
	<!--	 
                <ul>
		<li><a href="index.php?module=etudiant&action=FoormInscriptionBilletAvion">Billet d'avion   </a> </li>
		
		</ul> 
            
		***************************
-->				
	 	 	
				 
                      
<!--
 
		<ul>
			<li><a href="index.php?module=etudiant&amp;action=inscription">Inscription</a></li>
		</ul>



	         <ul>
			<li><a href="index.php?module=etudiant&action=documentation">Documentation</a></li>
		</ul>
	
-->

<h3>Inscription</h3>
<form enctype='multipart/form-data' method="post" action="ServlInscription" >
	 
	<fieldset class="pubrapport">
				<legend><b>Informations Personnelles </b></legend> 
	<p>
		<label id="nom">Nom :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="nom" name="nom"   type="text"   />  
	</p>
	<p>
		<label id="prenom">Pr&eacute;nom :</label>
		<input class="validate[required,custom[onlyLetter],length[0,50]] text-input"  MAXLENGTH="40" id="prenom" name="prenom"   type="text"   />  
	</p>
	
	<p>
		<label id="emailINPT">Email INPT  :</label>
		<input class="validate[required,custom[email]] text-input"     id="emailINPT" name="email_inpt"   type="text"   /> 
		
	</p>
	
	<p>
		<label id="MatEtud">Matricule &eacute;tudiant :</label>
		<input class="validate[required] text-input"  MAXLENGTH="20"  id="MatEtud" name="Matricule"   type="text"   /> 
		(Konosys)
	</p>
	
	<p>
	<!--"regex":"/^[0-9\-\(\)\ ]+$/",-->
		<label id="tel "> T&eacute;l&eacute;phone  :</label>
		<input class="validate[required,custom[telephone],length[10,10]] text-input" id="tel" name="tel"   type="text"   /> 
		 (format 06********)
	</p>
		<p>
		<label id="adresse">Adresse    :</label>
		<textarea class="validate[required,length[6,200]] text-input" name="adresse" id="addresse"  rows="2" cols="25"> </textarea> 
		
	</p>
	
	<p>
	<label id="mdp ">Fili&egrave;re   :</label>
	<select name="filiere" id="filiere" class="validate[required]">
		 <option value="" selected>Choisissez votre  fili&egrave;re </option>
		<option value="DATA Engineer"> DATA Engineer </option>
		<option value="Développement des services numériques"> Développement des services numériques </option>
		<option value="Ingénieur des systèmes numériques"> Ingénieur des systèmes numériques</option>
  <option value="Smart informationand communication technology"> Smart informationand communication technology </option>
  <option value="Cloud et IOT"> Cloud et IOT  </option>
  <option value="Confiance numérique"> Confiance numérique </option>
  <option value="Innovation et AMOA"> Innovation et AMOA  </option>
		 </select> 
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
				<legend><b>Informations de la Connexion </b></legend>
	<p>
		<label id="email ">Email   :</label>
		<input class="validate[required,custom[email]] text-input" id="email" name="email"   type="text"   /> 
		
	</p>			
	<p>
		<label id="email2 ">Confirmation email :   </label>
		<input class="validate[required,confirm[email]] text-input"  id="email2" name="email2"   type="text"   /> 
		
	</p>			
	<p>			
		<label id="password">Mot de passe  :</label>
	 
		<input class="validate[required,length[4,10]] text-input" type="password" id="mdp"  name="mdp" />
	</p>
	<p>
		<label id="password2">Confirmation mot de passe    :</label>
	 
		<input class="validate[required,confirm[mdp]] text-input" type="password" name="mdp2"  id="mdp2" />
	</p>
	 
	</fieldset>
	
	<fieldset class="pubrapport">
	<legend><b>Fichiers &agrave; envoyer</b></legend>
	
	<p>
		<label id="cv">Votre CV   :</label>
		<input id="cv"  name="cv"   type="file"    /> <span style="color:#900;"> Format( pdf | max. 1 Mo)    </span>  
		 
	</p>
	<!--
	<p>
		<label id="engFinancier">Votre lettre  d'engagement financier   :</label>
		<input id="engFinancier" name="engFinancier"   type="file"   required /> <span style="color:#900;"> Format( pdf | max. 1 Mo)   </span>  
		 
	</p>
       -->
	
	<p>
		<label id="lettreMotivDirc">Votre lettre de motivation  * : </label>
		<input id="lettreMotivDirc" name="lm"   type="file"   /><span style="color:#900;"> Format( pdf | max. 1 Mo)   </span>  
		
		 
	</p>
	<span style="color:#0257b2;">* Adress&eacute;e au directeur de l'INPT</span>
	</fieldset>
	<fieldset class="pubrapport">
	<legend><b>Conditions  d'utilisation</b></legend>
				 
	 
 
- Je reconnais que les donn&eacute;es renseign&eacute;es dans ce formulaire sont  personnelles.
<br>
- J'autorise l'INPT &agrave; collecter et &agrave; traiter les donn&eacute;es renseign&eacute;es ci-dessus.

<br>
- Les informations  que vous nous confiez  sont  exclusivement destin&eacute;es au traitement  de votre candidature &agrave; la mobilit&eacute;. 
<br><br>
<label>
					<span class="checkbox">J'accepte les conditions : </span>
					<input class="validate[required] checkbox"  type="checkbox"  id="agree"  name="agree"/>
				</label>
	
	</fieldset>
 <fieldset class="pubrapport">

		<input id="form_inscription" name="form_inscription" value="form_inscription" type="hidden" />
		<input   type="submit" id="sub" value="Valider" />
 </fieldset>
</form>
 </div>


</body>
</html>