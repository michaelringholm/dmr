
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejTekniskDataHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejTekniskDataHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejTekniskDataHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejTekniskDataHent_O"/&gt;
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
@XmlType(name = "USKoeretoejTekniskDataHentInterfaceType", propOrder = {
    "usKoeretoejTekniskDataHentI",
    "usKoeretoejTekniskDataHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejTekniskDataHentInterfaceType {

    @XmlElement(name = "USKoeretoejTekniskDataHent_I")
    protected USKoeretoejTekniskDataHentI usKoeretoejTekniskDataHentI;
    @XmlElement(name = "USKoeretoejTekniskDataHent_O")
    protected USKoeretoejTekniskDataHentO usKoeretoejTekniskDataHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejTekniskDataHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejTekniskDataHentI }
     *     
     */
    public USKoeretoejTekniskDataHentI getUSKoeretoejTekniskDataHentI() {
        return usKoeretoejTekniskDataHentI;
    }

    /**
     * Sets the value of the usKoeretoejTekniskDataHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejTekniskDataHentI }
     *     
     */
    public void setUSKoeretoejTekniskDataHentI(USKoeretoejTekniskDataHentI value) {
        this.usKoeretoejTekniskDataHentI = value;
    }

    /**
     * Gets the value of the usKoeretoejTekniskDataHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejTekniskDataHentO }
     *     
     */
    public USKoeretoejTekniskDataHentO getUSKoeretoejTekniskDataHentO() {
        return usKoeretoejTekniskDataHentO;
    }

    /**
     * Sets the value of the usKoeretoejTekniskDataHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejTekniskDataHentO }
     *     
     */
    public void setUSKoeretoejTekniskDataHentO(USKoeretoejTekniskDataHentO value) {
        this.usKoeretoejTekniskDataHentO = value;
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
