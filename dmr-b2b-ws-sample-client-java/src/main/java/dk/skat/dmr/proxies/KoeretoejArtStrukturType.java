
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejArtStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejArtStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNavn"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtKraeverForsikring"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejArtStrukturType", propOrder = {
    "koeretoejArtNummer",
    "koeretoejArtNavn",
    "koeretoejArtKraeverForsikring"
})
public class KoeretoejArtStrukturType {

    @XmlElement(name = "KoeretoejArtNummer")
    @XmlSchemaType(name = "integer")
    protected long koeretoejArtNummer;
    @XmlElement(name = "KoeretoejArtNavn", required = true)
    protected String koeretoejArtNavn;
    @XmlElement(name = "KoeretoejArtKraeverForsikring")
    protected boolean koeretoejArtKraeverForsikring;

    /**
     * Gets the value of the koeretoejArtNummer property.
     * 
     */
    public long getKoeretoejArtNummer() {
        return koeretoejArtNummer;
    }

    /**
     * Sets the value of the koeretoejArtNummer property.
     * 
     */
    public void setKoeretoejArtNummer(long value) {
        this.koeretoejArtNummer = value;
    }

    /**
     * Gets the value of the koeretoejArtNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejArtNavn() {
        return koeretoejArtNavn;
    }

    /**
     * Sets the value of the koeretoejArtNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejArtNavn(String value) {
        this.koeretoejArtNavn = value;
    }

    /**
     * Gets the value of the koeretoejArtKraeverForsikring property.
     * 
     */
    public boolean isKoeretoejArtKraeverForsikring() {
        return koeretoejArtKraeverForsikring;
    }

    /**
     * Sets the value of the koeretoejArtKraeverForsikring property.
     * 
     */
    public void setKoeretoejArtKraeverForsikring(boolean value) {
        this.koeretoejArtKraeverForsikring = value;
    }

}
