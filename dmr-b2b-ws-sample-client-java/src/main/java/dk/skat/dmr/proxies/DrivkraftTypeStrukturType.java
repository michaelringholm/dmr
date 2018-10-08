
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrivkraftTypeStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrivkraftTypeStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DrivkraftTypeNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DrivkraftTypeNavn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrivkraftTypeStrukturType", propOrder = {
    "drivkraftTypeNummer",
    "drivkraftTypeNavn"
})
public class DrivkraftTypeStrukturType {

    @XmlElement(name = "DrivkraftTypeNummer")
    @XmlSchemaType(name = "integer")
    protected long drivkraftTypeNummer;
    @XmlElement(name = "DrivkraftTypeNavn", required = true)
    protected String drivkraftTypeNavn;

    /**
     * Gets the value of the drivkraftTypeNummer property.
     * 
     */
    public long getDrivkraftTypeNummer() {
        return drivkraftTypeNummer;
    }

    /**
     * Sets the value of the drivkraftTypeNummer property.
     * 
     */
    public void setDrivkraftTypeNummer(long value) {
        this.drivkraftTypeNummer = value;
    }

    /**
     * Gets the value of the drivkraftTypeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivkraftTypeNavn() {
        return drivkraftTypeNavn;
    }

    /**
     * Sets the value of the drivkraftTypeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivkraftTypeNavn(String value) {
        this.drivkraftTypeNavn = value;
    }

}
