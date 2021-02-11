<%-- 
    Document   : customiseYourPizza
    Created on : Feb 10, 2021, 8:43:12 PM
    Author     : tzortziskapellas
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Restaurant</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>

        <c:url value="/orderpizza/create" var="link"/>

        <form action="${link}" method="POST">
            <div> 
                <h2>Choose bread size:</h2>
                <c:forEach items = "${sizes}" var = "size">
                    <input type="radio" id="size" name="size" value="${size}">
                    <label for="size">${size.sname}</label><br>
                </c:forEach>
            </div>
            <div>
                <h2>Choose ingredients:</h2>
                <c:forEach items = "${ingredients}" var = "ingredient">
                    <input type="checkbox" id="name" name="name" value="${ingredient.iname}">
                    <label for="name">${ingredient.iname}</label><br>
                </c:forEach>
            </div>
            <div>
                <h2>Choose payment method:</h2>
                <select name="paymentmethod"> 
                    <option id="paymentmethod" name="paymentmethod" value="null">---</option>
                    <c:forEach items = "${payments}" var = "payment">
                        <option id="paymentmethod" name="paymentmethod" value="${payment.pname}">${payment.pname}</option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <h2>Your details:</h2>
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" placeholder="Type your name..."><br>
                <label for="age">Age:</label>
                <input type="number" id="age" name="age"><br>
                <label for="orderDate">Date of order:</label>
                <input type="date" id="orderDate" name="orderDate">
            </div>  
            <% LocalDateTime ldt = LocalDateTime.now();%>
            <%=ldt%>
            <br>
            <input type="submit" value="Submit"> 
        </form> 
    </body>
</html>
