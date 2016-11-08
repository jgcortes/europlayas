
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the search could not be performed completely.
 * 
 * <p>Clase Java para IncompleteSearchWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncompleteSearchWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}LowFareSearchWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="failedPassengerFareOptionGroup" type="{http://ws.amadeus.fr/air}PassengerFareOptionList" maxOccurs="2"/&gt;
 *         &lt;element name="cause" type="{http://ws.amadeus.fr/air}Fault"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompleteSearchWarning", propOrder = {
    "failedPassengerFareOptionGroups",
    "cause"
})
public class IncompleteSearchWarning
    extends LowFareSearchWarning
    implements Serializable
{

    @XmlElement(name = "failedPassengerFareOptionGroup", required = true)
    protected List<PassengerFareOptionList> failedPassengerFareOptionGroups;
    @XmlElement(required = true)
    protected Fault cause;
    @XmlAttribute(name = "provider")
    @XmlSchemaType(name = "anySimpleType")
    protected String provider;

    /**
     * Default no-arg constructor
     * 
     */
    public IncompleteSearchWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncompleteSearchWarning(final String message, final ItineraryIdList itineraries, final List<PassengerFareOptionList> failedPassengerFareOptionGroups, final Fault cause, final String provider) {
        super(message, itineraries);
        this.failedPassengerFareOptionGroups = failedPassengerFareOptionGroups;
        this.cause = cause;
        this.provider = provider;
    }

    /**
     * Gets the value of the failedPassengerFareOptionGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failedPassengerFareOptionGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailedPassengerFareOptionGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerFareOptionList }
     * 
     * 
     */
    public List<PassengerFareOptionList> getFailedPassengerFareOptionGroups() {
        if (failedPassengerFareOptionGroups == null) {
            failedPassengerFareOptionGroups = new ArrayList<PassengerFareOptionList>();
        }
        return this.failedPassengerFareOptionGroups;
    }

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setCause(Fault value) {
        this.cause = value;
    }

    /**
     * Obtiene el valor de la propiedad provider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Define el valor de la propiedad provider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

}
