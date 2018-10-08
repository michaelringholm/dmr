
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USDispensationTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USDispensationTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USDispensationTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USDispensationTypeListeHent_O"/&gt;
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
@XmlType(name = "USDispensationTypeListeHentInterfaceType", propOrder = {
    "usDispensationTypeListeHentI",
    "usDispensationTypeListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USDispensationTypeListeHentInterfaceType {

    @XmlElement(name = "USDispensationTypeListeHent_I")
    protected USDispensationTypeListeHentI usDispensationTypeListeHentI;
    @XmlElement(name = "USDispensationTypeListeHent_O")
    protected USDispensationTypeListeHentO usDispensationTypeListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usDispensationTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USDispensationTypeListeHentI }
     *     
     */
    public USDispensationTypeListeHentI getUSDispensationTypeListeHentI() {
        return usDispensationTypeListeHentI;
    }

    /**
     * Sets the value of the usDispensationTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USDispensationTypeListeHentI }
     *     
     */
    public void setUSDispensationTypeListeHentI(USDispensationTypeListeHentI value) {
        this.usDispensationTypeListeHentI = value;
    }

    /**
     * Gets the value of the usDispensationTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USDispensationTypeListeHentO }
     *     
     */
    public USDispensationTypeListeHentO getUSDispensationTypeListeHentO() {
        return usDispensationTypeListeHentO;
    }

    /**
     * Sets the value of the usDispensationTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USDispensationTypeListeHentO }
     *     
     */
    public void setUSDispensationTypeListeHentO(USDispensationTypeListeHentO value) {
        this.usDispensationTypeListeHentO = value;
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
