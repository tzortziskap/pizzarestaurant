<%-- 
    Document   : customiseYourPizza
    Created on : Feb 10, 2021, 8:43:12 PM
    Author     : tzortziskapellas
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Restaurant</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>

        <c:url value="/orderpizza/create" var="link"/>


        <form:form action = "orderpizza/create" method = "POST" modelAttribute="paragelia">
            <h2>Choose bread size:</h2>
            <form:radiobuttons path="pizzaId.sizeId" items="${sizes}" itemLabel="sname" itemValue="id" element = "li"/>
            <form:errors path="pizzaId.sizeId"/>
            <h2>Choose ingredients:</h2>
            <c:forEach items="${ingredients}" var="ingredient">
                <input type="checkbox" name="pizzaId.ingredientList" value="${ingredient.id}">${ingredient.iname}<br/>
            </c:forEach>
            <h2>Choose payment method:</h2>
            <form:select path="paymentId" items="${payments}" itemLabel="pname" itemValue="id"/>
            <form:errors path="paymentId"/>
            <h2>Your details:</h2>
            Name: <form:input path="customerId.cname"/>
            <form:errors path="customerId.cname"/>
            <br/>
            Age: <form:input path="customerId.cage"/>
            <form:errors path="customerId.cage"/>
            <br/>
            Date of order:<form:input path="orderDate" type="date"/>

            <br/>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>
