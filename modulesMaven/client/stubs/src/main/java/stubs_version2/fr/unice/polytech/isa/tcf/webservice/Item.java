
package fr.unice.polytech.isa.tcf.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cookie" type="{http://webservice.tcf.isa.polytech.unice.fr/}cookies" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "cookie",
    "quantity"
})
public class Item {

    protected Cookies cookie;
    protected int quantity;

    /**
     * Gets the value of the cookie property.
     * 
     * @return
     *     possible object is
     *     {@link Cookies }
     *     
     */
    public Cookies getCookie() {
        return cookie;
    }

    /**
     * Sets the value of the cookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cookies }
     *     
     */
    public void setCookie(Cookies value) {
        this.cookie = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
