
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out inconsistencies in the search fare notes request to the requestor. These inconsistencies have caused a search fare notes failure. Composed of at least one inconsistency.
 * 
 * <p>Clase Java para InconsistentGetFareNotesRequestFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InconsistentGetFareNotesRequestFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}InconsistentGetInfoRequestFault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InconsistentGetFareNotesRequestFault")
public class InconsistentGetFareNotesRequestFault
    extends InconsistentGetInfoRequestFault
{


    /**
     * Default no-arg constructor
     * 
     */
    public InconsistentGetFareNotesRequestFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InconsistentGetFareNotesRequestFault(final ItineraryIdList itineraries, final ItineraryInconsistency itineraryInconsistency, final PassengersInconsistency passengersInconsistency, final FareTypeInconsistency fareTypeInconsistency, final GetInfoPricingInconsistency pricingInconsistency, final SegmentList inconsistentSegments) {
        super(itineraries, itineraryInconsistency, passengersInconsistency, fareTypeInconsistency, pricingInconsistency, inconsistentSegments);
    }

}
