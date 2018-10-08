
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;


/**
 * <p>Java class for USKoeretoejTekniskDataHent_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejTekniskDataHent_IType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysninger"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DatoTidSoegTidspunkt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejGenerelIdentifikatorStruktur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USKoeretoejTekniskDataHent_IType", propOrder = {
    "hovedOplysninger",
    "datoTidSoegTidspunkt",
    "koeretoejGenerelIdentifikatorStruktur"
})
@XmlSeeAlso({
    USKoeretoejTekniskDataHentI.class
})
public class USKoeretoejTekniskDataHentIType {

    @XmlElement(name = "HovedOplysninger", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerType hovedOplysninger;
    @XmlElement(name = "DatoTidSoegTidspunkt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datoTidSoegTidspunkt;
    @XmlElement(name = "KoeretoejGenerelIdentifikatorStruktur", required = true)
    protected KoeretoejGenerelIdentifikatorStrukturType koeretoejGenerelIdentifikatorStruktur;

    /**
     * Gets the value of the hovedOplysninger property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerType }
     *     
     */
    public HovedOplysningerType getHovedOplysninger() {
        return hovedOplysninger;
    }

    /**
     * Sets the value of the hovedOplysninger property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerType }
     *     
     */
    public void setHovedOplysninger(HovedOplysningerType value) {
        this.hovedOplysninger = value;
    }

    /**
     * Gets the value of the datoTidSoegTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoTidSoegTidspunkt() {
        return datoTidSoegTidspunkt;
    }

    /**
     * Sets the value of the datoTidSoegTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoTidSoegTidspunkt(XMLGregorianCalendar value) {
        this.datoTidSoegTidspunkt = value;
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

}
