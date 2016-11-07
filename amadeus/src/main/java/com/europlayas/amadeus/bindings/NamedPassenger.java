
package com.europlayas.amadeus.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.EmergencyContactInformation;
import com.europlayas.amadeus.bindings.common.PassengerIdentity;
import com.europlayas.amadeus.bindings.common.PersonalContactInformation;


/**
 * Named passenger information, including basic and personal information. 
 * 
 * <p>Clase Java para NamedPassenger complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NamedPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Passenger"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identity" type="{http://ws.amadeus.fr/common}PassengerIdentity"/&gt;
 *         &lt;element name="passport" type="{http://ws.amadeus.fr/air}Passport" minOccurs="0"/&gt;
 *         &lt;element name="redress" type="{http://ws.amadeus.fr/air}Redress" minOccurs="0"/&gt;
 *         &lt;element name="contactInformation" type="{http://ws.amadeus.fr/common}PersonalContactInformation" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContactInformation" type="{http://ws.amadeus.fr/common}EmergencyContactInformation" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyPrograms" type="{http://ws.amadeus.fr/air}LoyaltyProgramList" minOccurs="0"/&gt;
 *         &lt;element name="discounts" type="{http://ws.amadeus.fr/air}DiscountList" minOccurs="0"/&gt;
 *         &lt;element name="remarks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="remark" type="{http://ws.amadeus.fr/air}AbstractRemark" maxOccurs="100"/&gt;
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
@XmlType(name = "NamedPassenger", propOrder = {
    "identity",
    "passport",
    "redress",
    "contactInformation",
    "emergencyContactInformation",
    "loyaltyPrograms",
    "discounts",
    "remarks"
})
@XmlSeeAlso({
    HeldInfantNamedPassenger.class,
    SeatedNamedPassenger.class
})
public abstract class NamedPassenger
    extends Passenger
{

    @XmlElement(required = true)
    protected PassengerIdentity identity;
    protected Passport passport;
    protected Redress redress;
    protected PersonalContactInformation contactInformation;
    protected EmergencyContactInformation emergencyContactInformation;
    protected LoyaltyProgramList loyaltyPrograms;
    protected DiscountList discounts;
    protected NamedPassenger.Remarks remarks;

    /**
     * Default no-arg constructor
     * 
     */
    public NamedPassenger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NamedPassenger(final int id, final PassengerIdentity identity, final Passport passport, final Redress redress, final PersonalContactInformation contactInformation, final EmergencyContactInformation emergencyContactInformation, final LoyaltyProgramList loyaltyPrograms, final DiscountList discounts, final NamedPassenger.Remarks remarks) {
        super(id);
        this.identity = identity;
        this.passport = passport;
        this.redress = redress;
        this.contactInformation = contactInformation;
        this.emergencyContactInformation = emergencyContactInformation;
        this.loyaltyPrograms = loyaltyPrograms;
        this.discounts = discounts;
        this.remarks = remarks;
    }

    /**
     * Obtiene el valor de la propiedad identity.
     * 
     * @return
     *     possible object is
     *     {@link PassengerIdentity }
     *     
     */
    public PassengerIdentity getIdentity() {
        return identity;
    }

    /**
     * Define el valor de la propiedad identity.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerIdentity }
     *     
     */
    public void setIdentity(PassengerIdentity value) {
        this.identity = value;
    }

    /**
     * Obtiene el valor de la propiedad passport.
     * 
     * @return
     *     possible object is
     *     {@link Passport }
     *     
     */
    public Passport getPassport() {
        return passport;
    }

    /**
     * Define el valor de la propiedad passport.
     * 
     * @param value
     *     allowed object is
     *     {@link Passport }
     *     
     */
    public void setPassport(Passport value) {
        this.passport = value;
    }

    /**
     * Obtiene el valor de la propiedad redress.
     * 
     * @return
     *     possible object is
     *     {@link Redress }
     *     
     */
    public Redress getRedress() {
        return redress;
    }

    /**
     * Define el valor de la propiedad redress.
     * 
     * @param value
     *     allowed object is
     *     {@link Redress }
     *     
     */
    public void setRedress(Redress value) {
        this.redress = value;
    }

    /**
     * Obtiene el valor de la propiedad contactInformation.
     * 
     * @return
     *     possible object is
     *     {@link PersonalContactInformation }
     *     
     */
    public PersonalContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Define el valor de la propiedad contactInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalContactInformation }
     *     
     */
    public void setContactInformation(PersonalContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad emergencyContactInformation.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyContactInformation }
     *     
     */
    public EmergencyContactInformation getEmergencyContactInformation() {
        return emergencyContactInformation;
    }

    /**
     * Define el valor de la propiedad emergencyContactInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyContactInformation }
     *     
     */
    public void setEmergencyContactInformation(EmergencyContactInformation value) {
        this.emergencyContactInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad loyaltyPrograms.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramList }
     *     
     */
    public LoyaltyProgramList getLoyaltyPrograms() {
        return loyaltyPrograms;
    }

    /**
     * Define el valor de la propiedad loyaltyPrograms.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramList }
     *     
     */
    public void setLoyaltyPrograms(LoyaltyProgramList value) {
        this.loyaltyPrograms = value;
    }

    /**
     * Obtiene el valor de la propiedad discounts.
     * 
     * @return
     *     possible object is
     *     {@link DiscountList }
     *     
     */
    public DiscountList getDiscounts() {
        return discounts;
    }

    /**
     * Define el valor de la propiedad discounts.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountList }
     *     
     */
    public void setDiscounts(DiscountList value) {
        this.discounts = value;
    }

    /**
     * Obtiene el valor de la propiedad remarks.
     * 
     * @return
     *     possible object is
     *     {@link NamedPassenger.Remarks }
     *     
     */
    public NamedPassenger.Remarks getRemarks() {
        return remarks;
    }

    /**
     * Define el valor de la propiedad remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPassenger.Remarks }
     *     
     */
    public void setRemarks(NamedPassenger.Remarks value) {
        this.remarks = value;
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
     *         &lt;element name="remark" type="{http://ws.amadeus.fr/air}AbstractRemark" maxOccurs="100"/&gt;
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
        "remark"
    })
    public static class Remarks {

        @XmlElement(required = true)
        protected List<AbstractRemark> remark;

        /**
         * Default no-arg constructor
         * 
         */
        public Remarks() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Remarks(final List<AbstractRemark> remark) {
            this.remark = remark;
        }

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbstractRemark }
         * 
         * 
         */
        public List<AbstractRemark> getRemark() {
            if (remark == null) {
                remark = new ArrayList<AbstractRemark>();
            }
            return this.remark;
        }

    }

}
