
package com.europlayas.amadeus.bindings;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.CountryCode;
import com.europlayas.amadeus.bindings.common.DetailedLocation;


/**
 * Detailed location defined in IATA.
 * 
 * <p>Clase Java para IataDetailedLocation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IataDetailedLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/common}DetailedLocation"&gt;
 *       &lt;attribute name="code" use="required" type="{http://ws.amadeus.fr/air}IataLocationCode" /&gt;
 *       &lt;attribute name="cityCode" type="{http://ws.amadeus.fr/air}IataLocationCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IataDetailedLocation")
@XmlSeeAlso({
    Airport.class
})
public class IataDetailedLocation
    extends DetailedLocation
    implements Serializable
{


    /**
     * Default no-arg constructor
     * 
     */
    public IataDetailedLocation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IataDetailedLocation(final String code, final String cityCode, final CountryCode countryCode) {
        super(code, cityCode, countryCode);
    }

}
