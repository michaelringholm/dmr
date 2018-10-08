
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KarrosseriTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KarrosseriTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KarrosseriTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KarrosseriTypeNavn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KarrosseriTypeStrukturType", propOrder = {
    "karrosseriTypeNummer",
    "karrosseriTypeNavn"
})
public class KarrosseriTypeStrukturType {

    @XmlElement(name = "KarrosseriTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long karrosseriTypeNummer;
    @XmlElement(name = "KarrosseriTypeNavn", required = true)
    protected String karrosseriTypeNavn;

    /**
     * Gets the value of the karrosseriTypeNummer property.
     * 
     */
    public long getKarrosseriTypeNummer() {
        return karrosseriTypeNummer;
    }

    /**
     * Sets the value of the karrosseriTypeNummer property.
     * 
     */
    public void setKarrosseriTypeNummer(long value) {
        this.karrosseriTypeNummer = value;
    }

    /**
     * Gets the value of the karrosseriTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKarrosseriTypeNavn() {
        return karrosseriTypeNavn;
    }

    /**
     * Sets the value of the karrosseriTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKarrosseriTypeNavn(String value) {
        this.karrosseriTypeNavn = value;
    }

}
