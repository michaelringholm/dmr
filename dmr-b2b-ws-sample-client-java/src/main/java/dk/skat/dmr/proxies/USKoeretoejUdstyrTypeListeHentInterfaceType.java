
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejUdstyrTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejUdstyrTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejUdstyrTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejUdstyrTypeListeHent_O"/&gt;
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
@XmlType(name = "USKoeretoejUdstyrTypeListeHentInterfaceType", propOrder = {
    "usKoeretoejUdstyrTypeListeHentI",
    "usKoeretoejUdstyrTypeListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejUdstyrTypeListeHentInterfaceType {

    @XmlElement(name = "USKoeretoejUdstyrTypeListeHent_I")
    protected USKoeretoejUdstyrTypeListeHentI usKoeretoejUdstyrTypeListeHentI;
    @XmlElement(name = "USKoeretoejUdstyrTypeListeHent_O")
    protected USKoeretoejUdstyrTypeListeHentO usKoeretoejUdstyrTypeListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejUdstyrTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejUdstyrTypeListeHentI }
     *     
     */
    public USKoeretoejUdstyrTypeListeHentI getUSKoeretoejUdstyrTypeListeHentI() {
        return usKoeretoejUdstyrTypeListeHentI;
    }

    /**
     * Sets the value of the usKoeretoejUdstyrTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejUdstyrTypeListeHentI }
     *     
     */
    public void setUSKoeretoejUdstyrTypeListeHentI(USKoeretoejUdstyrTypeListeHentI value) {
        this.usKoeretoejUdstyrTypeListeHentI = value;
    }

    /**
     * Gets the value of the usKoeretoejUdstyrTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejUdstyrTypeListeHentO }
     *     
     */
    public USKoeretoejUdstyrTypeListeHentO getUSKoeretoejUdstyrTypeListeHentO() {
        return usKoeretoejUdstyrTypeListeHentO;
    }

    /**
     * Sets the value of the usKoeretoejUdstyrTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejUdstyrTypeListeHentO }
     *     
     */
    public void setUSKoeretoejUdstyrTypeListeHentO(USKoeretoejUdstyrTypeListeHentO value) {
        this.usKoeretoejUdstyrTypeListeHentO = value;
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
