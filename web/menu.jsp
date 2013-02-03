<%-- 
    Purpose: Menu Web Page
    Author: Greg Bahr
    Revision: 2.0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Menu</h1>
        
    </body>
</html><form name="Menu" action="RestaurantController" method="POST">
    Prime Rib &nbsp;  $22.99 &nbsp  Qty. &nbsp;
    
    <input type="checkbox" name="primeRib" value="22.99" /></br></br>
    
    Pork Tenderloin &nbsp;  $18.99 &nbsp  Qty. &nbsp;
    
   <input type="checkbox" name="porkTenderloin" value="18.99" /></br></br>
    
    Chicken Cordon Bleu &nbsp;  $17.99 &nbsp  Qty. &nbsp;
    
   <input type="checkbox" name="chickenCordonBleu" value="17.99" /></br></br>
    
    French Onion Soup &nbsp;  $4.99 &nbsp  Qty. &nbsp;
    
  <input type="checkbox" name="frenchOnionSoup" value="4.99" /></br></br>
    
    Cobb Salad &nbsp;  $5.99 &nbsp  Qty. &nbsp;
    
    <input type="checkbox" name="cobbSalad" value="5.99" /></br></br>
    
    <input type="submit" value="Order" name="order" />
    
</form>
