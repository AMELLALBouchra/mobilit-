<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
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
  
	
	 
	<fieldset class="choixAcc">
    <div>   
     <table>
      <h2> Les étudiants inscrits à la mobilité : </h2>
     
      <c:forEach items="${events}" var="events">
        <tr>
                 <td> <c:out value="${events.getNom()}" /><td>
         
                 <br /><td><c:out value="${events.getPrenom()}" /><td>
        
        
     
                   <td><c:out value="${events.getFiliere()}" /><td>
        </tr> 
       
       
      
                
      
      <br/>
      </c:forEach>
     
     </table>
     
     
     </div>
    </fieldset>
    </body>

</html>

	