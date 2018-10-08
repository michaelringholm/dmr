
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USDispensationTypeListeHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USDispensationTypeListeHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}DispensationTypeSamlingStruktur" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USDispensationTypeListeHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "dispensationTypeSamlingStruktur"
})
@XmlSeeAlso({
    USDispensationTypeListeHentO.class
})
public class USDispensationTypeListeHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "DispensationTypeSamlingStruktur")
    protected DispensationTypeSamlingStrukturType dispensationTypeSamlingStruktur;

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
     * Gets the value of the dispensationTypeSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link DispensationTypeSamlingStrukturType }
     *     
     */
    public DispensationTypeSamlingStrukturType getDispensationTypeSamlingStruktur() {
        return dispensationTypeSamlingStruktur;
    }

    /**
     * Sets the value of the dispensationTypeSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispensationTypeSamlingStrukturType }
     *     
     */
    public void setDispensationTypeSamlingStruktur(DispensationTypeSamlingStrukturType value) {
        this.dispensationTypeSamlingStruktur = value;
    }

}
