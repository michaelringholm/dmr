
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USFarveTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USFarveTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USFarveTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USFarveTypeListeHent_O"/&gt;
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
@XmlType(name = "USFarveTypeListeHentInterfaceType", propOrder = {
    "usFarveTypeListeHentI",
    "usFarveTypeListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USFarveTypeListeHentInterfaceType {

    @XmlElement(name = "USFarveTypeListeHent_I")
    protected USFarveTypeListeHentI usFarveTypeListeHentI;
    @XmlElement(name = "USFarveTypeListeHent_O")
    protected USFarveTypeListeHentO usFarveTypeListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usFarveTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USFarveTypeListeHentI }
     *     
     */
    public USFarveTypeListeHentI getUSFarveTypeListeHentI() {
        return usFarveTypeListeHentI;
    }

    /**
     * Sets the value of the usFarveTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USFarveTypeListeHentI }
     *     
     */
    public void setUSFarveTypeListeHentI(USFarveTypeListeHentI value) {
        this.usFarveTypeListeHentI = value;
    }

    /**
     * Gets the value of the usFarveTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USFarveTypeListeHentO }
     *     
     */
    public USFarveTypeListeHentO getUSFarveTypeListeHentO() {
        return usFarveTypeListeHentO;
    }

    /**
     * Sets the value of the usFarveTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USFarveTypeListeHentO }
     *     
     */
    public void setUSFarveTypeListeHentO(USFarveTypeListeHentO value) {
        this.usFarveTypeListeHentO = value;
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
