
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USDrivkraftTypeListeHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USDrivkraftTypeListeHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DrivkraftTypeSamlingStruktur" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USDrivkraftTypeListeHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "drivkraftTypeSamlingStruktur"
})
@XmlSeeAlso({
    USDrivkraftTypeListeHentO.class
})
public class USDrivkraftTypeListeHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "DrivkraftTypeSamlingStruktur")
    protected DrivkraftTypeSamlingStrukturType drivkraftTypeSamlingStruktur;

    /**
     * Gets the value of the hovedOplysningerSvar property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public HovedOplysningerSvarType getHovedOplysningerSvar() {
        return hovedOplysningerSvar;
    }

    /**
     * Sets the value of the hovedOplysningerSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public void setHovedOplysningerSvar(HovedOplysningerSvarType value) {
        this.hovedOplysningerSvar = value;
    }

    /**
     * Gets the value of the drivkraftTypeSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link DrivkraftTypeSamlingStrukturType }
     *     
     */
    public DrivkraftTypeSamlingStrukturType getDrivkraftTypeSamlingStruktur() {
        return drivkraftTypeSamlingStruktur;
    }

    /**
     * Sets the value of the drivkraftTypeSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivkraftTypeSamlingStrukturType }
     *     
     */
    public void setDrivkraftTypeSamlingStruktur(DrivkraftTypeSamlingStrukturType value) {
        this.drivkraftTypeSamlingStruktur = value;
    }

}
