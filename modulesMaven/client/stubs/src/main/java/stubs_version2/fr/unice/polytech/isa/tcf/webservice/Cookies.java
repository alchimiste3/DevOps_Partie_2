
package fr.unice.polytech.isa.tcf.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cookies.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cookies">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHOCOLALALA"/>
 *     &lt;enumeration value="DARK_TEMPTATION"/>
 *     &lt;enumeration value="SOO_CHOCOLATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cookies")
@XmlEnum
public enum Cookies {

    CHOCOLALALA,
    DARK_TEMPTATION,
    SOO_CHOCOLATE;

    public String value() {
        return name();
    }

    public static Cookies fromValue(String v) {
        return valueOf(v);
    }

}
