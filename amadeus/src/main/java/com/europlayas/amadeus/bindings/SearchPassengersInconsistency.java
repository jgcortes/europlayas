
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Inconsistency information for a list of passenger information, in search context.
 * 
 * <p>Clase Java para SearchPassengersInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchPassengersInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/air}PassengersInconsistency"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPassengersInconsistency")
public class SearchPassengersInconsistency
    extends PassengersInconsistency
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public SearchPassengersInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SearchPassengersInconsistency(final PassengersInconsistency.UnsupportedPassengers unsupportedPassengers, final AdditionalServicesInconsistency additionalServicesInconsistency, final InconsistentRemark inconsistentRemark, final boolean notEnoughAccompanyingAdults) {
        super(unsupportedPassengers, additionalServicesInconsistency, inconsistentRemark, notEnoughAccompanyingAdults);
    }

}
