
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejRegistreringHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejRegistreringHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejRegistreringHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejRegistreringHent_O"/&gt;
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
@XmlType(name = "USKoeretoejRegistreringHentInterfaceType", propOrder = {
    "usKoeretoejRegistreringHentI",
    "usKoeretoejRegistreringHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejRegistreringHentInterfaceType {

    @XmlElement(name = "USKoeretoejRegistreringHent_I")
    protected USKoeretoejRegistreringHentI usKoeretoejRegistreringHentI;
    @XmlElement(name = "USKoeretoejRegistreringHent_O")
    protected USKoeretoejRegistreringHentO usKoeretoejRegistreringHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejRegistreringHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejRegistreringHentI }
     *     
     */
    public USKoeretoejRegistreringHentI getUSKoeretoejRegistreringHentI() {
        return usKoeretoejRegistreringHentI;
    }

    /**
     * Sets the value of the usKoeretoejRegistreringHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejRegistreringHentI }
     *     
     */
    public void setUSKoeretoejRegistreringHentI(USKoeretoejRegistreringHentI value) {
        this.usKoeretoejRegistreringHentI = value;
    }

    /**
     * Gets the value of the usKoeretoejRegistreringHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejRegistreringHentO }
     *     
     */
    public USKoeretoejRegistreringHentO getUSKoeretoejRegistreringHentO() {
        return usKoeretoejRegistreringHentO;
    }

    /**
     * Sets the value of the usKoeretoejRegistreringHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejRegistreringHentO }
     *     
     */
    public void setUSKoeretoejRegistreringHentO(USKoeretoejRegistreringHentO value) {
        this.usKoeretoejRegistreringHentO = value;
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
