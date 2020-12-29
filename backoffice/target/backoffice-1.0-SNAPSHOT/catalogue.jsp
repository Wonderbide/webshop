<%@ page import="com.directmedia.onlinestore.core.entity.Work" %>
<%@ page import="com.directmedia.onlinestore.core.entity.Catalogue" %><%--
  Created by IntelliJ IDEA.
  User: Omar
  Date: 29/12/2020
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Catalogue</title>
    <p>
        <%
            for (Work iWork : Catalogue.listOfWork) {
        %>
        <a href="/frontoffice/work-details?id=<%=iWork.getId()%>"> <%=iWork.getTitle()%> </a>(<%=iWork.getRelease()%>)
        <%}%>
    </p>
</head>
<body>

</body>
</html>
