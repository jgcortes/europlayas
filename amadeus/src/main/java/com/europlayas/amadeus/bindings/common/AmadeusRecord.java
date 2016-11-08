
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Booking record in Amadeus GDS, a Passenger Name Record (PNR).
 * 
 * <p>Clase Java para AmadeusRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmadeusRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/common}Record"&gt;
 *       &lt;attribute name="locator" use="required" type="{http://ws.amadeus.fr/common}AmadeusRecordLocator" /&gt;
 *       &lt;attribute name="creationDateTime" use="required" type="{http://ws.amadeus.fr/common}UtcDateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmadeusRecord")
public class AmadeusRecord
    extends Record
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public AmadeusRecord() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AmadeusRecord(final String locator, final LocalDateTime creationDateTime) {
        super(locator, creationDateTime);
    }

}
