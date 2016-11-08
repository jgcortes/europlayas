
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Warning reported when the booking could not be confirmed. It may or may not have been made by the provider or airline system underneath.
 * 
 * <p>Clase Java para UnconfirmedBookingWarning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnconfirmedBookingWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookWarning"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unconfirmedSegments"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="unconfirmedSegment" maxOccurs="54"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnconfirmedBookingWarning", propOrder = {
    "unconfirmedSegments"
})
public class UnconfirmedBookingWarning
    extends BookWarning
    implements Serializable
{

    @XmlElement(required = true)
    protected UnconfirmedBookingWarning.UnconfirmedSegments unconfirmedSegments;

    /**
     * Default no-arg constructor
     * 
     */
    public UnconfirmedBookingWarning() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UnconfirmedBookingWarning(final String message, final ItineraryIdList itineraries, final UnconfirmedBookingWarning.UnconfirmedSegments unconfirmedSegments) {
        super(message, itineraries);
        this.unconfirmedSegments = unconfirmedSegments;
    }

    /**
     * Obtiene el valor de la propiedad unconfirmedSegments.
     * 
     * @return
     *     possible object is
     *     {@link UnconfirmedBookingWarning.UnconfirmedSegments }
     *     
     */
    public UnconfirmedBookingWarning.UnconfirmedSegments getUnconfirmedSegments() {
        return unconfirmedSegments;
    }

    /**
     * Define el valor de la propiedad unconfirmedSegments.
     * 
     * @param value
     *     allowed object is
     *     {@link UnconfirmedBookingWarning.UnconfirmedSegments }
     *     
     */
    public void setUnconfirmedSegments(UnconfirmedBookingWarning.UnconfirmedSegments value) {
        this.unconfirmedSegments = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="unconfirmedSegment" maxOccurs="54"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unconfirmedSegments"
    })
    public static class UnconfirmedSegments implements Serializable
    {

        @XmlElement(name = "unconfirmedSegment", required = true)
        protected List<UnconfirmedBookingWarning.UnconfirmedSegments.UnconfirmedSegment> unconfirmedSegments;

        /**
         * Default no-arg constructor
         * 
         */
        public UnconfirmedSegments() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public UnconfirmedSegments(final List<UnconfirmedBookingWarning.UnconfirmedSegments.UnconfirmedSegment> unconfirmedSegments) {
            this.unconfirmedSegments = unconfirmedSegments;
        }

        /**
         * Gets the value of the unconfirmedSegments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unconfirmedSegments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnconfirmedSegments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UnconfirmedBookingWarning.UnconfirmedSegments.UnconfirmedSegment }
         * 
         * 
         */
        public List<UnconfirmedBookingWarning.UnconfirmedSegments.UnconfirmedSegment> getUnconfirmedSegments() {
            if (unconfirmedSegments == null) {
                unconfirmedSegments = new ArrayList<UnconfirmedBookingWarning.UnconfirmedSegments.UnconfirmedSegment>();
            }
            return this.unconfirmedSegments;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="id" use="required" type="{http://ws.amadeus.fr/common}Identifier" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UnconfirmedSegment implements Serializable
        {

            @XmlAttribute(name = "id", required = true)
            protected int id;

            /**
             * Default no-arg constructor
             * 
             */
            public UnconfirmedSegment() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public UnconfirmedSegment(final int id) {
                this.id = id;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             */
            public int getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             */
            public void setId(int value) {
                this.id = value;
            }

        }

    }

}
