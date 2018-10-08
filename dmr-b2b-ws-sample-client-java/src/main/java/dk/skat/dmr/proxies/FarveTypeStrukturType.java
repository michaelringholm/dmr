
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FarveTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarveTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}FarveTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}FarveTypeNavn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarveTypeStrukturType", propOrder = {
    "farveTypeNummer",
    "farveTypeNavn"
})
public class FarveTypeStrukturType {

    @XmlElement(name = "FarveTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long farveTypeNummer;
    @XmlElement(name = "FarveTypeNavn", required = true)
    protected String farveTypeNavn;

    /**
     * Gets the value of the farveTypeNummer property.
     * 
     */
    public long getFarveTypeNummer() {
        return farveTypeNummer;
    }

    /**
     * Sets the value of the farveTypeNummer property.
     * 
     */
    public void setFarveTypeNummer(long value) {
        this.farveTypeNummer = value;
    }

    /**
     * Gets the value of the farveTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarveTypeNavn() {
        return farveTypeNavn;
    }

    /**
     * Sets the value of the farveTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarveTypeNavn(String value) {
        this.farveTypeNavn = value;
    }

}
