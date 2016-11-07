
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.europlayas.amadeus.bindings.common.AmadeusRecord;


/**
 * This fault points out a ticket issuance failure to the requestor.
 * 
 * <p>Clase Java para TicketIssuanceFailureFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TicketIssuanceFailureFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.amadeus.fr/air}BookFault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="record" type="{http://ws.amadeus.fr/common}AmadeusRecord"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketIssuanceFailureFault", propOrder = {
    "record"
})
public class TicketIssuanceFailureFault
    extends BookFault
{

    @XmlElement(required = true)
    protected AmadeusRecord record;

    /**
     * Default no-arg constructor
     * 
     */
    public TicketIssuanceFailureFault() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TicketIssuanceFailureFault(final ItineraryIdList itineraries, final AmadeusRecord record) {
        super(itineraries);
        this.record = record;
    }

    /**
     * Obtiene el valor de la propiedad record.
     * 
     * @return
     *     possible object is
     *     {@link AmadeusRecord }
     *     
     */
    public AmadeusRecord getRecord() {
        return record;
    }

    /**
     * Define el valor de la propiedad record.
     * 
     * @param value
     *     allowed object is
     *     {@link AmadeusRecord }
     *     
     */
    public void setRecord(AmadeusRecord value) {
        this.record = value;
    }

}
