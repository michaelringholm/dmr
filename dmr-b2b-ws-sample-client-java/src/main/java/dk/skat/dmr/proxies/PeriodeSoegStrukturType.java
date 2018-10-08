
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PeriodeSoegStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodeSoegStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DatoTidSoegFra"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DatoTidSoegTil"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodeSoegStrukturType", propOrder = {
    "datoTidSoegFra",
    "datoTidSoegTil"
})
public class PeriodeSoegStrukturType {

    @XmlElement(name = "DatoTidSoegFra", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datoTidSoegFra;
    @XmlElement(name = "DatoTidSoegTil", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datoTidSoegTil;

    /**
     * Gets the value of the datoTidSoegFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoTidSoegFra() {
        return datoTidSoegFra;
    }

    /**
     * Sets the value of the datoTidSoegFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoTidSoegFra(XMLGregorianCalendar value) {
        this.datoTidSoegFra = value;
    }

    /**
     * Gets the value of the datoTidSoegTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoTidSoegTil() {
        return datoTidSoegTil;
    }

    /**
     * Sets the value of the datoTidSoegTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoTidSoegTil(XMLGregorianCalendar value) {
        this.datoTidSoegTil = value;
    }

}
