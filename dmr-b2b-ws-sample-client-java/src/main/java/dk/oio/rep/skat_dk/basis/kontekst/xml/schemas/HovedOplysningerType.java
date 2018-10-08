
package dk.oio.rep.skat_dk.basis.kontekst.xml.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HovedOplysningerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HovedOplysningerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}TransaktionIdentifikator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}TransaktionTid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HovedOplysningerType", propOrder = {
    "transaktionIdentifikator",
    "transaktionTid"
})
public class HovedOplysningerType {

    @XmlElement(name = "TransaktionIdentifikator")
    protected String transaktionIdentifikator;
    @XmlElement(name = "TransaktionTid")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transaktionTid;

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

}
