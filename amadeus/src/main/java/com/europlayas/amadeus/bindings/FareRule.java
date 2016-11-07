
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Structured rules text of specific fare (pair fare basis, segment)
 * 
 * <p>Clase Java para FareRule complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FareRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareDescriptionType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="generalInformation" type="{http://ws.amadeus.fr/air}FareRulesDescriptions" minOccurs="0"/&gt;
 *         &lt;element name="ticketEndorsement" type="{http://ws.amadeus.fr/air}FareRulesDescriptions" minOccurs="0"/&gt;
 *         &lt;element name="penalties" type="{http://ws.amadeus.fr/air}FareRulesDescriptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="segmentId" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *       &lt;attribute name="fareBasis" use="required" type="{http://ws.amadeus.fr/air}FareBasis" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRule", propOrder = {
    "fareDescriptionType",
    "generalInformation",
    "ticketEndorsement",
    "penalties"
})
public class FareRule {

    protected String fareDescriptionType;
    protected FareRulesDescriptions generalInformation;
    protected FareRulesDescriptions ticketEndorsement;
    protected FareRulesDescriptions penalties;
    @XmlAttribute(name = "segmentId", required = true)
    protected int segmentId;
    @XmlAttribute(name = "fareBasis", required = true)
    protected String fareBasis;

    /**
     * Default no-arg constructor
     * 
     */
    public FareRule() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FareRule(final String fareDescriptionType, final FareRulesDescriptions generalInformation, final FareRulesDescriptions ticketEndorsement, final FareRulesDescriptions penalties, final int segmentId, final String fareBasis) {
        this.fareDescriptionType = fareDescriptionType;
        this.generalInformation = generalInformation;
        this.ticketEndorsement = ticketEndorsement;
        this.penalties = penalties;
        this.segmentId = segmentId;
        this.fareBasis = fareBasis;
    }

    /**
     * Obtiene el valor de la propiedad fareDescriptionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareDescriptionType() {
        return fareDescriptionType;
    }

    /**
     * Define el valor de la propiedad fareDescriptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareDescriptionType(String value) {
        this.fareDescriptionType = value;
    }

    /**
     * Obtiene el valor de la propiedad generalInformation.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesDescriptions }
     *     
     */
    public FareRulesDescriptions getGeneralInformation() {
        return generalInformation;
    }

    /**
     * Define el valor de la propiedad generalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesDescriptions }
     *     
     */
    public void setGeneralInformation(FareRulesDescriptions value) {
        this.generalInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketEndorsement.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesDescriptions }
     *     
     */
    public FareRulesDescriptions getTicketEndorsement() {
        return ticketEndorsement;
    }

    /**
     * Define el valor de la propiedad ticketEndorsement.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesDescriptions }
     *     
     */
    public void setTicketEndorsement(FareRulesDescriptions value) {
        this.ticketEndorsement = value;
    }

    /**
     * Obtiene el valor de la propiedad penalties.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesDescriptions }
     *     
     */
    public FareRulesDescriptions getPenalties() {
        return penalties;
    }

    /**
     * Define el valor de la propiedad penalties.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesDescriptions }
     *     
     */
    public void setPenalties(FareRulesDescriptions value) {
        this.penalties = value;
    }

    /**
     * Obtiene el valor de la propiedad segmentId.
     * 
     */
    public int getSegmentId() {
        return segmentId;
    }

    /**
     * Define el valor de la propiedad segmentId.
     * 
     */
    public void setSegmentId(int value) {
        this.segmentId = value;
    }

    /**
     * Obtiene el valor de la propiedad fareBasis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Define el valor de la propiedad fareBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

}
