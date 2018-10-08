
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ForsikringStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForsikringStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStatus"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStatusAendringAarsag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStatusDato"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringBevisNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringBevisDato"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringUdstedtDigitalt"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringUdstedtPapir"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringTilgangRegistreretDato" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringAfgangRegistreretDato" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringErFejlhaandteret"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForsikringStrukturType", propOrder = {
    "forsikringStatus",
    "forsikringStatusAendringAarsag",
    "forsikringStatusDato",
    "forsikringBevisNummer",
    "forsikringBevisDato",
    "forsikringUdstedtDigitalt",
    "forsikringUdstedtPapir",
    "forsikringTilgangRegistreretDato",
    "forsikringAfgangRegistreretDato",
    "forsikringErFejlhaandteret"
})
public class ForsikringStrukturType {

    @XmlElement(name = "ForsikringStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ForsikringStatusType forsikringStatus;
    @XmlElement(name = "ForsikringStatusAendringAarsag")
    @XmlSchemaType(name = "string")
    protected ForsikringStatusAarsagType forsikringStatusAendringAarsag;
    @XmlElement(name = "ForsikringStatusDato", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forsikringStatusDato;
    @XmlElement(name = "ForsikringBevisNummer", required = true)
    protected String forsikringBevisNummer;
    @XmlElement(name = "ForsikringBevisDato", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar forsikringBevisDato;
    @XmlElement(name = "ForsikringUdstedtDigitalt")
    protected boolean forsikringUdstedtDigitalt;
    @XmlElement(name = "ForsikringUdstedtPapir")
    protected boolean forsikringUdstedtPapir;
    @XmlElement(name = "ForsikringTilgangRegistreretDato")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forsikringTilgangRegistreretDato;
    @XmlElement(name = "ForsikringAfgangRegistreretDato")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forsikringAfgangRegistreretDato;
    @XmlElement(name = "ForsikringErFejlhaandteret")
    protected boolean forsikringErFejlhaandteret;

    /**
     * Gets the value of the forsikringStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ForsikringStatusType }
     *     
     */
    public ForsikringStatusType getForsikringStatus() {
        return forsikringStatus;
    }

    /**
     * Sets the value of the forsikringStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForsikringStatusType }
     *     
     */
    public void setForsikringStatus(ForsikringStatusType value) {
        this.forsikringStatus = value;
    }

    /**
     * Gets the value of the forsikringStatusAendringAarsag property.
     * 
     * @return
     *     possible object is
     *     {@link ForsikringStatusAarsagType }
     *     
     */
    public ForsikringStatusAarsagType getForsikringStatusAendringAarsag() {
        return forsikringStatusAendringAarsag;
    }

    /**
     * Sets the value of the forsikringStatusAendringAarsag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForsikringStatusAarsagType }
     *     
     */
    public void setForsikringStatusAendringAarsag(ForsikringStatusAarsagType value) {
        this.forsikringStatusAendringAarsag = value;
    }

    /**
     * Gets the value of the forsikringStatusDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForsikringStatusDato() {
        return forsikringStatusDato;
    }

    /**
     * Sets the value of the forsikringStatusDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForsikringStatusDato(XMLGregorianCalendar value) {
        this.forsikringStatusDato = value;
    }

    /**
     * Gets the value of the forsikringBevisNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForsikringBevisNummer() {
        return forsikringBevisNummer;
    }

    /**
     * Sets the value of the forsikringBevisNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForsikringBevisNummer(String value) {
        this.forsikringBevisNummer = value;
    }

    /**
     * Gets the value of the forsikringBevisDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForsikringBevisDato() {
        return forsikringBevisDato;
    }

    /**
     * Sets the value of the forsikringBevisDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForsikringBevisDato(XMLGregorianCalendar value) {
        this.forsikringBevisDato = value;
    }

    /**
     * Gets the value of the forsikringUdstedtDigitalt property.
     * 
     */
    public boolean isForsikringUdstedtDigitalt() {
        return forsikringUdstedtDigitalt;
    }

    /**
     * Sets the value of the forsikringUdstedtDigitalt property.
     * 
     */
    public void setForsikringUdstedtDigitalt(boolean value) {
        this.forsikringUdstedtDigitalt = value;
    }

    /**
     * Gets the value of the forsikringUdstedtPapir property.
     * 
     */
    public boolean isForsikringUdstedtPapir() {
        return forsikringUdstedtPapir;
    }

    /**
     * Sets the value of the forsikringUdstedtPapir property.
     * 
     */
    public void setForsikringUdstedtPapir(boolean value) {
        this.forsikringUdstedtPapir = value;
    }

    /**
     * Gets the value of the forsikringTilgangRegistreretDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForsikringTilgangRegistreretDato() {
        return forsikringTilgangRegistreretDato;
    }

    /**
     * Sets the value of the forsikringTilgangRegistreretDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForsikringTilgangRegistreretDato(XMLGregorianCalendar value) {
        this.forsikringTilgangRegistreretDato = value;
    }

    /**
     * Gets the value of the forsikringAfgangRegistreretDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForsikringAfgangRegistreretDato() {
        return forsikringAfgangRegistreretDato;
    }

    /**
     * Sets the value of the forsikringAfgangRegistreretDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForsikringAfgangRegistreretDato(XMLGregorianCalendar value) {
        this.forsikringAfgangRegistreretDato = value;
    }

    /**
     * Gets the value of the forsikringErFejlhaandteret property.
     * 
     */
    public boolean isForsikringErFejlhaandteret() {
        return forsikringErFejlhaandteret;
    }

    /**
     * Sets the value of the forsikringErFejlhaandteret property.
     * 
     */
    public void setForsikringErFejlhaandteret(boolean value) {
        this.forsikringErFejlhaandteret = value;
    }

}
