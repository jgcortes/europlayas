
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Allotment element for negociated space details as tour reference and tour name
 * 
 * <p>Clase Java para Allotment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Allotment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="tourName"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="15"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="tourReference"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="40"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allotment")
public class Allotment {

    @XmlAttribute(name = "tourName")
    protected String tourName;
    @XmlAttribute(name = "tourReference")
    protected String tourReference;

    /**
     * Default no-arg constructor
     * 
     */
    public Allotment() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Allotment(final String tourName, final String tourReference) {
        this.tourName = tourName;
        this.tourReference = tourReference;
    }

    /**
     * Obtiene el valor de la propiedad tourName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourName() {
        return tourName;
    }

    /**
     * Define el valor de la propiedad tourName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourName(String value) {
        this.tourName = value;
    }

    /**
     * Obtiene el valor de la propiedad tourReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourReference() {
        return tourReference;
    }

    /**
     * Define el valor de la propiedad tourReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourReference(String value) {
        this.tourReference = value;
    }

}
