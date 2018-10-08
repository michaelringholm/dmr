
package dk.skat.dmr.proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EjerBrugerSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EjerBrugerSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EjerBrugerSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EjerBruger" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}EjerBrugerForholdGrundStruktur"/&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "EjerBrugerSamlingStrukturType", propOrder = {
    "ejerBrugerSamling"
})
public class EjerBrugerSamlingStrukturType {

    @XmlElement(name = "EjerBrugerSamling", required = true)
    protected EjerBrugerSamlingStrukturType.EjerBrugerSamling ejerBrugerSamling;

    /**
     * Gets the value of the ejerBrugerSamling property.
     * 
     * @return
     *     possible object is
     *     {@link EjerBrugerSamlingStrukturType.EjerBrugerSamling }
     *     
     */
    public EjerBrugerSamlingStrukturType.EjerBrugerSamling getEjerBrugerSamling() {
        return ejerBrugerSamling;
    }

    /**
     * Sets the value of the ejerBrugerSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjerBrugerSamlingStrukturType.EjerBrugerSamling }
     *     
     */
    public void setEjerBrugerSamling(EjerBrugerSamlingStrukturType.EjerBrugerSamling value) {
        this.ejerBrugerSamling = value;
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
     *         &lt;element name="EjerBruger" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}EjerBrugerForholdGrundStruktur"/&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
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
    @XmlType(name = "", propOrder = {
        "ejerBruger"
    })
    public static class EjerBrugerSamling {

        @XmlElement(name = "EjerBruger")
        protected List<EjerBrugerSamlingStrukturType.EjerBrugerSamling.EjerBruger> ejerBruger;

        /**
         * Gets the value of the ejerBruger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ejerBruger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEjerBruger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EjerBrugerSamlingStrukturType.EjerBrugerSamling.EjerBruger }
         * 
         * 
         */
        public List<EjerBrugerSamlingStrukturType.EjerBrugerSamling.EjerBruger> getEjerBruger() {
            if (ejerBruger == null) {
                ejerBruger = new ArrayList<EjerBrugerSamlingStrukturType.EjerBrugerSamling.EjerBruger>();
            }
            return this.ejerBruger;
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
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}EjerBrugerForholdGrundStruktur"/&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
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
            "ejerBrugerForholdGrundStruktur",
            "juridiskEnhedStruktur"
        })
        public static class EjerBruger {

            @XmlElement(name = "EjerBrugerForholdGrundStruktur", required = true)
            protected EjerBrugerForholdGrundStrukturType ejerBrugerForholdGrundStruktur;
            @XmlElement(name = "JuridiskEnhedStruktur", required = true)
            protected JuridiskEnhedStrukturType juridiskEnhedStruktur;

            /**
             * Gets the value of the ejerBrugerForholdGrundStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link EjerBrugerForholdGrundStrukturType }
             *     
             */
            public EjerBrugerForholdGrundStrukturType getEjerBrugerForholdGrundStruktur() {
                return ejerBrugerForholdGrundStruktur;
            }

            /**
             * Sets the value of the ejerBrugerForholdGrundStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link EjerBrugerForholdGrundStrukturType }
             *     
             */
            public void setEjerBrugerForholdGrundStruktur(EjerBrugerForholdGrundStrukturType value) {
                this.ejerBrugerForholdGrundStruktur = value;
            }

            /**
             * Gets the value of the juridiskEnhedStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link JuridiskEnhedStrukturType }
             *     
             */
            public JuridiskEnhedStrukturType getJuridiskEnhedStruktur() {
                return juridiskEnhedStruktur;
            }

            /**
             * Sets the value of the juridiskEnhedStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link JuridiskEnhedStrukturType }
             *     
             */
            public void setJuridiskEnhedStruktur(JuridiskEnhedStrukturType value) {
                this.juridiskEnhedStruktur = value;
            }

        }

    }

}
