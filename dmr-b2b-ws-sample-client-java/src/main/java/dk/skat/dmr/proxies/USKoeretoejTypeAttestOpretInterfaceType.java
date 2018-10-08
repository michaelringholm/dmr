
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejTypeAttestOpretInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejTypeAttestOpretInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejTypeAttestOpret_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejTypeAttestOpret_O"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KompenserTrans"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KompenserTransSvar"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USKoeretoejTypeAttestOpretInterfaceType", propOrder = {
    "usKoeretoejTypeAttestOpretI",
    "usKoeretoejTypeAttestOpretO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejTypeAttestOpretInterfaceType {

    @XmlElement(name = "USKoeretoejTypeAttestOpret_I")
    protected USKoeretoejTypeAttestOpretI usKoeretoejTypeAttestOpretI;
    @XmlElement(name = "USKoeretoejTypeAttestOpret_O")
    protected USKoeretoejTypeAttestOpretO usKoeretoejTypeAttestOpretO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejTypeAttestOpretI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejTypeAttestOpretI }
     *     
     */
    public USKoeretoejTypeAttestOpretI getUSKoeretoejTypeAttestOpretI() {
        return usKoeretoejTypeAttestOpretI;
    }

    /**
     * Sets the value of the usKoeretoejTypeAttestOpretI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejTypeAttestOpretI }
     *     
     */
    public void setUSKoeretoejTypeAttestOpretI(USKoeretoejTypeAttestOpretI value) {
        this.usKoeretoejTypeAttestOpretI = value;
    }

    /**
     * Gets the value of the usKoeretoejTypeAttestOpretO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejTypeAttestOpretO }
     *     
     */
    public USKoeretoejTypeAttestOpretO getUSKoeretoejTypeAttestOpretO() {
        return usKoeretoejTypeAttestOpretO;
    }

    /**
     * Sets the value of the usKoeretoejTypeAttestOpretO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejTypeAttestOpretO }
     *     
     */
    public void setUSKoeretoejTypeAttestOpretO(USKoeretoejTypeAttestOpretO value) {
        this.usKoeretoejTypeAttestOpretO = value;
    }

    /**
     * Gets the value of the kompenserTrans property.
     * 
     * @return
     *     possible object is
     *     {@link KompenserTransType }
     *     
     */
    public KompenserTransType getKompenserTrans() {
        return kompenserTrans;
    }

    /**
     * Sets the value of the kompenserTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link KompenserTransType }
     *     
     */
    public void setKompenserTrans(KompenserTransType value) {
        this.kompenserTrans = value;
    }

    /**
     * Gets the value of the kompenserTransSvar property.
     * 
     * @return
     *     possible object is
     *     {@link KompenserTransSvarType }
     *     
     */
    public KompenserTransSvarType getKompenserTransSvar() {
        return kompenserTransSvar;
    }

    /**
     * Sets the value of the kompenserTransSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link KompenserTransSvarType }
     *     
     */
    public void setKompenserTransSvar(KompenserTransSvarType value) {
        this.kompenserTransSvar = value;
    }

}
