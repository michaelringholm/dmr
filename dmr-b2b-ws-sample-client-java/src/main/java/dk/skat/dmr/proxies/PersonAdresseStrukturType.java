
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonAdresseStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonAdresseStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adresser"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AlternativAdresser"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonAdresseStrukturType", propOrder = {
    "adresser",
    "alternativAdresser"
})
public class PersonAdresseStrukturType {

    @XmlElement(name = "Adresser", required = true)
    protected PersonAdresseStrukturType.Adresser adresser;
    @XmlElement(name = "AlternativAdresser", required = true)
    protected PersonAdresseStrukturType.AlternativAdresser alternativAdresser;

    /**
     * Gets the value of the adresser property.
     * 
     * @return
     *     possible object is
     *     {@link PersonAdresseStrukturType.Adresser }
     *     
     */
    public PersonAdresseStrukturType.Adresser getAdresser() {
        return adresser;
    }

    /**
     * Sets the value of the adresser property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonAdresseStrukturType.Adresser }
     *     
     */
    public void setAdresser(PersonAdresseStrukturType.Adresser value) {
        this.adresser = value;
    }

    /**
     * Gets the value of the alternativAdresser property.
     * 
     * @return
     *     possible object is
     *     {@link PersonAdresseStrukturType.AlternativAdresser }
     *     
     */
    public PersonAdresseStrukturType.AlternativAdresser getAlternativAdresser() {
        return alternativAdresser;
    }

    /**
     * Sets the value of the alternativAdresser property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonAdresseStrukturType.AlternativAdresser }
     *     
     */
    public void setAlternativAdresser(PersonAdresseStrukturType.AlternativAdresser value) {
        this.alternativAdresser = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AdresseStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "adresseStruktur"
    })
    public static class Adresser {

        @XmlElement(name = "AdresseStruktur")
        protected List<AdresseStrukturType> adresseStruktur;

        /**
         * Gets the value of the adresseStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adresseStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdresseStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdresseStrukturType }
         * 
         * 
         */
        public List<AdresseStrukturType> getAdresseStruktur() {
            if (adresseStruktur == null) {
                adresseStruktur = new ArrayList<AdresseStrukturType>();
            }
            return this.adresseStruktur;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}AlternativAdresseStruktur" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alternativAdresseStruktur"
    })
    public static class AlternativAdresser {

        @XmlElement(name = "AlternativAdresseStruktur")
        protected List<AlternativAdresseStrukturType> alternativAdresseStruktur;

        /**
         * Gets the value of the alternativAdresseStruktur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternativAdresseStruktur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternativAdresseStruktur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AlternativAdresseStrukturType }
         * 
         * 
         */
        public List<AlternativAdresseStrukturType> getAlternativAdresseStruktur() {
            if (alternativAdresseStruktur == null) {
                alternativAdresseStruktur = new ArrayList<AlternativAdresseStrukturType>();
            }
            return this.alternativAdresseStruktur;
        }

    }

}
