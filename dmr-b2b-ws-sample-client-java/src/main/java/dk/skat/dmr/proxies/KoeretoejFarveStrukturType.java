
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejFarveStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoeretoejFarveStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}FarveTypeStruktur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoeretoejFarveStrukturType", propOrder = {
    "farveTypeStruktur"
})
public class KoeretoejFarveStrukturType {

    @XmlElement(name = "FarveTypeStruktur", required = true)
    protected FarveTypeStrukturType farveTypeStruktur;

    /**
     * Gets the value of the farveTypeStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link FarveTypeStrukturType }
     *     
     */
    public FarveTypeStrukturType getFarveTypeStruktur() {
        return farveTypeStruktur;
    }

    /**
     * Sets the value of the farveTypeStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarveTypeStrukturType }
     *     
     */
    public void setFarveTypeStruktur(FarveTypeStrukturType value) {
        this.farveTypeStruktur = value;
    }

}
