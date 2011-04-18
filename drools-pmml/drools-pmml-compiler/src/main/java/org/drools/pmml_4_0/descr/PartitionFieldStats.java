//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.10 at 02:27:43 AM CET 
//


package org.drools.pmml_4_0.descr;

import java.io.Serializable;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Counts" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}NumericInfo" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_0}FrequenciesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="weighted" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "counts",
    "numericInfo",
    "arraies"
})
@XmlRootElement(name = "PartitionFieldStats")
public class PartitionFieldStats
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "Counts")
    protected Counts counts;
    @XmlElement(name = "NumericInfo")
    protected NumericInfo numericInfo;
    @XmlElement(name = "Array")
    protected List<Array> arraies;
    @XmlAttribute(required = true)
    protected String field;
    @XmlAttribute
    protected String weighted;

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
     * Gets the value of the counts property.
     * 
     * @return
     *     possible object is
     *     {@link Counts }
     *     
     */
    public Counts getCounts() {
        return counts;
    }

    /**
     * Sets the value of the counts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counts }
     *     
     */
    public void setCounts(Counts value) {
        this.counts = value;
    }

    /**
     * Gets the value of the numericInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumericInfo }
     *     
     */
    public NumericInfo getNumericInfo() {
        return numericInfo;
    }

    /**
     * Sets the value of the numericInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericInfo }
     *     
     */
    public void setNumericInfo(NumericInfo value) {
        this.numericInfo = value;
    }

    /**
     * Gets the value of the arraies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arraies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArraies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Array }
     * 
     * 
     */
    public List<Array> getArraies() {
        if (arraies == null) {
            arraies = new ArrayList<Array>();
        }
        return this.arraies;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the weighted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeighted() {
        if (weighted == null) {
            return "0";
        } else {
            return weighted;
        }
    }

    /**
     * Sets the value of the weighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeighted(String value) {
        this.weighted = value;
    }

}
