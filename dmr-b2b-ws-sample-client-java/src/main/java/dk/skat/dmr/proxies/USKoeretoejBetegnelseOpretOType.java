
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USKoeretoejBetegnelseOpret_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejBetegnelseOpret_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNummer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejTypeTypeNavn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USKoeretoejBetegnelseOpret_OType", propOrder = {
    "hovedOplysningerSvar",
    "koeretoejMaerkeTypeNummer",
    "koeretoejMaerkeTypeNavn",
    "koeretoejModelTypeNummer",
    "koeretoejModelTypeNavn",
    "koeretoejVariantTypeNummer",
    "koeretoejVariantTypeNavn",
    "koeretoejTypeTypeNummer",
    "koeretoejTypeTypeNavn"
})
@XmlSeeAlso({
    USKoeretoejBetegnelseOpretO.class
})
public class USKoeretoejBetegnelseOpretOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "KoeretoejMaerkeTypeNummer")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejMaerkeTypeNummer;
    @XmlElement(name = "KoeretoejMaerkeTypeNavn")
    protected String koeretoejMaerkeTypeNavn;
    @XmlElement(name = "KoeretoejModelTypeNummer")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejModelTypeNummer;
    @XmlElement(name = "KoeretoejModelTypeNavn")
    protected String koeretoejModelTypeNavn;
    @XmlElement(name = "KoeretoejVariantTypeNummer")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejVariantTypeNummer;
    @XmlElement(name = "KoeretoejVariantTypeNavn")
    protected String koeretoejVariantTypeNavn;
    @XmlElement(name = "KoeretoejTypeTypeNummer")
    @XmlSchemaType(name = "integer")
    protected Long koeretoejTypeTypeNummer;
    @XmlElement(name = "KoeretoejTypeTypeNavn")
    protected String koeretoejTypeTypeNavn;

    /**
     * Gets the value of the hovedOplysningerSvar property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public HovedOplysningerSvarType getHovedOplysningerSvar() {
        return hovedOplysningerSvar;
    }

    /**
     * Sets the value of the hovedOplysningerSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public void setHovedOplysningerSvar(HovedOplysningerSvarType value) {
        this.hovedOplysningerSvar = value;
    }

    /**
     * Gets the value of the koeretoejMaerkeTypeNummer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejMaerkeTypeNummer() {
        return koeretoejMaerkeTypeNummer;
    }

    /**
     * Sets the value of the koeretoejMaerkeTypeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejMaerkeTypeNummer(Long value) {
        this.koeretoejMaerkeTypeNummer = value;
    }

    /**
     * Gets the value of the koeretoejMaerkeTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejMaerkeTypeNavn() {
        return koeretoejMaerkeTypeNavn;
    }

    /**
     * Sets the value of the koeretoejMaerkeTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejMaerkeTypeNavn(String value) {
        this.koeretoejMaerkeTypeNavn = value;
    }

    /**
     * Gets the value of the koeretoejModelTypeNummer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejModelTypeNummer() {
        return koeretoejModelTypeNummer;
    }

    /**
     * Sets the value of the koeretoejModelTypeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejModelTypeNummer(Long value) {
        this.koeretoejModelTypeNummer = value;
    }

    /**
     * Gets the value of the koeretoejModelTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejModelTypeNavn() {
        return koeretoejModelTypeNavn;
    }

    /**
     * Sets the value of the koeretoejModelTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejModelTypeNavn(String value) {
        this.koeretoejModelTypeNavn = value;
    }

    /**
     * Gets the value of the koeretoejVariantTypeNummer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejVariantTypeNummer() {
        return koeretoejVariantTypeNummer;
    }

    /**
     * Sets the value of the koeretoejVariantTypeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejVariantTypeNummer(Long value) {
        this.koeretoejVariantTypeNummer = value;
    }

    /**
     * Gets the value of the koeretoejVariantTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejVariantTypeNavn() {
        return koeretoejVariantTypeNavn;
    }

    /**
     * Sets the value of the koeretoejVariantTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejVariantTypeNavn(String value) {
        this.koeretoejVariantTypeNavn = value;
    }

    /**
     * Gets the value of the koeretoejTypeTypeNummer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoeretoejTypeTypeNummer() {
        return koeretoejTypeTypeNummer;
    }

    /**
     * Sets the value of the koeretoejTypeTypeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoeretoejTypeTypeNummer(Long value) {
        this.koeretoejTypeTypeNummer = value;
    }

    /**
     * Gets the value of the koeretoejTypeTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejTypeTypeNavn() {
        return koeretoejTypeTypeNavn;
    }

    /**
     * Sets the value of the koeretoejTypeTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejTypeTypeNavn(String value) {
        this.koeretoejTypeTypeNavn = value;
    }

}
