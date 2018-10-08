
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejSupplerendeKarrosseriTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejSupplerendeKarrosseriTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}SupplerendeKarrosseriTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}SupplerendeKarrosseriTypeNavn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejSupplerendeKarrosseriTypeStrukturType", propOrder = {
    "supplerendeKarrosseriTypeNummer",
    "supplerendeKarrosseriTypeNavn"
})
public class KoeretoejSupplerendeKarrosseriTypeStrukturType {

    @XmlElement(name = "SupplerendeKarrosseriTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long supplerendeKarrosseriTypeNummer;
    @XmlElement(name = "SupplerendeKarrosseriTypeNavn", required = true)
    protected String supplerendeKarrosseriTypeNavn;

    /**
     * Gets the value of the supplerendeKarrosseriTypeNummer property.
     * 
     */
    public long getSupplerendeKarrosseriTypeNummer() {
        return supplerendeKarrosseriTypeNummer;
    }

    /**
     * Sets the value of the supplerendeKarrosseriTypeNummer property.
     * 
     */
    public void setSupplerendeKarrosseriTypeNummer(long value) {
        this.supplerendeKarrosseriTypeNummer = value;
    }

    /**
     * Gets the value of the supplerendeKarrosseriTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplerendeKarrosseriTypeNavn() {
        return supplerendeKarrosseriTypeNavn;
    }

    /**
     * Sets the value of the supplerendeKarrosseriTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplerendeKarrosseriTypeNavn(String value) {
        this.supplerendeKarrosseriTypeNavn = value;
    }

}
