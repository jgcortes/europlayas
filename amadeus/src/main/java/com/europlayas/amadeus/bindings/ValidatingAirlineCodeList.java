
package com.europlayas.amadeus.bindings;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * List of validating airline codes.
 * 
 * <p>Clase Java para ValidatingAirlineCodeList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidatingAirlineCodeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/air}AirlineCodeList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlineCode" type="{http://ws.amadeus.fr/air}AirlineCode" maxOccurs="9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidatingAirlineCodeList")
public class ValidatingAirlineCodeList
    extends AirlineCodeList
{


    /**
     * Default no-arg constructor
     * 
     */
    public ValidatingAirlineCodeList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ValidatingAirlineCodeList(final List<String> airlineCode) {
        super(airlineCode);
    }

}
