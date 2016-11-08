
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fault when the booking lead to a duplicate on suplier side.
 * 
 * <p>Clase Java para DuplicateBookingFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DuplicateBookingFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookFault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateBookingFault")
@XmlRootElement(name = "duplicateBookingFault")
public class DuplicateBookingFault
    extends BookFault
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public DuplicateBookingFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DuplicateBookingFault(final ItineraryIdList itineraries) {
        super(itineraries);
    }

}
