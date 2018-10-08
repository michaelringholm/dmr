
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejRegistreringStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KoeretoejRegistreringStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="100"/&gt;
 *     &lt;enumeration value="UnderUdarbejdelse"/&gt;
 *     &lt;enumeration value="Registreret"/&gt;
 *     &lt;enumeration value="Afmeldt"/&gt;
 *     &lt;whiteSpace value="preserve"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoeretoejRegistreringStatusType")
@XmlEnum
public enum KoeretoejRegistreringStatusType {

    @XmlEnumValue("UnderUdarbejdelse")
    UNDER_UDARBEJDELSE("UnderUdarbejdelse"),
    @XmlEnumValue("Registreret")
    REGISTRERET("Registreret"),
    @XmlEnumValue("Afmeldt")
    AFMELDT("Afmeldt");
    private final String value;

    KoeretoejRegistreringStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoeretoejRegistreringStatusType fromValue(String v) {
        for (KoeretoejRegistreringStatusType c: KoeretoejRegistreringStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
