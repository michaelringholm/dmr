
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejBetegnelseOpretInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejBetegnelseOpretInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejBetegnelseOpret_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejBetegnelseOpret_O"/&gt;
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
@XmlType(name = "USKoeretoejBetegnelseOpretInterfaceType", propOrder = {
    "usKoeretoejBetegnelseOpretI",
    "usKoeretoejBetegnelseOpretO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejBetegnelseOpretInterfaceType {

    @XmlElement(name = "USKoeretoejBetegnelseOpret_I")
    protected USKoeretoejBetegnelseOpretI usKoeretoejBetegnelseOpretI;
    @XmlElement(name = "USKoeretoejBetegnelseOpret_O")
    protected USKoeretoejBetegnelseOpretO usKoeretoejBetegnelseOpretO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejBetegnelseOpretI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBetegnelseOpretI }
     *     
     */
    public USKoeretoejBetegnelseOpretI getUSKoeretoejBetegnelseOpretI() {
        return usKoeretoejBetegnelseOpretI;
    }

    /**
     * Sets the value of the usKoeretoejBetegnelseOpretI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBetegnelseOpretI }
     *     
     */
    public void setUSKoeretoejBetegnelseOpretI(USKoeretoejBetegnelseOpretI value) {
        this.usKoeretoejBetegnelseOpretI = value;
    }

    /**
     * Gets the value of the usKoeretoejBetegnelseOpretO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBetegnelseOpretO }
     *     
     */
    public USKoeretoejBetegnelseOpretO getUSKoeretoejBetegnelseOpretO() {
        return usKoeretoejBetegnelseOpretO;
    }

    /**
     * Sets the value of the usKoeretoejBetegnelseOpretO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBetegnelseOpretO }
     *     
     */
    public void setUSKoeretoejBetegnelseOpretO(USKoeretoejBetegnelseOpretO value) {
        this.usKoeretoejBetegnelseOpretO = value;
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
