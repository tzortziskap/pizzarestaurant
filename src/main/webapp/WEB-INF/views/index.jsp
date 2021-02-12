<%-- 
    Document   : index
    Created on : Feb 10, 2021, 8:26:57 PM
    Author     : tzortziskapellas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${myMessage}</h1>
        <a href="${pageContext.request.contextPath}/orderpizza">Order Pizza</a>
    </body>
</html>
