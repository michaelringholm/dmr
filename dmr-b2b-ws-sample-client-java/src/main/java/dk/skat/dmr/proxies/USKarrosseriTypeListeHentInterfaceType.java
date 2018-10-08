
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKarrosseriTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKarrosseriTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKarrosseriTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKarrosseriTypeListeHent_O"/&gt;
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
@XmlType(name = "USKarrosseriTypeListeHentInterfaceType", propOrder = {
    "usKarrosseriTypeListeHentI",
    "usKarrosseriTypeListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKarrosseriTypeListeHentInterfaceType {

    @XmlElement(name = "USKarrosseriTypeListeHent_I")
    protected USKarrosseriTypeListeHentI usKarrosseriTypeListeHentI;
    @XmlElement(name = "USKarrosseriTypeListeHent_O")
    protected USKarrosseriTypeListeHentO usKarrosseriTypeListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKarrosseriTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKarrosseriTypeListeHentI }
     *     
     */
    public USKarrosseriTypeListeHentI getUSKarrosseriTypeListeHentI() {
        return usKarrosseriTypeListeHentI;
    }

    /**
     * Sets the value of the usKarrosseriTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKarrosseriTypeListeHentI }
     *     
     */
    public void setUSKarrosseriTypeListeHentI(USKarrosseriTypeListeHentI value) {
        this.usKarrosseriTypeListeHentI = value;
    }

    /**
     * Gets the value of the usKarrosseriTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKarrosseriTypeListeHentO }
     *     
     */
    public USKarrosseriTypeListeHentO getUSKarrosseriTypeListeHentO() {
        return usKarrosseriTypeListeHentO;
    }

    /**
     * Sets the value of the usKarrosseriTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKarrosseriTypeListeHentO }
     *     
     */
    public void setUSKarrosseriTypeListeHentO(USKarrosseriTypeListeHentO value) {
        this.usKarrosseriTypeListeHentO = value;
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
