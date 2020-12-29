<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Omar
  Date: 29/12/2020
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Online store - Backoffice</title>
</head>
<body>
    <h1>OnlineStore, votre boutique multimédia en ligne</h1>
    <h2>Bonjour 
        <%if (!(request.getSession().getAttribute("userName")==null))
            {
                 %> ${sessionScope.userName}(<a href="/backoffice/logout">Déconnexion</a>)<%
            }else{
                %> (<a href="/backoffice/login.html">Connexion</a>)<%
            }
        %>

    </h2>
    <p>
        <a href="/backoffice/catalogue.jsp">Accès au catalogue des oeuvres</a>
    </p></br>
    <p>
        <a href="/backoffice/add-work-form.html">Ajouter une oeuvre au catalogue</a>
    </p></br>
</body>
</html>
