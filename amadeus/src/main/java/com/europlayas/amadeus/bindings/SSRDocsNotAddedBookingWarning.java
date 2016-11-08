
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when some SSRDocs could not be added in the PNR.
 * 
 * <p>Clase Java para SSRDocsNotAddedBookingWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSRDocsNotAddedBookingWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookWarning"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRDocsNotAddedBookingWarning")
public class SSRDocsNotAddedBookingWarning
    extends BookWarning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public SSRDocsNotAddedBookingWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SSRDocsNotAddedBookingWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
