
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.PaymentCardBrand;


/**
 * This fault points out an payment card brand not supported by a supplier
 * 
 * <p>Clase Java para UnsupportedPaymentCardTypeFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnsupportedPaymentCardTypeFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Fault"&gt;
 *       &lt;attribute name="cardBrand" use="required" type="{http://ws.amadeus.fr/common}PaymentCardBrand" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsupportedPaymentCardTypeFault")
@XmlRootElement(name = "unsupportedPaymentCardTypeFault")
public class UnsupportedPaymentCardTypeFault
    extends Fault
    implements Serializable
{

    @XmlAttribute(name = "cardBrand", required = true)
    protected PaymentCardBrand cardBrand;

    /**
     * Default no-arg constructor
     * 
     */
    public UnsupportedPaymentCardTypeFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UnsupportedPaymentCardTypeFault(final ItineraryIdList itineraries, final PaymentCardBrand cardBrand) {
        super(itineraries);
        this.cardBrand = cardBrand;
    }

    /**
     * Obtiene el valor de la propiedad cardBrand.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardBrand }
     *     
     */
    public PaymentCardBrand getCardBrand() {
        return cardBrand;
    }

    /**
     * Define el valor de la propiedad cardBrand.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardBrand }
     *     
     */
    public void setCardBrand(PaymentCardBrand value) {
        this.cardBrand = value;
    }

}
