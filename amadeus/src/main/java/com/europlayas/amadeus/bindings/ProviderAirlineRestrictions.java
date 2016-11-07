
package com.europlayas.amadeus.bindings;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Restriction towards airlines for a provider.
 * 
 * <p>Clase Java para ProviderAirlineRestrictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProviderAirlineRestrictions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ws.amadeus.fr/air}AirlineRestrictions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlineCodeRestrictions" maxOccurs="3" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://ws.amadeus.fr/air}AirlineCodeRestrictions"&gt;
 *                 &lt;group ref="{http://ws.amadeus.fr/air}AirlineRestrictionsGroup" minOccurs="0"/&gt;
 *                 &lt;attribute name="provider" use="required" type="{http://ws.amadeus.fr/air}Provider" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="blacklistedInEuropeanUnionAllowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderAirlineRestrictions")
public class ProviderAirlineRestrictions
    extends AirlineRestrictions
{


    /**
     * Default no-arg constructor
     * 
     */
    public ProviderAirlineRestrictions() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProviderAirlineRestrictions(final List<AirlineCodeRestrictions> airlineCodeRestrictions, final Boolean blacklistedInEuropeanUnionAllowed) {
        super(airlineCodeRestrictions, blacklistedInEuropeanUnionAllowed);
    }

}
