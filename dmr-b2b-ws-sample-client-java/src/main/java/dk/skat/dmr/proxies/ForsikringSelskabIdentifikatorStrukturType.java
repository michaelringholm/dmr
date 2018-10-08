
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForsikringSelskabIdentifikatorStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForsikringSelskabIdentifikatorStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabNummer"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabNavn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForsikringSelskabIdentifikatorStrukturType", propOrder = {
    "forsikringSelskabNummer",
    "forsikringSelskabNavn"
})
public class ForsikringSelskabIdentifikatorStrukturType {

    @XmlElement(name = "ForsikringSelskabNummer", required = true)
    protected String forsikringSelskabNummer;
    @XmlElement(name = "ForsikringSelskabNavn", required = true)
    protected String forsikringSelskabNavn;

    /**
     * Gets the value of the forsikringSelskabNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForsikringSelskabNummer() {
        return forsikringSelskabNummer;
    }

    /**
     * Sets the value of the forsikringSelskabNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForsikringSelskabNummer(String value) {
        this.forsikringSelskabNummer = value;
    }

    /**
     * Gets the value of the forsikringSelskabNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForsikringSelskabNavn() {
        return forsikringSelskabNavn;
    }

    /**
     * Sets the value of the forsikringSelskabNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForsikringSelskabNavn(String value) {
        this.forsikringSelskabNavn = value;
    }

}
