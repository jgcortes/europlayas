
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the low fare search did not use one of the given requirements
 * 
 * <p>Clase Java para UnusedLowFareSearchParameterWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnusedLowFareSearchParameterWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}LowFareSearchWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cause" type="{http://ws.amadeus.fr/air}UnusedLowFareSearchParameter" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="provider" type="{http://ws.amadeus.fr/air}Provider" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnusedLowFareSearchParameterWarning", propOrder = {
    "cause"
})
public class UnusedLowFareSearchParameterWarning
    extends LowFareSearchWarning
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<UnusedLowFareSearchParameter> cause;
    @XmlAttribute(name = "provider")
    protected Provider provider;

    /**
     * Default no-arg constructor
     * 
     */
    public UnusedLowFareSearchParameterWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UnusedLowFareSearchParameterWarning(final String message, final ItineraryIdList itineraries, final List<UnusedLowFareSearchParameter> cause, final Provider provider) {
        super(message, itineraries);
        this.cause = cause;
        this.provider = provider;
    }

    /**
     * Gets the value of the cause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnusedLowFareSearchParameter }
     * 
     * 
     */
    public List<UnusedLowFareSearchParameter> getCause() {
        if (cause == null) {
            cause = new ArrayList<UnusedLowFareSearchParameter>();
        }
        return this.cause;
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
