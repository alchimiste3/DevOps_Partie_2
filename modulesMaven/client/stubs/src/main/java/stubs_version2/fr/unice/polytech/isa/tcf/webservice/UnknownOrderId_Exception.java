
package fr.unice.polytech.isa.tcf.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.10
 * Fri Mar 18 18:31:18 CET 2016
 * Generated source version: 2.2.10
 * 
 */

@WebFault(name = "UnknownOrderId", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/")
public class UnknownOrderId_Exception extends Exception {
    public static final long serialVersionUID = 20160318183118L;
    
    private fr.unice.polytech.isa.tcf.webservice.UnknownOrderId unknownOrderId;

    public UnknownOrderId_Exception() {
        super();
    }
    
    public UnknownOrderId_Exception(String message) {
        super(message);
    }
    
    public UnknownOrderId_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownOrderId_Exception(String message, fr.unice.polytech.isa.tcf.webservice.UnknownOrderId unknownOrderId) {
        super(message);
        this.unknownOrderId = unknownOrderId;
    }

    public UnknownOrderId_Exception(String message, fr.unice.polytech.isa.tcf.webservice.UnknownOrderId unknownOrderId, Throwable cause) {
        super(message, cause);
        this.unknownOrderId = unknownOrderId;
    }

    public fr.unice.polytech.isa.tcf.webservice.UnknownOrderId getFaultInfo() {
        return this.unknownOrderId;
    }
}
