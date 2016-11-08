
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Booking record in an external provider GDS or system, i.e. other than Amadeus GDS.
 * 
 * <p>Clase Java para ExternalProviderRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExternalProviderRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/common}Record"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalProviderRecord")
@XmlSeeAlso({
    com.europlayas.amadeus.bindings.AirExternalRecord.class,
    com.europlayas.amadeus.bindings.common.AirExternalRecord.class
})
public abstract class ExternalProviderRecord
    extends Record
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public ExternalProviderRecord() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ExternalProviderRecord(final String locator, final LocalDateTime creationDateTime) {
        super(locator, creationDateTime);
    }

}
