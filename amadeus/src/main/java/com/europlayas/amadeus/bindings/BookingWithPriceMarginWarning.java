
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the final price is different from the requested price, but the price difference is inside the price margin.
 * 
 * <p>Clase Java para BookingWithPriceMarginWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookingWithPriceMarginWarning"&gt;
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
@XmlType(name = "BookingWithPriceMarginWarning")
public class BookingWithPriceMarginWarning
    extends BookWarning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public BookingWithPriceMarginWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookingWithPriceMarginWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
