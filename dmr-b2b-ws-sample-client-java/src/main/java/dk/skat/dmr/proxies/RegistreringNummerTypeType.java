
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistreringNummerTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistreringNummerTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="40"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Historisk"/&gt;
 *     &lt;enumeration value="Ønske"/&gt;
 *     &lt;whiteSpace value="preserve"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistreringNummerTypeType")
@XmlEnum
public enum RegistreringNummerTypeType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Historisk")
    HISTORISK("Historisk"),
    @XmlEnumValue("\u00d8nske")
    ØNSKE("\u00d8nske");
    private final String value;

    RegistreringNummerTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegistreringNummerTypeType fromValue(String v) {
        for (RegistreringNummerTypeType c: RegistreringNummerTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
