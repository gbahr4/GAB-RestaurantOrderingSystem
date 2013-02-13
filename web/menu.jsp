<%-- 
    Purpose: Menu Web Page
    Author: Greg Bahr
    Revision: 3.0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        <script type ="text/javascript">
            function validate() {
                var x=document.getElementsByName('menuItems');
               
                    for(var i=0;i<x.length;i++){ 
                    if(x[i].checked)
                        return true; 
                    } 
                alert("You must make at least one selection")   
                return false; 
                
            }
        </script>
    </head>
    <body>
        <h1>Menu</h1>
        
      
    
    
<form name="Menu" action="OrderController" method="POST" onsubmit =" return validate()">
    

    <h2>Entrees</h2>
    
    <input type="checkbox" name="menuItems" value="Prime Rib,22.99"/>
    Prime Rib &nbsp;  $22.99 </br></br>
    
    <input type="checkbox" name="menuItems" value="Pork Tenderloin,18.99" />
    Pork Tenderloin &nbsp;  $18.99 </br></br>
   
    <input type="checkbox" name="menuItems" value="Chicken Cordon Bleu,17.99" />
    Chicken Cordon Bleu &nbsp;  $17.99 </br></br>
    
   <h2>Sides</h2>
    
    <input type="checkbox" name="menuItems" value="Double Baked Potato,2.99" />
    Double Baked Potato &nbsp;  $2.99 </br></br>
    
    <input type="checkbox" name="menuItems" value="Rice Pilaf,2.99" />
    Rice Pilaf &nbsp;  $2.99 </br></br>
   
    <input type="checkbox" name="menuItems" value="Vegetable Medley,2.99" />
    Vegetable Medley &nbsp;  $2.99 </br></br>
    
    <h2>Soups and Salads</h2>
    
    <input type="checkbox" name="menuItems" value="French Onion Soup,4.99" />
    French Onion Soup &nbsp;  $4.99 </br></br>
    
    <input type="checkbox" name="menuItems" value="Caesar Salad,5.99" />
    Caesar Salad &nbsp;  $5.99 </br></br>
   
    <input type="checkbox" name="menuItems" value="Cobb Salad,5.99" />
    Cobb Salad &nbsp;  $5.99 </br></br>
    
    <h2>Beverages</h2>
    
    <input type="checkbox" name="menuItems" value="Heineken,2.99" />
    Heineken &nbsp;  $2.99 </br></br>
    
    <input type="checkbox" name="menuItems" value="Vodka Martini,3.99" />
    Vodka Martini &nbsp;  $3.99 </br></br>
   
    <input type="checkbox" name="menuItems" value="Chardonnay,3.99" />
    Chardonnay &nbsp;  $3.99 </br></br> 
    
    <input type="submit" value="Order" name="order" />
   
    
  
    
  
</form>

 </body>
</html>