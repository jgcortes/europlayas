
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
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
    "missingRequiredContactInformationInconsistencies"
})
public class ContactInformationInconsistency implements Serializable
{

    @XmlElement(name = "missingRequiredContactInformationInconsistency", required = true)
    @XmlSchemaType(name = "string")
    protected List<MissingRequiredContactInformationInconsistency> missingRequiredContactInformationInconsistencies;

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
    public ContactInformationInconsistency(final List<MissingRequiredContactInformationInconsistency> missingRequiredContactInformationInconsistencies) {
        this.missingRequiredContactInformationInconsistencies = missingRequiredContactInformationInconsistencies;
    }

    /**
     * Gets the value of the missingRequiredContactInformationInconsistencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingRequiredContactInformationInconsistencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingRequiredContactInformationInconsistencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissingRequiredContactInformationInconsistency }
     * 
     * 
     */
    public List<MissingRequiredContactInformationInconsistency> getMissingRequiredContactInformationInconsistencies() {
        if (missingRequiredContactInformationInconsistencies == null) {
            missingRequiredContactInformationInconsistencies = new ArrayList<MissingRequiredContactInformationInconsistency>();
        }
        return this.missingRequiredContactInformationInconsistencies;
    }

}
