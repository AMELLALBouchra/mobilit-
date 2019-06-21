<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE HTML>
<head>
    <title>L'inscription</title>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="inscreption.css">
    <style>
table, th, td {
  border: 1px solid black;
}
   </style>
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
  
	
	 
	
	<h2> Les étudiants qui ont demander un bullet d'avion : </h2>
	
   
   <div class="container">
<table class="table table-striped">
  <thead>
     <col width="160">
     <col width="80">
    <tr>
       
      <th >Nom</th>
      <th >Prénom</th>
      <th >Partenaire</th>
      <th >Ville de départ</th>
      <th >Ville d'arrivé</th>
      <th >Date de départ</th>
      <th >Tel mobile</th>
      <th >Tel fixe</th>
      <th >Email</th>
      <th >CNI</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach var="events" items="${events}" >

    <tr>
      
      <td>${events.nom }</td>
      <td>${events.prenom }</td>
      <td>${events.ecole_part }</td>
      <td>${events.ville_depart }</td>
      <td>${events.ville_arrive }</td>
      <td>${events.date_depart }</td>
      <td>${events.tel_mobile }</td>
      <td>${events.tel_fixe }</td>
      <td>${events.email }</td>
      <td>${events.cni }</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</div>
 

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
 
 </body>
    
</html>

	