
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContactInformationInconsistency complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationInconsistency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="8"&gt;
 *         &lt;element name="missingRequiredContactInformationInconsistency" type="{http://ws.amadeus.fr/air}MissingRequiredContactInformationInconsistency"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationInconsistency", propOrder = {
    "missingRequiredContactInformationInconsistency"
})
public class ContactInformationInconsistency {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<MissingRequiredContactInformationInconsistency> missingRequiredContactInformationInconsistency;

    /**
     * Default no-arg constructor
     * 
     */
    public ContactInformationInconsistency() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ContactInformationInconsistency(final List<MissingRequiredContactInformationInconsistency> missingRequiredContactInformationInconsistency) {
        this.missingRequiredContactInformationInconsistency = missingRequiredContactInformationInconsistency;
    }

    /**
     * Gets the value of the missingRequiredContactInformationInconsistency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingRequiredContactInformationInconsistency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingRequiredContactInformationInconsistency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissingRequiredContactInformationInconsistency }
     * 
     * 
     */
    public List<MissingRequiredContactInformationInconsistency> getMissingRequiredContactInformationInconsistency() {
        if (missingRequiredContactInformationInconsistency == null) {
            missingRequiredContactInformationInconsistency = new ArrayList<MissingRequiredContactInformationInconsistency>();
        }
        return this.missingRequiredContactInformationInconsistency;
    }

}
