
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract type for faults that occurred during the processing of a message.
 * 
 * <p>Clase Java para Fault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Fault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}Fault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/air}ItineraryIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = {
    "itineraries"
})
@XmlSeeAlso({
    GetInfoFault.class,
    BookFault.class,
    AvailabilitySearchFault.class,
    InconsistentPriceWithInfoRequestFault.class,
    LowFareSearchFault.class,
    SupplierSideFault.class,
    UnsupportedPaymentCardTypeFault.class,
    NoFareApplicableFault.class,
    UnknownErrorFault.class
})
public abstract class Fault
    extends com.europlayas.amadeus.bindings.common.Fault
    implements Serializable
{

    protected ItineraryIdList itineraries;

    /**
     * Default no-arg constructor
     * 
     */
    public Fault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Fault(final ItineraryIdList itineraries) {
        super();
        this.itineraries = itineraries;
    }

    /**
     * Obtiene el valor de la propiedad itineraries.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryIdList }
     *     
     */
    public ItineraryIdList getItineraries() {
        return itineraries;
    }

    /**
     * Define el valor de la propiedad itineraries.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryIdList }
     *     
     */
    public void setItineraries(ItineraryIdList value) {
        this.itineraries = value;
    }

}
