
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USDrivkraftTypeListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USDrivkraftTypeListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USDrivkraftTypeListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USDrivkraftTypeListeHent_O"/&gt;
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
@XmlType(name = "USDrivkraftTypeListeHentInterfaceType", propOrder = {
    "usDrivkraftTypeListeHentI",
    "usDrivkraftTypeListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USDrivkraftTypeListeHentInterfaceType {

    @XmlElement(name = "USDrivkraftTypeListeHent_I")
    protected USDrivkraftTypeListeHentI usDrivkraftTypeListeHentI;
    @XmlElement(name = "USDrivkraftTypeListeHent_O")
    protected USDrivkraftTypeListeHentO usDrivkraftTypeListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usDrivkraftTypeListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USDrivkraftTypeListeHentI }
     *     
     */
    public USDrivkraftTypeListeHentI getUSDrivkraftTypeListeHentI() {
        return usDrivkraftTypeListeHentI;
    }

    /**
     * Sets the value of the usDrivkraftTypeListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USDrivkraftTypeListeHentI }
     *     
     */
    public void setUSDrivkraftTypeListeHentI(USDrivkraftTypeListeHentI value) {
        this.usDrivkraftTypeListeHentI = value;
    }

    /**
     * Gets the value of the usDrivkraftTypeListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USDrivkraftTypeListeHentO }
     *     
     */
    public USDrivkraftTypeListeHentO getUSDrivkraftTypeListeHentO() {
        return usDrivkraftTypeListeHentO;
    }

    /**
     * Sets the value of the usDrivkraftTypeListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USDrivkraftTypeListeHentO }
     *     
     */
    public void setUSDrivkraftTypeListeHentO(USDrivkraftTypeListeHentO value) {
        this.usDrivkraftTypeListeHentO = value;
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
