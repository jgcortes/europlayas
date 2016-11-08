
package com.europlayas.amadeus.bindings.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResidencePostalAddress complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResidencePostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/common}PostalAddress"&gt;
 *       &lt;attribute name="postalCode" use="required" type="{http://ws.amadeus.fr/common}String1To17" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidencePostalAddress")
public class ResidencePostalAddress
    extends PostalAddress
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public ResidencePostalAddress() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ResidencePostalAddress(final String name, final String company, final String addressLine1, final String addressLine2, final String city, final CountryCode countryCode, final String stateOrProvince, final String postalCode, final String postalBox) {
        super(name, company, addressLine1, addressLine2, city, countryCode, stateOrProvince, postalCode, postalBox);
    }

}
