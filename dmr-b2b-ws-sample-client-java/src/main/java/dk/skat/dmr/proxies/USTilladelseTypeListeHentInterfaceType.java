
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USTilladelseTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USTilladelseTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USTilladelseTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USTilladelseTypeListeHent_O"/&gt;
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
@XmlType(name = "USTilladelseTypeListeHentInterfaceType", propOrder = {
    "usTilladelseTypeListeHentI",
    "usTilladelseTypeListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USTilladelseTypeListeHentInterfaceType {

    @XmlElement(name = "USTilladelseTypeListeHent_I")
    protected USTilladelseTypeListeHentI usTilladelseTypeListeHentI;
    @XmlElement(name = "USTilladelseTypeListeHent_O")
    protected USTilladelseTypeListeHentO usTilladelseTypeListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usTilladelseTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USTilladelseTypeListeHentI }
     *     
     */
    public USTilladelseTypeListeHentI getUSTilladelseTypeListeHentI() {
        return usTilladelseTypeListeHentI;
    }

    /**
     * Sets the value of the usTilladelseTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USTilladelseTypeListeHentI }
     *     
     */
    public void setUSTilladelseTypeListeHentI(USTilladelseTypeListeHentI value) {
        this.usTilladelseTypeListeHentI = value;
    }

    /**
     * Gets the value of the usTilladelseTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USTilladelseTypeListeHentO }
     *     
     */
    public USTilladelseTypeListeHentO getUSTilladelseTypeListeHentO() {
        return usTilladelseTypeListeHentO;
    }

    /**
     * Sets the value of the usTilladelseTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USTilladelseTypeListeHentO }
     *     
     */
    public void setUSTilladelseTypeListeHentO(USTilladelseTypeListeHentO value) {
        this.usTilladelseTypeListeHentO = value;
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
