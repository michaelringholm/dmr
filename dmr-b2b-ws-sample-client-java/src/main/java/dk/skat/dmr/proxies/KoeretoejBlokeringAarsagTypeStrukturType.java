
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejBlokeringAarsagTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejBlokeringAarsagTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeNavn"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejBlokeringAarsagTypeNummer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejBlokeringAarsagTypeStrukturType", propOrder = {
    "koeretoejBlokeringAarsagTypeNavn",
    "koeretoejBlokeringAarsagTypeNummer"
})
public class KoeretoejBlokeringAarsagTypeStrukturType {

    @XmlElement(name = "KoeretoejBlokeringAarsagTypeNavn", required = true)
    protected String koeretoejBlokeringAarsagTypeNavn;
    @XmlElement(name = "KoeretoejBlokeringAarsagTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long koeretoejBlokeringAarsagTypeNummer;

    /**
     * Gets the value of the koeretoejBlokeringAarsagTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejBlokeringAarsagTypeNavn() {
        return koeretoejBlokeringAarsagTypeNavn;
    }

    /**
     * Sets the value of the koeretoejBlokeringAarsagTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejBlokeringAarsagTypeNavn(String value) {
        this.koeretoejBlokeringAarsagTypeNavn = value;
    }

    /**
     * Gets the value of the koeretoejBlokeringAarsagTypeNummer property.
     * 
     */
    public long getKoeretoejBlokeringAarsagTypeNummer() {
        return koeretoejBlokeringAarsagTypeNummer;
    }

    /**
     * Sets the value of the koeretoejBlokeringAarsagTypeNummer property.
     * 
     */
    public void setKoeretoejBlokeringAarsagTypeNummer(long value) {
        this.koeretoejBlokeringAarsagTypeNummer = value;
    }

}
