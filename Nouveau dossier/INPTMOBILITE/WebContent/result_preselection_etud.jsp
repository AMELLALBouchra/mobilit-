<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="accuei_etudiant.css" >
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
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

    </fieldset>

  <fieldset  class="pre">

   <div class="container">
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Note</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="preselect" end="${nbr-1}"  items="${listes}" >
  
    <tr>
      <th scope="row">1</th>
      <td>${preselect.nom }</td>
      <td>${preselect.prenom }</td>
      <td>${preselect.moyenne }</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</div>
  </fieldset>  

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>