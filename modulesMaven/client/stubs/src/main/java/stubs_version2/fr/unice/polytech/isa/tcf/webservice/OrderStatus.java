
package fr.unice.polytech.isa.tcf.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VALIDATED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="READY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderStatus")
@XmlEnum
public enum OrderStatus {

    VALIDATED,
    IN_PROGRESS,
    READY;

    public String value() {
        return name();
    }

    public static OrderStatus fromValue(String v) {
        return valueOf(v);
    }

}
