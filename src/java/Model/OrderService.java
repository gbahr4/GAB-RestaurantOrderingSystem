
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *  Purpose: Order Service
 *  Author: Greg Bahr
 *  Revision: 3.0
 */
public class OrderService {

    private List<MenuItem> orderList;
    private double totalBill;
    private static final double TAX_RATE = .05;
    private static final double TIP_PERCENTAGE = .20;
    
    /**
     * order service constructor
     */
    public OrderService() {
        orderList = new ArrayList<MenuItem>();
    }
    
    /**
     * 
     * @param order
     * @return totalBill
     * returns the total bill before tax and tip
     */
    public final Double calculateTotalBill(String[] order) {
         totalBill = 0.0;

         // each item is in format name,price
        for (int i = 0; i<order.length; i++) {
            String[] namePrice = order[i].split(",");
            MenuItem item = new MenuItem();
            item.setItemName(namePrice[0]);
            item.setItemPrice(Double.valueOf(namePrice[1]));
            orderList.add(item);
            totalBill  += Double.valueOf(namePrice[1]);
        }
        
        return totalBill;
    }
    
    /**
     * 
     * @param totalBill
     * @return tax
     * returns the tax
     */
    public final Object calculateTax(Object totalBill) {
          String str = totalBill.toString(); 
          double d = Double.valueOf(str).doubleValue();
          Object tax = d * TAX_RATE;
          return tax;
    }
    
    /**
     * 
     * @param totalBill
     * @param tax
     * @returns the suggested tip 
     */
    public final Object calculateTip(Object totalBill, Object tax) {
          String str = totalBill.toString(); 
          double d = Double.valueOf(str).doubleValue();
          String str2 = tax.toString(); 
          double d2 = Double.valueOf(str2).doubleValue();
          Object tip = (d + d2) * TIP_PERCENTAGE;
          return tip;
    }
    
    /**
     * 
     * @param totalBill
     * @param tax
     * @param tip
     * @return grand total
     * returns the grand total including the total bill with tax and
     * suggested tip added
     */
    public final Object calculateGrandTotal(Object totalBill, Object tax, Object tip) {
          String str = totalBill.toString(); 
          double d = Double.valueOf(str).doubleValue();
          String str2 = tax.toString(); 
          double d2 = Double.valueOf(str2).doubleValue();
          String str3 = tip.toString(); 
          double d3 = Double.valueOf(str3).doubleValue();
          Object  grandTotal = (d + d2 + d3);
          return grandTotal;
    } 
    
    /**
     * 
     * @return order list
     * returns the list of items ordered
     */
    public List<MenuItem> getOrderList() {
        return orderList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.orderList != null ? this.orderList.hashCode() : 0);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.totalBill) ^ (Double.doubleToLongBits(this.totalBill) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderService other = (OrderService) obj;
        if (this.orderList != other.orderList && (this.orderList == null || !this.orderList.equals(other.orderList))) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalBill) != Double.doubleToLongBits(other.totalBill)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderService{" + "orderList=" + orderList + ", totalBill=" + totalBill + '}';
    }

    

    
    

   
    
}
