
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * This fault points out a booking failure to the requestor. Such failure may occur for the following reasons : the payment card is declined by supplier, the provider or airline does not allow the sell for an unknown reason.
 * 
 * <p>Clase Java para BookingFailureFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookingFailureFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookFault"&gt;
 *       &lt;attribute name="paymentCardDeclined" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingFailureFault")
public class BookingFailureFault
    extends BookFault
{

    @XmlAttribute(name = "paymentCardDeclined")
    protected Boolean paymentCardDeclined;

    /**
     * Default no-arg constructor
     * 
     */
    public BookingFailureFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookingFailureFault(final ItineraryIdList itineraries, final Boolean paymentCardDeclined) {
        super(itineraries);
        this.paymentCardDeclined = paymentCardDeclined;
    }

    /**
     * Obtiene el valor de la propiedad paymentCardDeclined.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentCardDeclined() {
        return paymentCardDeclined;
    }

    /**
     * Define el valor de la propiedad paymentCardDeclined.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentCardDeclined(Boolean value) {
        this.paymentCardDeclined = value;
    }

}
