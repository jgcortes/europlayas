
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.PaymentCardBrand;


/**
 * Warning reported that a payment card fee could not be fetch
 * 
 * <p>Clase Java para IncompletePaymentCardFeeWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompletePaymentCardFeeWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}GetInfoWarning"&gt;
 *       &lt;attribute name="brand" use="required" type="{http://ws.amadeus.fr/common}PaymentCardBrand" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompletePaymentCardFeeWarning")
public class IncompletePaymentCardFeeWarning
    extends GetInfoWarning
{

    @XmlAttribute(name = "brand", required = true)
    protected PaymentCardBrand brand;

    /**
     * Default no-arg constructor
     * 
     */
    public IncompletePaymentCardFeeWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompletePaymentCardFeeWarning(final String message, final ItineraryIdList itineraries, final PaymentCardBrand brand) {
        super(message, itineraries);
        this.brand = brand;
    }

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardBrand }
     *     
     */
    public PaymentCardBrand getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardBrand }
     *     
     */
    public void setBrand(PaymentCardBrand value) {
        this.brand = value;
    }

}
