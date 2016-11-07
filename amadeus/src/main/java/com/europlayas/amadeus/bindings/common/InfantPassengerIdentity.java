
package com.europlayas.amadeus.bindings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The date of birth is required for the infant identity
 * 
 * <p>Clase Java para InfantPassengerIdentity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfantPassengerIdentity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/common}PassengerIdentity"&gt;
 *       &lt;attribute name="dateOfBirth" use="required" type="{http://ws.amadeus.fr/common}LocalDate" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfantPassengerIdentity")
public class InfantPassengerIdentity
    extends PassengerIdentity
{


    /**
     * Default no-arg constructor
     * 
     */
    public InfantPassengerIdentity() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InfantPassengerIdentity(final String firstName, final String middleName, final String surname, final XMLGregorianCalendar dateOfBirth, final Gender gender) {
        super(firstName, middleName, surname, dateOfBirth, gender);
    }

}
