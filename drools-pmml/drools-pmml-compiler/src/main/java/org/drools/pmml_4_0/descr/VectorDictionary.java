//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.10 at 02:27:43 AM CET 
//


package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}VectorFields"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}VectorInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfVectors" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensions",
    "vectorFields",
    "vectorInstances"
})
@XmlRootElement(name = "VectorDictionary")
public class VectorDictionary implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "VectorFields", required = true)
    protected VectorFields vectorFields;
    @XmlElement(name = "VectorInstance")
    protected List<VectorInstance> vectorInstances;
    @XmlAttribute
    protected BigInteger numberOfVectors;

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<Extension>();
        }
        return this.extensions;
    }

    /**
     * Gets the value of the vectorFields property.
     * 
     * @return
     *     possible object is
     *     {@link VectorFields }
     *     
     */
    public VectorFields getVectorFields() {
        return vectorFields;
    }

    /**
     * Sets the value of the vectorFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorFields }
     *     
     */
    public void setVectorFields(VectorFields value) {
        this.vectorFields = value;
    }

    /**
     * Gets the value of the vectorInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vectorInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVectorInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorInstance }
     * 
     * 
     */
    public List<VectorInstance> getVectorInstances() {
        if (vectorInstances == null) {
            vectorInstances = new ArrayList<VectorInstance>();
        }
        return this.vectorInstances;
    }

    /**
     * Gets the value of the numberOfVectors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVectors() {
        return numberOfVectors;
    }

    /**
     * Sets the value of the numberOfVectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVectors(BigInteger value) {
        this.numberOfVectors = value;
    }

}