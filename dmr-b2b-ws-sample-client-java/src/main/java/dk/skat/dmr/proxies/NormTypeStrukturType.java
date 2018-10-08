
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NormTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}NormTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}NormTypeNavn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NormTypeStrukturType", propOrder = {
    "normTypeNummer",
    "normTypeNavn"
})
public class NormTypeStrukturType {

    @XmlElement(name = "NormTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long normTypeNummer;
    @XmlElement(name = "NormTypeNavn", required = true)
    protected String normTypeNavn;

    /**
     * Gets the value of the normTypeNummer property.
     * 
     */
    public long getNormTypeNummer() {
        return normTypeNummer;
    }

    /**
     * Sets the value of the normTypeNummer property.
     * 
     */
    public void setNormTypeNummer(long value) {
        this.normTypeNummer = value;
    }

    /**
     * Gets the value of the normTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormTypeNavn() {
        return normTypeNavn;
    }

    /**
     * Sets the value of the normTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormTypeNavn(String value) {
        this.normTypeNavn = value;
    }

}
