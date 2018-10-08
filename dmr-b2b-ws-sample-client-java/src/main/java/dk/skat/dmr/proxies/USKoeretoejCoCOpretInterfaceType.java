
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejCoCOpretInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejCoCOpretInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejCoCOpret_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejCoCOpret_O"/&gt;
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
@XmlType(name = "USKoeretoejCoCOpretInterfaceType", propOrder = {
    "usKoeretoejCoCOpretI",
    "usKoeretoejCoCOpretO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejCoCOpretInterfaceType {

    @XmlElement(name = "USKoeretoejCoCOpret_I")
    protected USKoeretoejCoCOpretI usKoeretoejCoCOpretI;
    @XmlElement(name = "USKoeretoejCoCOpret_O")
    protected USKoeretoejCoCOpretO usKoeretoejCoCOpretO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejCoCOpretI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejCoCOpretI }
     *     
     */
    public USKoeretoejCoCOpretI getUSKoeretoejCoCOpretI() {
        return usKoeretoejCoCOpretI;
    }

    /**
     * Sets the value of the usKoeretoejCoCOpretI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejCoCOpretI }
     *     
     */
    public void setUSKoeretoejCoCOpretI(USKoeretoejCoCOpretI value) {
        this.usKoeretoejCoCOpretI = value;
    }

    /**
     * Gets the value of the usKoeretoejCoCOpretO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejCoCOpretO }
     *     
     */
    public USKoeretoejCoCOpretO getUSKoeretoejCoCOpretO() {
        return usKoeretoejCoCOpretO;
    }

    /**
     * Sets the value of the usKoeretoejCoCOpretO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejCoCOpretO }
     *     
     */
    public void setUSKoeretoejCoCOpretO(USKoeretoejCoCOpretO value) {
        this.usKoeretoejCoCOpretO = value;
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
