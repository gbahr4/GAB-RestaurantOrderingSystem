
package Model;

/**
 * Purpose: Restaurant Ordering System Controller
 * Author: Greg Bahr
 * Revision: 1.0
 */
public class RestaurantModel {
    private double price1, price2,price3,price4,price5;
    
    public Object calculateTotalBill(String item1, String item2, String item3,
            String item4, String item5) {
        if(item1!=null){
          price1 =  Double.parseDouble(item1);
           }
        if(item2!=null){
          price2 = Double.parseDouble(item2);
           }
        if(item3!=null){
          price3 =Double.parseDouble(item3);
            }
        if(item4!=null){
          price4 =Double.parseDouble(item4);
            }
        if(item5!=null){
          price5 =Double.parseDouble(item5);
            } 
        
        Object totalBill = price1 + price2 + price3 + price4 + price5;
        return totalBill;
    }
    
    public Object calculateTax(Object totalBill) {
          String str = totalBill.toString(); 
          double d = Double.valueOf(str).doubleValue();
          Object tax = d * .05;
          return tax;
    }
    
    public Object calculateTip(Object totalBill, Object tax) {
          String str = totalBill.toString(); 
          double d = Double.valueOf(str).doubleValue();
          String str2 = tax.toString(); 
          double d2 = Double.valueOf(str2).doubleValue();
          Object tip = (d + d2) * .20;
          return tip;
    }
    
    public Object calculateGrandTotal(Object totalBill, Object tax, Object tip) {
          String str = totalBill.toString(); 
          double d = Double.valueOf(str).doubleValue();
          String str2 = tax.toString(); 
          double d2 = Double.valueOf(str2).doubleValue();
          String str3 = tip.toString(); 
          double d3 = Double.valueOf(str3).doubleValue();
          Object  grandTotal = (d + d2 + d3);
          return grandTotal;
    }
    
}
