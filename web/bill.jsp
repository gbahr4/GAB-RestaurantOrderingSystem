<%-- 
    Purpose: Bill Web Page
    Author: Greg Bahr
    Revision 2.0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Bill</h1>
        <%
        Object totalBill = request.getAttribute("totalBill");
        Object tax = request.getAttribute("tax");
        Object tip = request.getAttribute("tip");
        Object grandTotal = request.getAttribute("grandTotal");
        out.println("<p> Total Bill: $"
             + totalBill + "</p>");
        out.println("<p> Tax: $" + tax + "</p>");
        out.println("<p> Suggested Tip: $" + tip + "</p>");
        out.println("<p> Grand Total: $"+ grandTotal + "</p>");
        %>
    </body>
</html>
