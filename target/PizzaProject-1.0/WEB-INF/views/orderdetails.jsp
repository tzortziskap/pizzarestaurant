<%-- 
    Document   : orderdetails
    Created on : Feb 11, 2021, 3:57:12 PM
    Author     : tzortziskapellas
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Details</title>
    </head>
    <body>
       <h1>You ordered a nice pizza</h1>
        <strong>Size:</strong> ${paragelia.pizzaId.sizeId.sname}
        <br/>
        <br/>
        <strong>Ingredients:</strong>
        <ul>
            <c:forEach items="${paragelia.pizzaId.ingredientList}" var="ingr">
                <li>${ingr.iname}</li>
                </c:forEach>
        </ul>
        <strong>Payment Method:</strong> ${paragelia.paymentId.pname}
        <br/>
        <strong>Your name:</strong>${paragelia.customerId.cname}
        <br/>
        <strong>Your age:</strong> ${paragelia.customerId.cage}
        <br/>
        <strong>Order date:</strong> ${paragelia.orderDate}
        <h3>Thank you for your order</h3>
    </body>
</html>
