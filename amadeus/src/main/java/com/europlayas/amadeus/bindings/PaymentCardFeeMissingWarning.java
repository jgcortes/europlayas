
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the payment card fees cannot be calculated
 * 
 * <p>Clase Java para PaymentCardFeeMissingWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardFeeMissingWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}LowFareSearchWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlines" type="{http://ws.amadeus.fr/air}AirlineCodeList"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="provider" use="required" type="{http://ws.amadeus.fr/air}Provider" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardFeeMissingWarning", propOrder = {
    "airlines"
})
public class PaymentCardFeeMissingWarning
    extends LowFareSearchWarning
    implements Serializable
{

    @XmlElement(required = true)
    protected AirlineCodeList airlines;
    @XmlAttribute(name = "provider", required = true)
    protected Provider provider;

    /**
     * Default no-arg constructor
     * 
     */
    public PaymentCardFeeMissingWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PaymentCardFeeMissingWarning(final String message, final ItineraryIdList itineraries, final AirlineCodeList airlines, final Provider provider) {
        super(message, itineraries);
        this.airlines = airlines;
        this.provider = provider;
    }

    /**
     * Obtiene el valor de la propiedad airlines.
     * 
     * @return
     *     possible object is
     *     {@link AirlineCodeList }
     *     
     */
    public AirlineCodeList getAirlines() {
        return airlines;
    }

    /**
     * Define el valor de la propiedad airlines.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineCodeList }
     *     
     */
    public void setAirlines(AirlineCodeList value) {
        this.airlines = value;
    }

    /**
     * Obtiene el valor de la propiedad provider.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Define el valor de la propiedad provider.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

}
