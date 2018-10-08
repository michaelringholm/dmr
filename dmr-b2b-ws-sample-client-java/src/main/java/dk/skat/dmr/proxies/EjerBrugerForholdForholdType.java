
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EjerBrugerForholdForholdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EjerBrugerForholdForholdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="10"/&gt;
 *     &lt;enumeration value="Ejer"/&gt;
 *     &lt;enumeration value="Bruger"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EjerBrugerForholdForholdType")
@XmlEnum
public enum EjerBrugerForholdForholdType {

    @XmlEnumValue("Ejer")
    EJER("Ejer"),
    @XmlEnumValue("Bruger")
    BRUGER("Bruger");
    private final String value;

    EjerBrugerForholdForholdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EjerBrugerForholdForholdType fromValue(String v) {
        for (EjerBrugerForholdForholdType c: EjerBrugerForholdForholdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
