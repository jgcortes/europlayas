
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Optional information for billing
 * 
 * <p>Clase Java para InvoiceInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="postalAddress" type="{http://ws.amadeus.fr/common}NamedPostalAddress"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInformation", propOrder = {

})
public class InvoiceInformation {

    @XmlElement(required = true)
    protected NamedPostalAddress postalAddress;

    /**
     * Default no-arg constructor
     * 
     */
    public InvoiceInformation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InvoiceInformation(final NamedPostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    /**
     * Obtiene el valor de la propiedad postalAddress.
     * 
     * @return
     *     possible object is
     *     {@link NamedPostalAddress }
     *     
     */
    public NamedPostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Define el valor de la propiedad postalAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPostalAddress }
     *     
     */
    public void setPostalAddress(NamedPostalAddress value) {
        this.postalAddress = value;
    }

}
