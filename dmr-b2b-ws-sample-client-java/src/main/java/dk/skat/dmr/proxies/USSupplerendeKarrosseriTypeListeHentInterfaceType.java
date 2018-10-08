
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USSupplerendeKarrosseriTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USSupplerendeKarrosseriTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USSupplerendeKarrosseriTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USSupplerendeKarrosseriTypeListeHent_O"/&gt;
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
@XmlType(name = "USSupplerendeKarrosseriTypeListeHentInterfaceType", propOrder = {
    "usSupplerendeKarrosseriTypeListeHentI",
    "usSupplerendeKarrosseriTypeListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USSupplerendeKarrosseriTypeListeHentInterfaceType {

    @XmlElement(name = "USSupplerendeKarrosseriTypeListeHent_I")
    protected USSupplerendeKarrosseriTypeListeHentI usSupplerendeKarrosseriTypeListeHentI;
    @XmlElement(name = "USSupplerendeKarrosseriTypeListeHent_O")
    protected USSupplerendeKarrosseriTypeListeHentO usSupplerendeKarrosseriTypeListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usSupplerendeKarrosseriTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USSupplerendeKarrosseriTypeListeHentI }
     *     
     */
    public USSupplerendeKarrosseriTypeListeHentI getUSSupplerendeKarrosseriTypeListeHentI() {
        return usSupplerendeKarrosseriTypeListeHentI;
    }

    /**
     * Sets the value of the usSupplerendeKarrosseriTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USSupplerendeKarrosseriTypeListeHentI }
     *     
     */
    public void setUSSupplerendeKarrosseriTypeListeHentI(USSupplerendeKarrosseriTypeListeHentI value) {
        this.usSupplerendeKarrosseriTypeListeHentI = value;
    }

    /**
     * Gets the value of the usSupplerendeKarrosseriTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USSupplerendeKarrosseriTypeListeHentO }
     *     
     */
    public USSupplerendeKarrosseriTypeListeHentO getUSSupplerendeKarrosseriTypeListeHentO() {
        return usSupplerendeKarrosseriTypeListeHentO;
    }

    /**
     * Sets the value of the usSupplerendeKarrosseriTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USSupplerendeKarrosseriTypeListeHentO }
     *     
     */
    public void setUSSupplerendeKarrosseriTypeListeHentO(USSupplerendeKarrosseriTypeListeHentO value) {
        this.usSupplerendeKarrosseriTypeListeHentO = value;
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
