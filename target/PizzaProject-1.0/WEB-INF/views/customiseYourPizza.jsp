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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>
         
        <c:url value="/orderpizza/create" var="link"/>
        
        <form action="${link}" method="POST">
            <div> 
                <h2>Choose bread size:</h2>
                <input type="radio" id="size" name="size" value="large">
                <label for="size">Large</label><br>
                <input type="radio" id="size" name="size" value="medium">
                <label for="size">Medium</label><br>
                <input type="radio" id="size" name="size" value="small">
                <label for="size">Small</label>
            </div>
            <div>
                <h2>Choose ingredients:</h2>
                <input type="checkbox" id="name" name="name" value="potatoes">
                <label for="name">Potatoes</label><br>
                <input type="checkbox" id="name" name="name" value="tomatoes">
                <label for="name">Tomatoes</label><br>
                <input type="checkbox" id="name" name="name" value="sausage">
                <label for="name">Sausage</label><br>
            </div>
            <div>
                <h2>Choose payment method:</h2>
                <select name="paymentmethod">
                    <option id="paymentmethod" name="paymentmethod" value="null">---</option>
                    <option id="paymentmethod" name="paymentmethod" value="creditcard">Credit Card</option>
                    <option id="paymentmethod" name="paymentmethod" value="cash">Cash</option>
                </select>
            </div>
            <div>
                <h2>Your details:</h2>
                <label for="firstname">First Name</label>
                <input type="text" id="firstname" name="firstname" placeholder="Type your first name..."><br>
                <label for="lastname">Last Name</label>
                <input type="text" id="lastname" name="lastname" placeholder="Type your last name..."><br>
                <label for="dateofbirth">Date of Birth</label>
                <input type="date" id="dateofbirth" name="dateofbirth">
            </div>  
            <% LocalDateTime ldt = LocalDateTime.now();%>
            <%=ldt%>
            <br>
            <input type="submit" value="Submit"> 
        </form> 
    </body>
</html>
