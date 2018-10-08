
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodiskSynTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodiskSynTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="20"/&gt;
 *     &lt;enumeration value="IkkeUnderlagt"/&gt;
 *     &lt;enumeration value="Periodisk1plus1"/&gt;
 *     &lt;enumeration value="Periodisk2plus2"/&gt;
 *     &lt;enumeration value="Periodisk4plus2"/&gt;
 *     &lt;enumeration value="Periodisk40plus8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodiskSynTypeType")
@XmlEnum
public enum PeriodiskSynTypeType {

    @XmlEnumValue("IkkeUnderlagt")
    IKKE_UNDERLAGT("IkkeUnderlagt"),
    @XmlEnumValue("Periodisk1plus1")
    PERIODISK_1_PLUS_1("Periodisk1plus1"),
    @XmlEnumValue("Periodisk2plus2")
    PERIODISK_2_PLUS_2("Periodisk2plus2"),
    @XmlEnumValue("Periodisk4plus2")
    PERIODISK_4_PLUS_2("Periodisk4plus2"),
    @XmlEnumValue("Periodisk40plus8")
    PERIODISK_40_PLUS_8("Periodisk40plus8");
    private final String value;

    PeriodiskSynTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodiskSynTypeType fromValue(String v) {
        for (PeriodiskSynTypeType c: PeriodiskSynTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
