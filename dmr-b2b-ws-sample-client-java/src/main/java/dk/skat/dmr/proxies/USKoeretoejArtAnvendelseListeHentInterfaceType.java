
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejArtAnvendelseListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejArtAnvendelseListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejArtAnvendelseListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejArtAnvendelseListeHent_O"/&gt;
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
@XmlType(name = "USKoeretoejArtAnvendelseListeHentInterfaceType", propOrder = {
    "usKoeretoejArtAnvendelseListeHentI",
    "usKoeretoejArtAnvendelseListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejArtAnvendelseListeHentInterfaceType {

    @XmlElement(name = "USKoeretoejArtAnvendelseListeHent_I")
    protected USKoeretoejArtAnvendelseListeHentI usKoeretoejArtAnvendelseListeHentI;
    @XmlElement(name = "USKoeretoejArtAnvendelseListeHent_O")
    protected USKoeretoejArtAnvendelseListeHentO usKoeretoejArtAnvendelseListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejArtAnvendelseListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejArtAnvendelseListeHentI }
     *     
     */
    public USKoeretoejArtAnvendelseListeHentI getUSKoeretoejArtAnvendelseListeHentI() {
        return usKoeretoejArtAnvendelseListeHentI;
    }

    /**
     * Sets the value of the usKoeretoejArtAnvendelseListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejArtAnvendelseListeHentI }
     *     
     */
    public void setUSKoeretoejArtAnvendelseListeHentI(USKoeretoejArtAnvendelseListeHentI value) {
        this.usKoeretoejArtAnvendelseListeHentI = value;
    }

    /**
     * Gets the value of the usKoeretoejArtAnvendelseListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejArtAnvendelseListeHentO }
     *     
     */
    public USKoeretoejArtAnvendelseListeHentO getUSKoeretoejArtAnvendelseListeHentO() {
        return usKoeretoejArtAnvendelseListeHentO;
    }

    /**
     * Sets the value of the usKoeretoejArtAnvendelseListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejArtAnvendelseListeHentO }
     *     
     */
    public void setUSKoeretoejArtAnvendelseListeHentO(USKoeretoejArtAnvendelseListeHentO value) {
        this.usKoeretoejArtAnvendelseListeHentO = value;
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
