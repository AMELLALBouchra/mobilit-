<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription mobilité</title>
  <link rel="stylesheet" href="accuei_etudiant.css">
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

    <fieldset class="publRapp1">

  

   <h3> Espace Etudiant </h3>

   <br/>

<div class="vertical-menu">

  <a href="#" class="active">Acceil Etudiant</a>

  <a href="inscription.html">Inscription</a>

  <a href="inscription.html">Consulter la liste de préselection</a>

  <a href="#">Classification des choix</a>

  <a href="inscription.html">Consulter la liste definitive</a>

  <a href="#">Impression des conventions</a>

  <a href="demande_achat_billet.html">Demande de billet d'avion</a>

</div>

    

 <br/>
 <form method="post" action="servMobilite" >
        <input type="hidden" name="page" value="inscrire"   >

    </fieldset>

  <fieldset  class="pre">

     <legend><b>Informations Personnelles </b></legend> 
    <p>
       <label id="prenom">Nom :</label>
       <input type="text" name="nom">
    </p>

 <p>
       <label id="prenom">Pr&eacute;nom :</label>
       <input type="text" name="prenom">
    </p>
  
   <p>
       <label id="prenom">Email INPT :</label>
       <input type="text" name="emailINPT">
    </p>
   
   <p>
       <label id="prenom">Matricule étudiant :</label>
       <input type="text" name="MatEtud">
    </p>
   
   <p>
       <label id="prenom">Téléphone :</label>
       <input type="text" name="tel">
    </p>
   
   <p>
       <label id="prenom">Adresse:</label>
       <input type="text" name="adresse">
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
    <legend><b>Informations de la Connexion  </b></legend> 
    <p>
       <label id="prenom">Email  :</label>
       <input type="text" name="email">
    </p>

 <p>
       <label id="prenom">Confirmation email:</label>
       <input type="text" name="email2">
    </p>
  
   <p>
       <label id="prenom">Mot de passe:</label>
       <input type="text" name="mdp">
    </p>
   
   <p>
       <label id="prenom">Confirmation mot de passe:</label>
       <input type="text" name="mdp2">
    </p>
    <legend><b>Fichiers &agrave; envoyer</b></legend>
    
    <p>
        <label id="cv">Votre CV   :</label>
        <input id="cv" name="cv"   type="file"  required  /> <span style="color:#900;"> Format( pdf | max. 10 Mo)    </span>  
         
    </p>
    <p>
        <label id="lettreMotivDirc">Votre lettre de motivation  * : </label>
        <input id="lettreMotivDirc" name="lettreMotivDirc"   type="file"  required  /><span style="color:#900;"> Format( pdf | max. 10 Mo)   </span>  
        
         
    </p>
    <span style="color:#0257b2;">* Adress&eacute;e au directeur de l'INPT</span>
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
       <input   type="submit" id="sub" value="Valider" />
 </form>              
  </fieldset>  

    

  





