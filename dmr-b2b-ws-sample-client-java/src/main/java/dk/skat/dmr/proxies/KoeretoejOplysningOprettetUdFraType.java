
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejOplysningOprettetUdFraType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KoeretoejOplysningOprettetUdFraType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="0"/&gt;
 *     &lt;maxLength value="100"/&gt;
 *     &lt;enumeration value="Registreringssyn"/&gt;
 *     &lt;enumeration value="CocDokument"/&gt;
 *     &lt;enumeration value="Typeattest"/&gt;
 *     &lt;enumeration value="ForespurgtKøretøj"/&gt;
 *     &lt;enumeration value="PrøvemærkeBestilling"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoeretoejOplysningOprettetUdFraType")
@XmlEnum
public enum KoeretoejOplysningOprettetUdFraType {

    @XmlEnumValue("Registreringssyn")
    REGISTRERINGSSYN("Registreringssyn"),
    @XmlEnumValue("CocDokument")
    COC_DOKUMENT("CocDokument"),
    @XmlEnumValue("Typeattest")
    TYPEATTEST("Typeattest"),
    @XmlEnumValue("ForespurgtK\u00f8ret\u00f8j")
    FORESPURGT_KØRETØJ("ForespurgtK\u00f8ret\u00f8j"),
    @XmlEnumValue("Pr\u00f8vem\u00e6rkeBestilling")
    PRØVEMÆRKE_BESTILLING("Pr\u00f8vem\u00e6rkeBestilling");
    private final String value;

    KoeretoejOplysningOprettetUdFraType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoeretoejOplysningOprettetUdFraType fromValue(String v) {
        for (KoeretoejOplysningOprettetUdFraType c: KoeretoejOplysningOprettetUdFraType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
