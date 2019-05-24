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

  <a href="inscription.jsp">Inscription</a>

  <a href="result_preselection.jsp">Consulter la liste de préselection</a>

  <a href="#">Classification des choix</a>

  <a href="inscription.html">Consulter la liste definitive</a>

  <a href="#">Impression des conventions</a>

  <a href="demande_achat_billet.html">Demande de billet d'avion</a>

</div>

    

 <br/>

 </fieldset>

  <fieldset  class="pre">

  <form enctype='multipart/form-data' action="servMobilite" method="post">
<input type="hidden" name="page" value="preselect_etud"   >

    <fieldset>
    <legend><b>Postulez les notes par Fili&egrave;re </b></legend>
    <label id="mdp ">Fili&egrave;re   :</label>
    <select name="filiere" id="filiere" class="validate[required]">
         <option value="" selected>Choisissez votre  fili&egrave;re </option>
        <option value="data"> DATA Engineer </option>
        <option value="dev"> Développement des services numériques </option>
        <option value="sysnum"> Ingénieur des systèmes numériques</option>
        <option value="smart"> Smart informationand communication technology </option>
        <option value="cloud"> Cloud et IOT  </option>
        <option value="confnum"> Confiance numérique </option>
        <option value="amoa"> Innovation et AMOA  </option>
         </select> 

  
    </fieldset>
   

 <input   type="submit" id="sub" value="Envoyer" />

</form>
  </fieldset>  

</body>
</html>