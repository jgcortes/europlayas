
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when some options have been discarded during the search.
 * 
 * <p>Clase Java para LowFareSearchWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowFareSearchWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Warning"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowFareSearchWarning")
@XmlSeeAlso({
    IncompleteSearchWarning.class,
    UnusedLowFareSearchParameterWarning.class,
    IncompleteOneWayCombinableSearchWarning.class,
    OptionDiscardedSearchWarning.class,
    PaymentCardFeeMissingWarning.class
})
public class LowFareSearchWarning
    extends Warning
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public LowFareSearchWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LowFareSearchWarning(final String message, final ItineraryIdList itineraries) {
        super(message, itineraries);
    }

}
