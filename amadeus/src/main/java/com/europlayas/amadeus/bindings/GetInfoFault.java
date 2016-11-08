
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetInfoFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetInfoFault"&gt;
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
@XmlType(name = "GetInfoFault")
@XmlSeeAlso({
    InconsistentGetInfoRequestFault.class
})
public class GetInfoFault
    extends Fault
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public GetInfoFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetInfoFault(final ItineraryIdList itineraries) {
        super(itineraries);
    }

}
