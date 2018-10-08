
package dk.oio.rep.skat_dk.basis.kontekst.xml.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HovedOplysningerSvarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HovedOplysningerSvarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}TransaktionIdentifikator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}ServiceIdentifikator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}TransaktionTid" minOccurs="0"/&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}SvarStruktur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HovedOplysningerSvarType", propOrder = {
    "transaktionIdentifikator",
    "serviceIdentifikator",
    "transaktionTid",
    "svarStruktur"
})
public class HovedOplysningerSvarType {

    @XmlElement(name = "TransaktionIdentifikator")
    protected String transaktionIdentifikator;
    @XmlElement(name = "ServiceIdentifikator")
    protected String serviceIdentifikator;
    @XmlElement(name = "TransaktionTid")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transaktionTid;
    @XmlElement(name = "SvarStruktur", required = true)
    protected SvarStrukturType svarStruktur;

    /**
     * Gets the value of the transaktionIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaktionIdentifikator() {
        return transaktionIdentifikator;
    }

    /**
     * Sets the value of the transaktionIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaktionIdentifikator(String value) {
        this.transaktionIdentifikator = value;
    }

    /**
     * Gets the value of the serviceIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentifikator() {
        return serviceIdentifikator;
    }

    /**
     * Sets the value of the serviceIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentifikator(String value) {
        this.serviceIdentifikator = value;
    }

    /**
     * Gets the value of the transaktionTid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransaktionTid() {
        return transaktionTid;
    }

    /**
     * Sets the value of the transaktionTid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransaktionTid(XMLGregorianCalendar value) {
        this.transaktionTid = value;
    }

    /**
     * Gets the value of the svarStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link SvarStrukturType }
     *     
     */
    public SvarStrukturType getSvarStruktur() {
        return svarStruktur;
    }

    /**
     * Sets the value of the svarStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvarStrukturType }
     *     
     */
    public void setSvarStruktur(SvarStrukturType value) {
        this.svarStruktur = value;
    }

}
