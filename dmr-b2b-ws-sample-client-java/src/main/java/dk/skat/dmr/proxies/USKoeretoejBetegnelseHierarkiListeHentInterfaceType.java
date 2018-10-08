
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USKoeretoejBetegnelseHierarkiListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USKoeretoejBetegnelseHierarkiListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejBetegnelseHierarkiListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USKoeretoejBetegnelseHierarkiListeHent_O"/&gt;
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
@XmlType(name = "USKoeretoejBetegnelseHierarkiListeHentInterfaceType", propOrder = {
    "usKoeretoejBetegnelseHierarkiListeHentI",
    "usKoeretoejBetegnelseHierarkiListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USKoeretoejBetegnelseHierarkiListeHentInterfaceType {

    @XmlElement(name = "USKoeretoejBetegnelseHierarkiListeHent_I")
    protected USKoeretoejBetegnelseHierarkiListeHentI usKoeretoejBetegnelseHierarkiListeHentI;
    @XmlElement(name = "USKoeretoejBetegnelseHierarkiListeHent_O")
    protected USKoeretoejBetegnelseHierarkiListeHentO usKoeretoejBetegnelseHierarkiListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usKoeretoejBetegnelseHierarkiListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBetegnelseHierarkiListeHentI }
     *     
     */
    public USKoeretoejBetegnelseHierarkiListeHentI getUSKoeretoejBetegnelseHierarkiListeHentI() {
        return usKoeretoejBetegnelseHierarkiListeHentI;
    }

    /**
     * Sets the value of the usKoeretoejBetegnelseHierarkiListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBetegnelseHierarkiListeHentI }
     *     
     */
    public void setUSKoeretoejBetegnelseHierarkiListeHentI(USKoeretoejBetegnelseHierarkiListeHentI value) {
        this.usKoeretoejBetegnelseHierarkiListeHentI = value;
    }

    /**
     * Gets the value of the usKoeretoejBetegnelseHierarkiListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USKoeretoejBetegnelseHierarkiListeHentO }
     *     
     */
    public USKoeretoejBetegnelseHierarkiListeHentO getUSKoeretoejBetegnelseHierarkiListeHentO() {
        return usKoeretoejBetegnelseHierarkiListeHentO;
    }

    /**
     * Sets the value of the usKoeretoejBetegnelseHierarkiListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USKoeretoejBetegnelseHierarkiListeHentO }
     *     
     */
    public void setUSKoeretoejBetegnelseHierarkiListeHentO(USKoeretoejBetegnelseHierarkiListeHentO value) {
        this.usKoeretoejBetegnelseHierarkiListeHentO = value;
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
