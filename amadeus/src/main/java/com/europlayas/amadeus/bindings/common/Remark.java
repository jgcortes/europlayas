
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Remark. 
 * 
 * <p>Clase Java para Remark complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Remark"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}AbstractRemark"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itineraries" type="{http://ws.amadeus.fr/common}ItineraryIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://ws.amadeus.fr/common}RemarkType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remark", propOrder = {
    "itineraries"
})
public class Remark
    extends AbstractRemark
{

    protected ItineraryIdList itineraries;
    @XmlAttribute(name = "type", required = true)
    protected RemarkType type;

    /**
     * Default no-arg constructor
     * 
     */
    public Remark() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Remark(final String text, final ItineraryIdList itineraries, final RemarkType type) {
        super(text);
        this.itineraries = itineraries;
        this.type = type;
    }

    /**
     * Obtiene el valor de la propiedad itineraries.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryIdList }
     *     
     */
    public ItineraryIdList getItineraries() {
        return itineraries;
    }

    /**
     * Define el valor de la propiedad itineraries.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryIdList }
     *     
     */
    public void setItineraries(ItineraryIdList value) {
        this.itineraries = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setType(RemarkType value) {
        this.type = value;
    }

}
