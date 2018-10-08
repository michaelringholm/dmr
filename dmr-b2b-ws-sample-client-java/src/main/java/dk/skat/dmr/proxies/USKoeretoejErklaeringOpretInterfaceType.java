
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejErklaeringOpretInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejErklaeringOpretInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejErklaeringOpret_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejErklaeringOpret_O"/&gt;
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
@XmlType(name = "USKoeretoejErklaeringOpretInterfaceType", propOrder = {
    "usKoeretoejErklaeringOpretI",
    "usKoeretoejErklaeringOpretO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejErklaeringOpretInterfaceType {

    @XmlElement(name = "USKoeretoejErklaeringOpret_I")
    protected USKoeretoejErklaeringOpretI usKoeretoejErklaeringOpretI;
    @XmlElement(name = "USKoeretoejErklaeringOpret_O")
    protected USKoeretoejErklaeringOpretO usKoeretoejErklaeringOpretO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejErklaeringOpretI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejErklaeringOpretI }
     *     
     */
    public USKoeretoejErklaeringOpretI getUSKoeretoejErklaeringOpretI() {
        return usKoeretoejErklaeringOpretI;
    }

    /**
     * Sets the value of the usKoeretoejErklaeringOpretI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejErklaeringOpretI }
     *     
     */
    public void setUSKoeretoejErklaeringOpretI(USKoeretoejErklaeringOpretI value) {
        this.usKoeretoejErklaeringOpretI = value;
    }

    /**
     * Gets the value of the usKoeretoejErklaeringOpretO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejErklaeringOpretO }
     *     
     */
    public USKoeretoejErklaeringOpretO getUSKoeretoejErklaeringOpretO() {
        return usKoeretoejErklaeringOpretO;
    }

    /**
     * Sets the value of the usKoeretoejErklaeringOpretO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejErklaeringOpretO }
     *     
     */
    public void setUSKoeretoejErklaeringOpretO(USKoeretoejErklaeringOpretO value) {
        this.usKoeretoejErklaeringOpretO = value;
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
