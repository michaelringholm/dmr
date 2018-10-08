
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USUkompletKoeretoejOpretInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USUkompletKoeretoejOpretInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USUkompletKoeretoejOpret_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USUkompletKoeretoejOpret_O"/&gt;
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
@XmlType(name = "USUkompletKoeretoejOpretInterfaceType", propOrder = {
    "usUkompletKoeretoejOpretI",
    "usUkompletKoeretoejOpretO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USUkompletKoeretoejOpretInterfaceType {

    @XmlElement(name = "USUkompletKoeretoejOpret_I")
    protected USUkompletKoeretoejOpretI usUkompletKoeretoejOpretI;
    @XmlElement(name = "USUkompletKoeretoejOpret_O")
    protected USUkompletKoeretoejOpretO usUkompletKoeretoejOpretO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usUkompletKoeretoejOpretI property.
     * 
     * @return
     *     possible object is
     *     {@link USUkompletKoeretoejOpretI }
     *     
     */
    public USUkompletKoeretoejOpretI getUSUkompletKoeretoejOpretI() {
        return usUkompletKoeretoejOpretI;
    }

    /**
     * Sets the value of the usUkompletKoeretoejOpretI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USUkompletKoeretoejOpretI }
     *     
     */
    public void setUSUkompletKoeretoejOpretI(USUkompletKoeretoejOpretI value) {
        this.usUkompletKoeretoejOpretI = value;
    }

    /**
     * Gets the value of the usUkompletKoeretoejOpretO property.
     * 
     * @return
     *     possible object is
     *     {@link USUkompletKoeretoejOpretO }
     *     
     */
    public USUkompletKoeretoejOpretO getUSUkompletKoeretoejOpretO() {
        return usUkompletKoeretoejOpretO;
    }

    /**
     * Sets the value of the usUkompletKoeretoejOpretO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USUkompletKoeretoejOpretO }
     *     
     */
    public void setUSUkompletKoeretoejOpretO(USUkompletKoeretoejOpretO value) {
        this.usUkompletKoeretoejOpretO = value;
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
