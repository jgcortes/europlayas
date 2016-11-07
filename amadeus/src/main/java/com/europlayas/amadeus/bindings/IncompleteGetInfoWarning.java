
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the getInfo could not be performed completely for an itinerary group.
 * 
 * <p>Clase Java para IncompleteGetInfoWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompleteGetInfoWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}GetInfoWarning"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompleteGetInfoWarning")
public class IncompleteGetInfoWarning
    extends GetInfoWarning
{


    /**
     * Default no-arg constructor
     * 
     */
    public IncompleteGetInfoWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompleteGetInfoWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
