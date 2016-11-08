
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out an unknown error to the requestor.
 * 
 * <p>Clase Java para UnknownErrorFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnknownErrorFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Fault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownErrorFault")
@XmlRootElement(name = "unknownErrorFault")
public class UnknownErrorFault
    extends Fault
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public UnknownErrorFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UnknownErrorFault(final ItineraryIdList itineraries) {
        super(itineraries);
    }

}
