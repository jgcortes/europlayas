
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Remark with category
 * 
 * <p>Clase Java para CategorisedRemark complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CategorisedRemark"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}AbstractRemarkWithItineraries"&gt;
 *       &lt;attribute name="category" use="required" type="{http://ws.amadeus.fr/common}Alpha-1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategorisedRemark")
public class CategorisedRemark
    extends AbstractRemarkWithItineraries
    implements Serializable
{

    @XmlAttribute(name = "category", required = true)
    protected String category;

    /**
     * Default no-arg constructor
     * 
     */
    public CategorisedRemark() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CategorisedRemark(final String text, final ItineraryIdList itineraries, final String category) {
        super(text, itineraries);
        this.category = category;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
