
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejAnvendelseListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejAnvendelseListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejAnvendelseListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejAnvendelseListeHent_O"/&gt;
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
@XmlType(name = "USKoeretoejAnvendelseListeHentInterfaceType", propOrder = {
    "usKoeretoejAnvendelseListeHentI",
    "usKoeretoejAnvendelseListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejAnvendelseListeHentInterfaceType {

    @XmlElement(name = "USKoeretoejAnvendelseListeHent_I")
    protected USKoeretoejAnvendelseListeHentI usKoeretoejAnvendelseListeHentI;
    @XmlElement(name = "USKoeretoejAnvendelseListeHent_O")
    protected USKoeretoejAnvendelseListeHentO usKoeretoejAnvendelseListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejAnvendelseListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejAnvendelseListeHentI }
     *     
     */
    public USKoeretoejAnvendelseListeHentI getUSKoeretoejAnvendelseListeHentI() {
        return usKoeretoejAnvendelseListeHentI;
    }

    /**
     * Sets the value of the usKoeretoejAnvendelseListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejAnvendelseListeHentI }
     *     
     */
    public void setUSKoeretoejAnvendelseListeHentI(USKoeretoejAnvendelseListeHentI value) {
        this.usKoeretoejAnvendelseListeHentI = value;
    }

    /**
     * Gets the value of the usKoeretoejAnvendelseListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejAnvendelseListeHentO }
     *     
     */
    public USKoeretoejAnvendelseListeHentO getUSKoeretoejAnvendelseListeHentO() {
        return usKoeretoejAnvendelseListeHentO;
    }

    /**
     * Sets the value of the usKoeretoejAnvendelseListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejAnvendelseListeHentO }
     *     
     */
    public void setUSKoeretoejAnvendelseListeHentO(USKoeretoejAnvendelseListeHentO value) {
        this.usKoeretoejAnvendelseListeHentO = value;
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
