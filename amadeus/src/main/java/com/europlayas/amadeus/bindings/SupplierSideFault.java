
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Fault when temporary error occurs on supplier side
 * 
 * <p>Clase Java para SupplierSideFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SupplierSideFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}Fault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierSideFault")
public class SupplierSideFault
    extends Fault
{


    /**
     * Default no-arg constructor
     * 
     */
    public SupplierSideFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplierSideFault(final ItineraryIdList itineraries) {
        super(itineraries);
    }

}
