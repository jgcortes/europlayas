
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out the absence of applicable fares to the requestor. Such error may occur for the following reasons : the provider does not find appicable fares, there is not enough available to meet requested requirements. This absence of applicable fares has caused a processing failure.
 * 
 * <p>Clase Java para NoFareApplicableFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NoFareApplicableFault"&gt;
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
@XmlType(name = "NoFareApplicableFault")
@XmlRootElement(name = "noFareApplicableFault")
public class NoFareApplicableFault
    extends Fault
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public NoFareApplicableFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NoFareApplicableFault(final ItineraryIdList itineraries) {
        super(itineraries);
    }

}
