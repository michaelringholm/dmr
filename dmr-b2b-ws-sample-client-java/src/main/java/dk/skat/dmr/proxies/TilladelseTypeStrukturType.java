
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TilladelseTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TilladelseTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}TilladelseTypeNavn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TilladelseTypeStrukturType", propOrder = {
    "tilladelseTypeNummer",
    "tilladelseTypeNavn"
})
public class TilladelseTypeStrukturType {

    @XmlElement(name = "TilladelseTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long tilladelseTypeNummer;
    @XmlElement(name = "TilladelseTypeNavn", required = true)
    protected String tilladelseTypeNavn;

    /**
     * Gets the value of the tilladelseTypeNummer property.
     * 
     */
    public long getTilladelseTypeNummer() {
        return tilladelseTypeNummer;
    }

    /**
     * Sets the value of the tilladelseTypeNummer property.
     * 
     */
    public void setTilladelseTypeNummer(long value) {
        this.tilladelseTypeNummer = value;
    }

    /**
     * Gets the value of the tilladelseTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilladelseTypeNavn() {
        return tilladelseTypeNavn;
    }

    /**
     * Sets the value of the tilladelseTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilladelseTypeNavn(String value) {
        this.tilladelseTypeNavn = value;
    }

}
