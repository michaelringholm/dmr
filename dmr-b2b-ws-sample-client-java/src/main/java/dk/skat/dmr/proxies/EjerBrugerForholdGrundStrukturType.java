
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EjerBrugerForholdGrundStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EjerBrugerForholdGrundStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}EjerBrugerForholdForhold"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}EjerBrugerForholdPrimaer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EjerBrugerForholdGrundStrukturType", propOrder = {
    "ejerBrugerForholdForhold",
    "ejerBrugerForholdPrimaer"
})
public class EjerBrugerForholdGrundStrukturType {

    @XmlElement(name = "EjerBrugerForholdForhold", required = true)
    @XmlSchemaType(name = "string")
    protected EjerBrugerForholdForholdType ejerBrugerForholdForhold;
    @XmlElement(name = "EjerBrugerForholdPrimaer")
    protected boolean ejerBrugerForholdPrimaer;

    /**
     * Gets the value of the ejerBrugerForholdForhold property.
     * 
     * @return
     *     possible object is
     *     {@link EjerBrugerForholdForholdType }
     *     
     */
    public EjerBrugerForholdForholdType getEjerBrugerForholdForhold() {
        return ejerBrugerForholdForhold;
    }

    /**
     * Sets the value of the ejerBrugerForholdForhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjerBrugerForholdForholdType }
     *     
     */
    public void setEjerBrugerForholdForhold(EjerBrugerForholdForholdType value) {
        this.ejerBrugerForholdForhold = value;
    }

    /**
     * Gets the value of the ejerBrugerForholdPrimaer property.
     * 
     */
    public boolean isEjerBrugerForholdPrimaer() {
        return ejerBrugerForholdPrimaer;
    }

    /**
     * Sets the value of the ejerBrugerForholdPrimaer property.
     * 
     */
    public void setEjerBrugerForholdPrimaer(boolean value) {
        this.ejerBrugerForholdPrimaer = value;
    }

}
