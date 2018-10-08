
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejAnvendelseStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejAnvendelseStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseNavn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejAnvendelseStrukturType", propOrder = {
    "koeretoejAnvendelseNummer",
    "koeretoejAnvendelseNavn"
})
public class KoeretoejAnvendelseStrukturType {

    @XmlElement(name = "KoeretoejAnvendelseNummer")
    @XmlSchemaType(name = "integer")
    protected long koeretoejAnvendelseNummer;
    @XmlElement(name = "KoeretoejAnvendelseNavn", required = true)
    protected String koeretoejAnvendelseNavn;

    /**
     * Gets the value of the koeretoejAnvendelseNummer property.
     * 
     */
    public long getKoeretoejAnvendelseNummer() {
        return koeretoejAnvendelseNummer;
    }

    /**
     * Sets the value of the koeretoejAnvendelseNummer property.
     * 
     */
    public void setKoeretoejAnvendelseNummer(long value) {
        this.koeretoejAnvendelseNummer = value;
    }

    /**
     * Gets the value of the koeretoejAnvendelseNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejAnvendelseNavn() {
        return koeretoejAnvendelseNavn;
    }

    /**
     * Sets the value of the koeretoejAnvendelseNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejAnvendelseNavn(String value) {
        this.koeretoejAnvendelseNavn = value;
    }

}
