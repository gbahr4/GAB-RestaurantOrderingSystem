/*
 * Purpose: Menu Entity Class
 * Author: Greg Bahr
 * Revision: 2.0
 */
package Persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gregbahr
 */
@Entity
@Table(name = "dinner_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DinnerMenu.findAll", query = "SELECT d FROM DinnerMenu d"),
    @NamedQuery(name = "DinnerMenu.findByItemId", query = "SELECT d FROM DinnerMenu d WHERE d.itemId = :itemId"),
    @NamedQuery(name = "DinnerMenu.findByItemName", query = "SELECT d FROM DinnerMenu d WHERE d.itemName = :itemName"),
    @NamedQuery(name = "DinnerMenu.findByItemPrice", query = "SELECT d FROM DinnerMenu d WHERE d.itemPrice = :itemPrice")})
public class DinnerMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @Size(max = 45)
    @Column(name = "item_name")
    private String itemName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "item_price")
    private Double itemPrice;

    public DinnerMenu() {
    }

    public DinnerMenu(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DinnerMenu)) {
            return false;
        }
        DinnerMenu other = (DinnerMenu) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.DinnerMenu[ itemId=" + itemId + " ]";
    }
    
}
