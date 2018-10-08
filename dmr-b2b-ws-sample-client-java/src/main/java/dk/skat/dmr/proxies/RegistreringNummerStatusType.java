
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistreringNummerStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistreringNummerStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="40"/&gt;
 *     &lt;enumeration value="Bestilt"/&gt;
 *     &lt;enumeration value="Afvist"/&gt;
 *     &lt;enumeration value="Godkendt"/&gt;
 *     &lt;enumeration value="Oprettet"/&gt;
 *     &lt;enumeration value="UnderEvaluering"/&gt;
 *     &lt;enumeration value="Afmeldt"/&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistreringNummerStatusType")
@XmlEnum
public enum RegistreringNummerStatusType {

    @XmlEnumValue("Bestilt")
    BESTILT("Bestilt"),
    @XmlEnumValue("Afvist")
    AFVIST("Afvist"),
    @XmlEnumValue("Godkendt")
    GODKENDT("Godkendt"),
    @XmlEnumValue("Oprettet")
    OPRETTET("Oprettet"),
    @XmlEnumValue("UnderEvaluering")
    UNDER_EVALUERING("UnderEvaluering"),
    @XmlEnumValue("Afmeldt")
    AFMELDT("Afmeldt");
    private final String value;

    RegistreringNummerStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegistreringNummerStatusType fromValue(String v) {
        for (RegistreringNummerStatusType c: RegistreringNummerStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
