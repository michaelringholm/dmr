
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KoeretoejRegistreringStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejRegistreringStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatus"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatusDato"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatusAarsag"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringKontrolTal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGyldigFra"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGyldigTil" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringGrundlagIdent"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringSenesteHaendelse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejRegistreringStrukturType", propOrder = {
    "koeretoejRegistreringStatus",
    "koeretoejRegistreringStatusDato",
    "koeretoejRegistreringStatusAarsag",
    "koeretoejRegistreringKontrolTal",
    "koeretoejRegistreringGyldigFra",
    "koeretoejRegistreringGyldigTil",
    "koeretoejRegistreringGrundlagIdent",
    "koeretoejRegistreringSenesteHaendelse"
})
public class KoeretoejRegistreringStrukturType {

    @XmlElement(name = "KoeretoejRegistreringStatus", required = true)
    @XmlSchemaType(name = "string")
    protected KoeretoejRegistreringStatusType koeretoejRegistreringStatus;
    @XmlElement(name = "KoeretoejRegistreringStatusDato", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejRegistreringStatusDato;
    @XmlElement(name = "KoeretoejRegistreringStatusAarsag", required = true)
    @XmlSchemaType(name = "string")
    protected KoeretoejRegistreringStatusAarsagType koeretoejRegistreringStatusAarsag;
    @XmlElement(name = "KoeretoejRegistreringKontrolTal")
    protected String koeretoejRegistreringKontrolTal;
    @XmlElement(name = "KoeretoejRegistreringGyldigFra", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejRegistreringGyldigFra;
    @XmlElement(name = "KoeretoejRegistreringGyldigTil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koeretoejRegistreringGyldigTil;
    @XmlElement(name = "KoeretoejRegistreringGrundlagIdent")
    @XmlSchemaType(name = "integer")
    protected long koeretoejRegistreringGrundlagIdent;
    @XmlElement(name = "KoeretoejRegistreringSenesteHaendelse", required = true)
    @XmlSchemaType(name = "string")
    protected KoeretoejRegistreringHaendelserType koeretoejRegistreringSenesteHaendelse;

    /**
     * Gets the value of the koeretoejRegistreringStatus property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejRegistreringStatusType }
     *     
     */
    public KoeretoejRegistreringStatusType getKoeretoejRegistreringStatus() {
        return koeretoejRegistreringStatus;
    }

    /**
     * Sets the value of the koeretoejRegistreringStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejRegistreringStatusType }
     *     
     */
    public void setKoeretoejRegistreringStatus(KoeretoejRegistreringStatusType value) {
        this.koeretoejRegistreringStatus = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringStatusDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejRegistreringStatusDato() {
        return koeretoejRegistreringStatusDato;
    }

    /**
     * Sets the value of the koeretoejRegistreringStatusDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejRegistreringStatusDato(XMLGregorianCalendar value) {
        this.koeretoejRegistreringStatusDato = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringStatusAarsag property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejRegistreringStatusAarsagType }
     *     
     */
    public KoeretoejRegistreringStatusAarsagType getKoeretoejRegistreringStatusAarsag() {
        return koeretoejRegistreringStatusAarsag;
    }

    /**
     * Sets the value of the koeretoejRegistreringStatusAarsag property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejRegistreringStatusAarsagType }
     *     
     */
    public void setKoeretoejRegistreringStatusAarsag(KoeretoejRegistreringStatusAarsagType value) {
        this.koeretoejRegistreringStatusAarsag = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringKontrolTal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeretoejRegistreringKontrolTal() {
        return koeretoejRegistreringKontrolTal;
    }

    /**
     * Sets the value of the koeretoejRegistreringKontrolTal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeretoejRegistreringKontrolTal(String value) {
        this.koeretoejRegistreringKontrolTal = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGyldigFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejRegistreringGyldigFra() {
        return koeretoejRegistreringGyldigFra;
    }

    /**
     * Sets the value of the koeretoejRegistreringGyldigFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejRegistreringGyldigFra(XMLGregorianCalendar value) {
        this.koeretoejRegistreringGyldigFra = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGyldigTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoeretoejRegistreringGyldigTil() {
        return koeretoejRegistreringGyldigTil;
    }

    /**
     * Sets the value of the koeretoejRegistreringGyldigTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoeretoejRegistreringGyldigTil(XMLGregorianCalendar value) {
        this.koeretoejRegistreringGyldigTil = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringGrundlagIdent property.
     * 
     */
    public long getKoeretoejRegistreringGrundlagIdent() {
        return koeretoejRegistreringGrundlagIdent;
    }

    /**
     * Sets the value of the koeretoejRegistreringGrundlagIdent property.
     * 
     */
    public void setKoeretoejRegistreringGrundlagIdent(long value) {
        this.koeretoejRegistreringGrundlagIdent = value;
    }

    /**
     * Gets the value of the koeretoejRegistreringSenesteHaendelse property.
     * 
     * @return
     *     possible object is
     *     {@link KoeretoejRegistreringHaendelserType }
     *     
     */
    public KoeretoejRegistreringHaendelserType getKoeretoejRegistreringSenesteHaendelse() {
        return koeretoejRegistreringSenesteHaendelse;
    }

    /**
     * Sets the value of the koeretoejRegistreringSenesteHaendelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoeretoejRegistreringHaendelserType }
     *     
     */
    public void setKoeretoejRegistreringSenesteHaendelse(KoeretoejRegistreringHaendelserType value) {
        this.koeretoejRegistreringSenesteHaendelse = value;
    }

}
