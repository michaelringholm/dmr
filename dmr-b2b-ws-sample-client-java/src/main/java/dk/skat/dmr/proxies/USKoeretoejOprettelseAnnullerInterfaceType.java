
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejOprettelseAnnullerInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejOprettelseAnnullerInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejOprettelseAnnuller_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejOprettelseAnnuller_O"/&gt;
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
@XmlType(name = "USKoeretoejOprettelseAnnullerInterfaceType", propOrder = {
    "usKoeretoejOprettelseAnnullerI",
    "usKoeretoejOprettelseAnnullerO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejOprettelseAnnullerInterfaceType {

    @XmlElement(name = "USKoeretoejOprettelseAnnuller_I")
    protected USKoeretoejOprettelseAnnullerI usKoeretoejOprettelseAnnullerI;
    @XmlElement(name = "USKoeretoejOprettelseAnnuller_O")
    protected USKoeretoejOprettelseAnnullerO usKoeretoejOprettelseAnnullerO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejOprettelseAnnullerI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejOprettelseAnnullerI }
     *     
     */
    public USKoeretoejOprettelseAnnullerI getUSKoeretoejOprettelseAnnullerI() {
        return usKoeretoejOprettelseAnnullerI;
    }

    /**
     * Sets the value of the usKoeretoejOprettelseAnnullerI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejOprettelseAnnullerI }
     *     
     */
    public void setUSKoeretoejOprettelseAnnullerI(USKoeretoejOprettelseAnnullerI value) {
        this.usKoeretoejOprettelseAnnullerI = value;
    }

    /**
     * Gets the value of the usKoeretoejOprettelseAnnullerO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejOprettelseAnnullerO }
     *     
     */
    public USKoeretoejOprettelseAnnullerO getUSKoeretoejOprettelseAnnullerO() {
        return usKoeretoejOprettelseAnnullerO;
    }

    /**
     * Sets the value of the usKoeretoejOprettelseAnnullerO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejOprettelseAnnullerO }
     *     
     */
    public void setUSKoeretoejOprettelseAnnullerO(USKoeretoejOprettelseAnnullerO value) {
        this.usKoeretoejOprettelseAnnullerO = value;
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
