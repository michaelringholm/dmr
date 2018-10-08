
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejArtListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejArtListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejArtListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejArtListeHent_O"/&gt;
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
@XmlType(name = "USKoeretoejArtListeHentInterfaceType", propOrder = {
    "usKoeretoejArtListeHentI",
    "usKoeretoejArtListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejArtListeHentInterfaceType {

    @XmlElement(name = "USKoeretoejArtListeHent_I")
    protected USKoeretoejArtListeHentI usKoeretoejArtListeHentI;
    @XmlElement(name = "USKoeretoejArtListeHent_O")
    protected USKoeretoejArtListeHentO usKoeretoejArtListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejArtListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejArtListeHentI }
     *     
     */
    public USKoeretoejArtListeHentI getUSKoeretoejArtListeHentI() {
        return usKoeretoejArtListeHentI;
    }

    /**
     * Sets the value of the usKoeretoejArtListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejArtListeHentI }
     *     
     */
    public void setUSKoeretoejArtListeHentI(USKoeretoejArtListeHentI value) {
        this.usKoeretoejArtListeHentI = value;
    }

    /**
     * Gets the value of the usKoeretoejArtListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejArtListeHentO }
     *     
     */
    public USKoeretoejArtListeHentO getUSKoeretoejArtListeHentO() {
        return usKoeretoejArtListeHentO;
    }

    /**
     * Sets the value of the usKoeretoejArtListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejArtListeHentO }
     *     
     */
    public void setUSKoeretoejArtListeHentO(USKoeretoejArtListeHentO value) {
        this.usKoeretoejArtListeHentO = value;
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
