
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejstandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KoeretoejstandType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="20"/&gt;
 *     &lt;enumeration value="UnderMiddel"/&gt;
 *     &lt;enumeration value="Middel"/&gt;
 *     &lt;enumeration value="OverMiddel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoeretoejstandType")
@XmlEnum
public enum KoeretoejstandType {

    @XmlEnumValue("UnderMiddel")
    UNDER_MIDDEL("UnderMiddel"),
    @XmlEnumValue("Middel")
    MIDDEL("Middel"),
    @XmlEnumValue("OverMiddel")
    OVER_MIDDEL("OverMiddel");
    private final String value;

    KoeretoejstandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoeretoejstandType fromValue(String v) {
        for (KoeretoejstandType c: KoeretoejstandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
