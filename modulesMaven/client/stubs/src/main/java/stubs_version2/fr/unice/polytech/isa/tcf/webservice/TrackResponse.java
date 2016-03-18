
package fr.unice.polytech.isa.tcf.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trackResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trackResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://webservice.tcf.isa.polytech.unice.fr/}orderStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackResponse", propOrder = {
    "status"
})
public class TrackResponse {

    protected OrderStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setStatus(OrderStatus value) {
        this.status = value;
    }

}
