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

  

   <h3> Espace Admin </h3>

   <br/>

<div class="vertical-menu">

  <a href="#" class="active">Acceil Admin</a>

		<a href="Publier_documentation.html">Publier la documentation</a>

		<a href="fournir_notes.jsp">Diposer les notes</a>

		<a href="#">Consulter liste des étudiants inscrits</a>

		<a href="result_preselection.jsp">Consulter liste de préselection</a>

		<a href="preselection.jsp">Diposer liste de nombre de places par filiére </a>

  <a href="#">Consulter liste des affectations</a>

		<a href="pub_definitive.html">Publier la liste définitive</a>

		<a href="#">gérer les conventions</a>

  <a href="#">Consulter les demandes de billet d'avion</a>

  

</div>

 </fieldset>

  <fieldset  class="pre">

  <form enctype='multipart/form-data' action="servMobilite" method="post">
<input type="hidden" name="page" value="preselect"   >

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

    <p>
       <label id="nbr">Nombre des étudiants à préselectionner</label>
       <input type="text" name="nbr">
   
    </p>
    </fieldset>
   

 <input   type="submit" id="sub" value="Envoyer" />

</form>
  </fieldset>  

</body>
</html>