
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Specific local date or range of local dates, at a single specific local time or during a local time window when applicable. Type based on common type DateTimeRange, with appropriate restrictions related to the air domain.
 * 
 * <p>Clase Java para DateTimeRange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DateTimeRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateRange"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element name="extraDaysBeforeOrAfter"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://ws.amadeus.fr/common}YearMonthDayDuration"&gt;
 *                         &lt;pattern value="[\-]?P[1-3]D"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="extraDaysAround"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://ws.amadeus.fr/common}UnsignedYearMonthDayDuration"&gt;
 *                         &lt;pattern value="P[1-3]D"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="timeRange" type="{http://ws.amadeus.fr/air}TimeRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeRange", propOrder = {
    "dateRange",
    "timeRange"
})
public class DateTimeRange {

    @XmlElement(required = true)
    protected DateTimeRange.DateRange dateRange;
    protected TimeRange timeRange;

    /**
     * Default no-arg constructor
     * 
     */
    public DateTimeRange() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DateTimeRange(final DateTimeRange.DateRange dateRange, final TimeRange timeRange) {
        this.dateRange = dateRange;
        this.timeRange = timeRange;
    }

    /**
     * Obtiene el valor de la propiedad dateRange.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRange.DateRange }
     *     
     */
    public DateTimeRange.DateRange getDateRange() {
        return dateRange;
    }

    /**
     * Define el valor de la propiedad dateRange.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRange.DateRange }
     *     
     */
    public void setDateRange(DateTimeRange.DateRange value) {
        this.dateRange = value;
    }

    /**
     * Obtiene el valor de la propiedad timeRange.
     * 
     * @return
     *     possible object is
     *     {@link TimeRange }
     *     
     */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * Define el valor de la propiedad timeRange.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRange }
     *     
     */
    public void setTimeRange(TimeRange value) {
        this.timeRange = value;
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
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element name="extraDaysBeforeOrAfter"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://ws.amadeus.fr/common}YearMonthDayDuration"&gt;
     *               &lt;pattern value="[\-]?P[1-3]D"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="extraDaysAround"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://ws.amadeus.fr/common}UnsignedYearMonthDayDuration"&gt;
     *               &lt;pattern value="P[1-3]D"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="date" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extraDaysBeforeOrAfter",
        "extraDaysAround"
    })
    public static class DateRange {

        protected Duration extraDaysBeforeOrAfter;
        protected Duration extraDaysAround;
        @XmlAttribute(name = "date", required = true)
        protected XMLGregorianCalendar date;

        /**
         * Default no-arg constructor
         * 
         */
        public DateRange() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public DateRange(final Duration extraDaysBeforeOrAfter, final Duration extraDaysAround, final XMLGregorianCalendar date) {
            this.extraDaysBeforeOrAfter = extraDaysBeforeOrAfter;
            this.extraDaysAround = extraDaysAround;
            this.date = date;
        }

        /**
         * Obtiene el valor de la propiedad extraDaysBeforeOrAfter.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getExtraDaysBeforeOrAfter() {
            return extraDaysBeforeOrAfter;
        }

        /**
         * Define el valor de la propiedad extraDaysBeforeOrAfter.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setExtraDaysBeforeOrAfter(Duration value) {
            this.extraDaysBeforeOrAfter = value;
        }

        /**
         * Obtiene el valor de la propiedad extraDaysAround.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getExtraDaysAround() {
            return extraDaysAround;
        }

        /**
         * Define el valor de la propiedad extraDaysAround.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setExtraDaysAround(Duration value) {
            this.extraDaysAround = value;
        }

        /**
         * Obtiene el valor de la propiedad date.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Define el valor de la propiedad date.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }

}
