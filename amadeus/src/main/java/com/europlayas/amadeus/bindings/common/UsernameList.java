
package com.europlayas.amadeus.bindings.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of usernames.
 * 
 * <p>Clase Java para UsernameList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UsernameList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://ws.amadeus.fr/common}Username" maxOccurs="1000"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsernameList", propOrder = {
    "username"
})
public class UsernameList {

    @XmlElement(required = true)
    protected List<String> username;

    /**
     * Default no-arg constructor
     * 
     */
    public UsernameList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UsernameList(final List<String> username) {
        this.username = username;
    }

    /**
     * Gets the value of the username property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the username property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsername().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsername() {
        if (username == null) {
            username = new ArrayList<String>();
        }
        return this.username;
    }

}
