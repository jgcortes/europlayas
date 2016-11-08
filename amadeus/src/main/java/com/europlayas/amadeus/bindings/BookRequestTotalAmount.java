
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Total price of the trip all extra fees included.
 * 
 * <p>Clase Java para BookRequestTotalAmount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookRequestTotalAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}CurrencyAmount"&gt;
 *       &lt;attribute name="billingCurrency" type="{http://ws.amadeus.fr/common}CurrencyCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookRequestTotalAmount")
public class BookRequestTotalAmount
    extends CurrencyAmount
    implements Serializable
{

    @XmlAttribute(name = "billingCurrency")
    protected com.europlayas.amadeus.bindings.common.CurrencyCode billingCurrency;

    /**
     * Default no-arg constructor
     * 
     */
    public BookRequestTotalAmount() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BookRequestTotalAmount(final BigDecimal amount, final com.europlayas.amadeus.bindings.CurrencyCode currencyCode, final com.europlayas.amadeus.bindings.common.CurrencyCode billingCurrency) {
        super(amount, currencyCode);
        this.billingCurrency = billingCurrency;
    }

    /**
     * Obtiene el valor de la propiedad billingCurrency.
     * 
     * @return
     *     possible object is
     *     {@link com.europlayas.amadeus.bindings.common.CurrencyCode }
     *     
     */
    public com.europlayas.amadeus.bindings.common.CurrencyCode getBillingCurrency() {
        return billingCurrency;
    }

    /**
     * Define el valor de la propiedad billingCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link com.europlayas.amadeus.bindings.common.CurrencyCode }
     *     
     */
    public void setBillingCurrency(com.europlayas.amadeus.bindings.common.CurrencyCode value) {
        this.billingCurrency = value;
    }

}
