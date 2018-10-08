
package dk.oio.rep.skat_dk.basis.kontekst.xml.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvarStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvarStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}AdvisStruktur"/&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}FejlStruktur"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvarStrukturType", propOrder = {
    "advisStrukturOrFejlStruktur"
})
public class SvarStrukturType {

    @XmlElements({
        @XmlElement(name = "AdvisStruktur", type = AdvisStrukturType.class),
        @XmlElement(name = "FejlStruktur", type = FejlStrukturType.class)
    })
    protected List<Object> advisStrukturOrFejlStruktur;

    /**
     * Gets the value of the advisStrukturOrFejlStruktur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advisStrukturOrFejlStruktur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvisStrukturOrFejlStruktur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvisStrukturType }
     * {@link FejlStrukturType }
     * 
     * 
     */
    public List<Object> getAdvisStrukturOrFejlStruktur() {
        if (advisStrukturOrFejlStruktur == null) {
            advisStrukturOrFejlStruktur = new ArrayList<Object>();
        }
        return this.advisStrukturOrFejlStruktur;
    }

}
