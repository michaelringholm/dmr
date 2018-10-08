
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegistreringNummerStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringNummerStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerType"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerStatus"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerStatusDato"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerKvadratiskIndhold1"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerKvadratiskIndhold2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerAflangIndhold"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerUdloebDato" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerGraensepladeDkDato" minOccurs="0"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistreringNummerStrukturType", propOrder = {
    "registreringNummerType",
    "registreringNummerStatus",
    "registreringNummerStatusDato",
    "registreringNummerKvadratiskIndhold1",
    "registreringNummerKvadratiskIndhold2",
    "registreringNummerAflangIndhold",
    "registreringNummerUdloebDato",
    "registreringNummerGraensepladeDkDato",
    "registreringNummerNummer"
})
public class RegistreringNummerStrukturType {

    @XmlElement(name = "RegistreringNummerType", required = true)
    @XmlSchemaType(name = "string")
    protected RegistreringNummerTypeType registreringNummerType;
    @XmlElement(name = "RegistreringNummerStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RegistreringNummerStatusType registreringNummerStatus;
    @XmlElement(name = "RegistreringNummerStatusDato", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registreringNummerStatusDato;
    @XmlElement(name = "RegistreringNummerKvadratiskIndhold1", required = true)
    protected String registreringNummerKvadratiskIndhold1;
    @XmlElement(name = "RegistreringNummerKvadratiskIndhold2")
    protected String registreringNummerKvadratiskIndhold2;
    @XmlElement(name = "RegistreringNummerAflangIndhold", required = true)
    protected String registreringNummerAflangIndhold;
    @XmlElement(name = "RegistreringNummerUdloebDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registreringNummerUdloebDato;
    @XmlElement(name = "RegistreringNummerGraensepladeDkDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registreringNummerGraensepladeDkDato;
    @XmlElement(name = "RegistreringNummerNummer", required = true)
    protected String registreringNummerNummer;

    /**
     * Gets the value of the registreringNummerType property.
     * 
     * @return
     *     possible object is
     *     {@link RegistreringNummerTypeType }
     *     
     */
    public RegistreringNummerTypeType getRegistreringNummerType() {
        return registreringNummerType;
    }

    /**
     * Sets the value of the registreringNummerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistreringNummerTypeType }
     *     
     */
    public void setRegistreringNummerType(RegistreringNummerTypeType value) {
        this.registreringNummerType = value;
    }

    /**
     * Gets the value of the registreringNummerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistreringNummerStatusType }
     *     
     */
    public RegistreringNummerStatusType getRegistreringNummerStatus() {
        return registreringNummerStatus;
    }

    /**
     * Sets the value of the registreringNummerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistreringNummerStatusType }
     *     
     */
    public void setRegistreringNummerStatus(RegistreringNummerStatusType value) {
        this.registreringNummerStatus = value;
    }

    /**
     * Gets the value of the registreringNummerStatusDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistreringNummerStatusDato() {
        return registreringNummerStatusDato;
    }

    /**
     * Sets the value of the registreringNummerStatusDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistreringNummerStatusDato(XMLGregorianCalendar value) {
        this.registreringNummerStatusDato = value;
    }

    /**
     * Gets the value of the registreringNummerKvadratiskIndhold1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistreringNummerKvadratiskIndhold1() {
        return registreringNummerKvadratiskIndhold1;
    }

    /**
     * Sets the value of the registreringNummerKvadratiskIndhold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistreringNummerKvadratiskIndhold1(String value) {
        this.registreringNummerKvadratiskIndhold1 = value;
    }

    /**
     * Gets the value of the registreringNummerKvadratiskIndhold2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistreringNummerKvadratiskIndhold2() {
        return registreringNummerKvadratiskIndhold2;
    }

    /**
     * Sets the value of the registreringNummerKvadratiskIndhold2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistreringNummerKvadratiskIndhold2(String value) {
        this.registreringNummerKvadratiskIndhold2 = value;
    }

    /**
     * Gets the value of the registreringNummerAflangIndhold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistreringNummerAflangIndhold() {
        return registreringNummerAflangIndhold;
    }

    /**
     * Sets the value of the registreringNummerAflangIndhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistreringNummerAflangIndhold(String value) {
        this.registreringNummerAflangIndhold = value;
    }

    /**
     * Gets the value of the registreringNummerUdloebDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistreringNummerUdloebDato() {
        return registreringNummerUdloebDato;
    }

    /**
     * Sets the value of the registreringNummerUdloebDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistreringNummerUdloebDato(XMLGregorianCalendar value) {
        this.registreringNummerUdloebDato = value;
    }

    /**
     * Gets the value of the registreringNummerGraensepladeDkDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistreringNummerGraensepladeDkDato() {
        return registreringNummerGraensepladeDkDato;
    }

    /**
     * Sets the value of the registreringNummerGraensepladeDkDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistreringNummerGraensepladeDkDato(XMLGregorianCalendar value) {
        this.registreringNummerGraensepladeDkDato = value;
    }

    /**
     * Gets the value of the registreringNummerNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistreringNummerNummer() {
        return registreringNummerNummer;
    }

    /**
     * Sets the value of the registreringNummerNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistreringNummerNummer(String value) {
        this.registreringNummerNummer = value;
    }

}
