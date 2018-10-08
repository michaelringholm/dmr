
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternativKontaktTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlternativKontaktTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="25"/&gt;
 *     &lt;enumeration value="Person"/&gt;
 *     &lt;enumeration value="Virksomhed"/&gt;
 *     &lt;enumeration value="Myndighed"/&gt;
 *     &lt;enumeration value="Ukendt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlternativKontaktTypeType")
@XmlEnum
public enum AlternativKontaktTypeType {

    @XmlEnumValue("Person")
    PERSON("Person"),
    @XmlEnumValue("Virksomhed")
    VIRKSOMHED("Virksomhed"),
    @XmlEnumValue("Myndighed")
    MYNDIGHED("Myndighed"),
    @XmlEnumValue("Ukendt")
    UKENDT("Ukendt");
    private final String value;

    AlternativKontaktTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlternativKontaktTypeType fromValue(String v) {
        for (AlternativKontaktTypeType c: AlternativKontaktTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
