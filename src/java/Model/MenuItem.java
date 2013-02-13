
package Model;

/**
 *  Purpose: Menu Item Class
 *  Author: Greg Bahr
 *  Revision: 3.0
 */
public class MenuItem {
    private String itemName;
    private double itemPrice;
    
    /**
     * default menu item constructor
     */
    public MenuItem() {
    }
    
    /**
     * 
     * @param itemName
     * @param itemPrice 
     * menu item constructor with parameters
     */
    public MenuItem(String itemName, double itemPrice) {
        
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    
    /**
     * 
     * @return itemName
     * returns the item name
     */
    public String getItemName() {
        return itemName;
    }
    
    /**
     * 
     * @param itemName 
     * sets the item name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    /**
     * 
     * @return itemPrice
     * returns the item price
     */
    public double getItemPrice() {
        return itemPrice;
    }
    
    /**
     * 
     * @param itemPrice 
     * sets the item price
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Price: $" + itemPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.itemName != null ? this.itemName.hashCode() : 0);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.itemPrice) ^ (Double.doubleToLongBits(this.itemPrice) >>> 32));
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
        final MenuItem other = (MenuItem) obj;
        if ((this.itemName == null) ? (other.itemName != null) : !this.itemName.equals(other.itemName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemPrice) != Double.doubleToLongBits(other.itemPrice)) {
            return false;
        }
        return true;
    }

    
        
    
    
}
