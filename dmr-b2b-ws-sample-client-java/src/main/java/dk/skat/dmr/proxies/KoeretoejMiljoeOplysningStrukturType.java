
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejMiljoeOplysningStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejMiljoeOplysningStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningCO2Udslip" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningEmissionCO" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningEmissionHCPlusNOX" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningEmissionNOX" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningPartikler" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningRoegtaethed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningPartikelFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningRoegtaethedOmdrejningstal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMiljoeOplysningEftermonteretPartikelfilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejMiljoeOplysningStrukturType", propOrder = {
    "koeretoejMiljoeOplysningCO2Udslip",
    "koeretoejMiljoeOplysningEmissionCO",
    "koeretoejMiljoeOplysningEmissionHCPlusNOX",
    "koeretoejMiljoeOplysningEmissionNOX",
    "koeretoejMiljoeOplysningPartikler",
    "koeretoejMiljoeOplysningRoegtaethed",
    "koeretoejMiljoeOplysningPartikelFilter",
    "koeretoejMiljoeOplysningRoegtaethedOmdrejningstal",
    "koeretoejMiljoeOplysningEftermonteretPartikelfilter"
})
public class KoeretoejMiljoeOplysningStrukturType {

    @XmlElement(name = "KoeretoejMiljoeOplysningCO2Udslip")
    protected Float koeretoejMiljoeOplysningCO2Udslip;
    @XmlElement(name = "KoeretoejMiljoeOplysningEmissionCO")
    protected Float koeretoejMiljoeOplysningEmissionCO;
    @XmlElement(name = "KoeretoejMiljoeOplysningEmissionHCPlusNOX")
    protected Float koeretoejMiljoeOplysningEmissionHCPlusNOX;
    @XmlElement(name = "KoeretoejMiljoeOplysningEmissionNOX")
    protected Float koeretoejMiljoeOplysningEmissionNOX;
    @XmlElement(name = "KoeretoejMiljoeOplysningPartikler")
    protected Float koeretoejMiljoeOplysningPartikler;
    @XmlElement(name = "KoeretoejMiljoeOplysningRoegtaethed")
    protected Float koeretoejMiljoeOplysningRoegtaethed;
    @XmlElement(name = "KoeretoejMiljoeOplysningPartikelFilter")
    protected Boolean koeretoejMiljoeOplysningPartikelFilter;
    @XmlElement(name = "KoeretoejMiljoeOplysningRoegtaethedOmdrejningstal")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejMiljoeOplysningRoegtaethedOmdrejningstal;
    @XmlElement(name = "KoeretoejMiljoeOplysningEftermonteretPartikelfilter")
    protected Boolean koeretoejMiljoeOplysningEftermonteretPartikelfilter;

    /**
     * Gets the value of the koeretoejMiljoeOplysningCO2Udslip property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMiljoeOplysningCO2Udslip() {
        return koeretoejMiljoeOplysningCO2Udslip;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningCO2Udslip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMiljoeOplysningCO2Udslip(Float value) {
        this.koeretoejMiljoeOplysningCO2Udslip = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningEmissionCO property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMiljoeOplysningEmissionCO() {
        return koeretoejMiljoeOplysningEmissionCO;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningEmissionCO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMiljoeOplysningEmissionCO(Float value) {
        this.koeretoejMiljoeOplysningEmissionCO = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningEmissionHCPlusNOX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMiljoeOplysningEmissionHCPlusNOX() {
        return koeretoejMiljoeOplysningEmissionHCPlusNOX;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningEmissionHCPlusNOX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMiljoeOplysningEmissionHCPlusNOX(Float value) {
        this.koeretoejMiljoeOplysningEmissionHCPlusNOX = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningEmissionNOX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMiljoeOplysningEmissionNOX() {
        return koeretoejMiljoeOplysningEmissionNOX;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningEmissionNOX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMiljoeOplysningEmissionNOX(Float value) {
        this.koeretoejMiljoeOplysningEmissionNOX = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningPartikler property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMiljoeOplysningPartikler() {
        return koeretoejMiljoeOplysningPartikler;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningPartikler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMiljoeOplysningPartikler(Float value) {
        this.koeretoejMiljoeOplysningPartikler = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningRoegtaethed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKoeretoejMiljoeOplysningRoegtaethed() {
        return koeretoejMiljoeOplysningRoegtaethed;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningRoegtaethed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKoeretoejMiljoeOplysningRoegtaethed(Float value) {
        this.koeretoejMiljoeOplysningRoegtaethed = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningPartikelFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMiljoeOplysningPartikelFilter() {
        return koeretoejMiljoeOplysningPartikelFilter;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningPartikelFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMiljoeOplysningPartikelFilter(Boolean value) {
        this.koeretoejMiljoeOplysningPartikelFilter = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningRoegtaethedOmdrejningstal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejMiljoeOplysningRoegtaethedOmdrejningstal() {
        return koeretoejMiljoeOplysningRoegtaethedOmdrejningstal;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningRoegtaethedOmdrejningstal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejMiljoeOplysningRoegtaethedOmdrejningstal(Long value) {
        this.koeretoejMiljoeOplysningRoegtaethedOmdrejningstal = value;
    }

    /**
     * Gets the value of the koeretoejMiljoeOplysningEftermonteretPartikelfilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKoeretoejMiljoeOplysningEftermonteretPartikelfilter() {
        return koeretoejMiljoeOplysningEftermonteretPartikelfilter;
    }

    /**
     * Sets the value of the koeretoejMiljoeOplysningEftermonteretPartikelfilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKoeretoejMiljoeOplysningEftermonteretPartikelfilter(Boolean value) {
        this.koeretoejMiljoeOplysningEftermonteretPartikelfilter = value;
    }

}
