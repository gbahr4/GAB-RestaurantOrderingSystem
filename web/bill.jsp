<%-- 
    Purpose: Bill Web Page
    Author: Greg Bahr
    Revision 3.0
--%>

<%@page import="java.util.List"%>
<%@page import="Model.MenuItem"%>
<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bill</title>
    </head>
    <body>
        <h1>Bill</h1>
        <%
        Object totalBill = request.getAttribute("totalBill");
        Object objList = request.getAttribute("orderList");
        List<MenuItem> orderList = (List<MenuItem>) objList;
  
        Object tax = request.getAttribute("tax");
        Object tip = request.getAttribute("tip");
        Object grandTotal = request.getAttribute("grandTotal");
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        for (int i = 0; i < orderList.size(); i++) {
            out.println("<p>" + orderList.get(i) + "</p>");
            }
        out.println("<p> Total Bill: "
             + nf.format(totalBill) + "</p>");
        out.println("<p> Tax: " + nf.format(tax) + "</p>");
        out.println("<p> Suggested Tip: " + nf.format(tip) + "</p>");
        out.println("<p> Grand Total: "+ nf.format(grandTotal) + "</p>");
        %>
    </body>
</html>
