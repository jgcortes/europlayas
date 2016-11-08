
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of corporate codes.
 * 
 * <p>Clase Java para CorporateCodeList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CorporateCodeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="corporateCode" type="{http://ws.amadeus.fr/air}CorporateCode" maxOccurs="6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateCodeList", propOrder = {
    "corporateCodes"
})
public class CorporateCodeList implements Serializable
{

    @XmlElement(name = "corporateCode", required = true)
    protected List<String> corporateCodes;

    /**
     * Default no-arg constructor
     * 
     */
    public CorporateCodeList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CorporateCodeList(final List<String> corporateCodes) {
        this.corporateCodes = corporateCodes;
    }

    /**
     * Gets the value of the corporateCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorporateCodes() {
        if (corporateCodes == null) {
            corporateCodes = new ArrayList<String>();
        }
        return this.corporateCodes;
    }

}
