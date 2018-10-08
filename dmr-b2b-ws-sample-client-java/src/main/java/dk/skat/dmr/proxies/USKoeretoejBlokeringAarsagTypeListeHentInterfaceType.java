
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejBlokeringAarsagTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejBlokeringAarsagTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejBlokeringAarsagTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejBlokeringAarsagTypeListeHent_O"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejBlokeringAarsagTypeListeHent_FejlID"/&gt;
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
@XmlType(name = "USKoeretoejBlokeringAarsagTypeListeHentInterfaceType", propOrder = {
    "usKoeretoejBlokeringAarsagTypeListeHentI",
    "usKoeretoejBlokeringAarsagTypeListeHentO",
    "usKoeretoejBlokeringAarsagTypeListeHentFejlID",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejBlokeringAarsagTypeListeHentInterfaceType {

    @XmlElement(name = "USKoeretoejBlokeringAarsagTypeListeHent_I")
    protected USKoeretoejBlokeringAarsagTypeListeHentI usKoeretoejBlokeringAarsagTypeListeHentI;
    @XmlElement(name = "USKoeretoejBlokeringAarsagTypeListeHent_O")
    protected USKoeretoejBlokeringAarsagTypeListeHentO usKoeretoejBlokeringAarsagTypeListeHentO;
    @XmlElement(name = "USKoeretoejBlokeringAarsagTypeListeHent_FejlID")
    protected USKoeretoejBlokeringAarsagTypeListeHentFejlIDType usKoeretoejBlokeringAarsagTypeListeHentFejlID;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejBlokeringAarsagTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBlokeringAarsagTypeListeHentI }
     *     
     */
    public USKoeretoejBlokeringAarsagTypeListeHentI getUSKoeretoejBlokeringAarsagTypeListeHentI() {
        return usKoeretoejBlokeringAarsagTypeListeHentI;
    }

    /**
     * Sets the value of the usKoeretoejBlokeringAarsagTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBlokeringAarsagTypeListeHentI }
     *     
     */
    public void setUSKoeretoejBlokeringAarsagTypeListeHentI(USKoeretoejBlokeringAarsagTypeListeHentI value) {
        this.usKoeretoejBlokeringAarsagTypeListeHentI = value;
    }

    /**
     * Gets the value of the usKoeretoejBlokeringAarsagTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBlokeringAarsagTypeListeHentO }
     *     
     */
    public USKoeretoejBlokeringAarsagTypeListeHentO getUSKoeretoejBlokeringAarsagTypeListeHentO() {
        return usKoeretoejBlokeringAarsagTypeListeHentO;
    }

    /**
     * Sets the value of the usKoeretoejBlokeringAarsagTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBlokeringAarsagTypeListeHentO }
     *     
     */
    public void setUSKoeretoejBlokeringAarsagTypeListeHentO(USKoeretoejBlokeringAarsagTypeListeHentO value) {
        this.usKoeretoejBlokeringAarsagTypeListeHentO = value;
    }

    /**
     * Gets the value of the usKoeretoejBlokeringAarsagTypeListeHentFejlID property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBlokeringAarsagTypeListeHentFejlIDType }
     *     
     */
    public USKoeretoejBlokeringAarsagTypeListeHentFejlIDType getUSKoeretoejBlokeringAarsagTypeListeHentFejlID() {
        return usKoeretoejBlokeringAarsagTypeListeHentFejlID;
    }

    /**
     * Sets the value of the usKoeretoejBlokeringAarsagTypeListeHentFejlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBlokeringAarsagTypeListeHentFejlIDType }
     *     
     */
    public void setUSKoeretoejBlokeringAarsagTypeListeHentFejlID(USKoeretoejBlokeringAarsagTypeListeHentFejlIDType value) {
        this.usKoeretoejBlokeringAarsagTypeListeHentFejlID = value;
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
