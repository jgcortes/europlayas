
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Information identifying an Air queue in Amadeus queue sytem.
 * 
 * <p>Clase Java para AirAmadeusQueue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirAmadeusQueue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="itemNumber" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;pattern value="[0-9A-Z]{1,3}"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="number" use="required" type="{http://ws.amadeus.fr/common}Unsigned0To99Byte" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAmadeusQueue", propOrder = {
    "category"
})
public class AirAmadeusQueue {

    protected AirAmadeusQueue.Category category;
    @XmlAttribute(name = "number", required = true)
    protected short number;

    /**
     * Default no-arg constructor
     * 
     */
    public AirAmadeusQueue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AirAmadeusQueue(final AirAmadeusQueue.Category category, final short number) {
        this.category = category;
        this.number = number;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link AirAmadeusQueue.Category }
     *     
     */
    public AirAmadeusQueue.Category getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link AirAmadeusQueue.Category }
     *     
     */
    public void setCategory(AirAmadeusQueue.Category value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     */
    public short getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     */
    public void setNumber(short value) {
        this.number = value;
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
     *       &lt;attribute name="itemNumber" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;pattern value="[0-9A-Z]{1,3}"/&gt;
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
    @XmlType(name = "")
    public static class Category {

        @XmlAttribute(name = "itemNumber", required = true)
        protected String itemNumber;

        /**
         * Default no-arg constructor
         * 
         */
        public Category() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Category(final String itemNumber) {
            this.itemNumber = itemNumber;
        }

        /**
         * Obtiene el valor de la propiedad itemNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemNumber() {
            return itemNumber;
        }

        /**
         * Define el valor de la propiedad itemNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemNumber(String value) {
            this.itemNumber = value;
        }

    }

}
