
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USNormTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USNormTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USNormTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USNormTypeListeHent_O"/&gt;
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
@XmlType(name = "USNormTypeListeHentInterfaceType", propOrder = {
    "usNormTypeListeHentI",
    "usNormTypeListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USNormTypeListeHentInterfaceType {

    @XmlElement(name = "USNormTypeListeHent_I")
    protected USNormTypeListeHentI usNormTypeListeHentI;
    @XmlElement(name = "USNormTypeListeHent_O")
    protected USNormTypeListeHentO usNormTypeListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usNormTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USNormTypeListeHentI }
     *     
     */
    public USNormTypeListeHentI getUSNormTypeListeHentI() {
        return usNormTypeListeHentI;
    }

    /**
     * Sets the value of the usNormTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USNormTypeListeHentI }
     *     
     */
    public void setUSNormTypeListeHentI(USNormTypeListeHentI value) {
        this.usNormTypeListeHentI = value;
    }

    /**
     * Gets the value of the usNormTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USNormTypeListeHentO }
     *     
     */
    public USNormTypeListeHentO getUSNormTypeListeHentO() {
        return usNormTypeListeHentO;
    }

    /**
     * Sets the value of the usNormTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USNormTypeListeHentO }
     *     
     */
    public void setUSNormTypeListeHentO(USNormTypeListeHentO value) {
        this.usNormTypeListeHentO = value;
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
