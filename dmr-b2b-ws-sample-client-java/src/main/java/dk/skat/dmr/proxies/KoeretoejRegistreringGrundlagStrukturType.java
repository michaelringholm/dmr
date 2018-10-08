
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KoeretoejRegistreringGrundlagStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejRegistreringGrundlagStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagStatus"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagStatusDato"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagGyldigFra"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagGyldigTil" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagKode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejGenerelIdentifikatorStruktur"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtStruktur"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseStruktur" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejAnvendelseSamlingStruktur" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejRegistreringGrundlagStrukturType", propOrder = {
    "koeretoejRegistreringGrundlagStatus",
    "koeretoejRegistreringGrundlagStatusDato",
    "koeretoejRegistreringGrundlagGyldigFra",
    "koeretoejRegistreringGrundlagGyldigTil",
    "koeretoejRegistreringGrundlagKode",
    "koeretoejGenerelIdentifikatorStruktur",
    "koeretoejArtStruktur",
    "koeretoejAnvendelseStruktur",
    "koeretoejAnvendelseSamlingStruktur"
})
public class KoeretoejRegistreringGrundlagStrukturType {

    @XmlElement(name = "KoeretoejRegistreringGrundlagStatus", required = true)
    @XmlSchemaType(name = "string")
    protected KoeretoejRegistreringGrundlagStatusType koeretoejRegistreringGrundlagStatus;
    @XmlElement(name = "KoeretoejRegistreringGrundlagStatusDato", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejRegistreringGrundlagStatusDato;
    @XmlElement(name = "KoeretoejRegistreringGrundlagGyldigFra", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejRegistreringGrundlagGyldigFra;
    @XmlElement(name = "KoeretoejRegistreringGrundlagGyldigTil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejRegistreringGrundlagGyldigTil;
    @XmlElement(name = "KoeretoejRegistreringGrundlagKode")
    protected String koeretoejRegistreringGrundlagKode;
    @XmlElement(name = "KoeretoejGenerelIdentifikatorStruktur", required = true)
    protected KoeretoejGenerelIdentifikatorStrukturType koeretoejGenerelIdentifikatorStruktur;
    @XmlElement(name = "KoeretoejArtStruktur", required = true)
    protected KoeretoejArtStrukturType koeretoejArtStruktur;
    @XmlElement(name = "KoeretoejAnvendelseStruktur")
    protected KoeretoejAnvendelseStrukturType koeretoejAnvendelseStruktur;
    @XmlElement(name = "KoeretoejAnvendelseSamlingStruktur")
    protected KoeretoejAnvendelseSamlingStrukturType koeretoejAnvendelseSamlingStruktur;

    /**
     * Gets the value of the koeretoejRegistreringGrundlagStatus property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejRegistreringGrundlagStatusType }
     *     
     */
    public KoeretoejRegistreringGrundlagStatusType getKoeretoejRegistreringGrundlagStatus() {
        return koeretoejRegistreringGrundlagStatus;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejRegistreringGrundlagStatusType }
     *     
     */
    public void setKoeretoejRegistreringGrundlagStatus(KoeretoejRegistreringGrundlagStatusType value) {
        this.koeretoejRegistreringGrundlagStatus = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlagStatusDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejRegistreringGrundlagStatusDato() {
        return koeretoejRegistreringGrundlagStatusDato;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagStatusDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejRegistreringGrundlagStatusDato(XMLGregorianCalendar value) {
        this.koeretoejRegistreringGrundlagStatusDato = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlagGyldigFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejRegistreringGrundlagGyldigFra() {
        return koeretoejRegistreringGrundlagGyldigFra;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagGyldigFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejRegistreringGrundlagGyldigFra(XMLGregorianCalendar value) {
        this.koeretoejRegistreringGrundlagGyldigFra = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlagGyldigTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejRegistreringGrundlagGyldigTil() {
        return koeretoejRegistreringGrundlagGyldigTil;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagGyldigTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejRegistreringGrundlagGyldigTil(XMLGregorianCalendar value) {
        this.koeretoejRegistreringGrundlagGyldigTil = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlagKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejRegistreringGrundlagKode() {
        return koeretoejRegistreringGrundlagKode;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejRegistreringGrundlagKode(String value) {
        this.koeretoejRegistreringGrundlagKode = value;
    }

    /**
     * Gets the value of the koeretoejGenerelIdentifikatorStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejGenerelIdentifikatorStrukturType }
     *     
     */
    public KoeretoejGenerelIdentifikatorStrukturType getKoeretoejGenerelIdentifikatorStruktur() {
        return koeretoejGenerelIdentifikatorStruktur;
    }

    /**
     * Sets the value of the koeretoejGenerelIdentifikatorStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejGenerelIdentifikatorStrukturType }
     *     
     */
    public void setKoeretoejGenerelIdentifikatorStruktur(KoeretoejGenerelIdentifikatorStrukturType value) {
        this.koeretoejGenerelIdentifikatorStruktur = value;
    }

    /**
     * Gets the value of the koeretoejArtStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejArtStrukturType }
     *     
     */
    public KoeretoejArtStrukturType getKoeretoejArtStruktur() {
        return koeretoejArtStruktur;
    }

    /**
     * Sets the value of the koeretoejArtStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejArtStrukturType }
     *     
     */
    public void setKoeretoejArtStruktur(KoeretoejArtStrukturType value) {
        this.koeretoejArtStruktur = value;
    }

    /**
     * Gets the value of the koeretoejAnvendelseStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejAnvendelseStrukturType }
     *     
     */
    public KoeretoejAnvendelseStrukturType getKoeretoejAnvendelseStruktur() {
        return koeretoejAnvendelseStruktur;
    }

    /**
     * Sets the value of the koeretoejAnvendelseStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejAnvendelseStrukturType }
     *     
     */
    public void setKoeretoejAnvendelseStruktur(KoeretoejAnvendelseStrukturType value) {
        this.koeretoejAnvendelseStruktur = value;
    }

    /**
     * Gets the value of the koeretoejAnvendelseSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejAnvendelseSamlingStrukturType }
     *     
     */
    public KoeretoejAnvendelseSamlingStrukturType getKoeretoejAnvendelseSamlingStruktur() {
        return koeretoejAnvendelseSamlingStruktur;
    }

    /**
     * Sets the value of the koeretoejAnvendelseSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejAnvendelseSamlingStrukturType }
     *     
     */
    public void setKoeretoejAnvendelseSamlingStruktur(KoeretoejAnvendelseSamlingStrukturType value) {
        this.koeretoejAnvendelseSamlingStruktur = value;
    }

}
