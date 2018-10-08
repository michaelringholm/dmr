
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuelmodeTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelmodeTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="10"/&gt;
 *     &lt;enumeration value="Monofuel"/&gt;
 *     &lt;enumeration value="Bifuel"/&gt;
 *     &lt;enumeration value="Flexfuel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelmodeTypeType")
@XmlEnum
public enum FuelmodeTypeType {

    @XmlEnumValue("Monofuel")
    MONOFUEL("Monofuel"),
    @XmlEnumValue("Bifuel")
    BIFUEL("Bifuel"),
    @XmlEnumValue("Flexfuel")
    FLEXFUEL("Flexfuel");
    private final String value;

    FuelmodeTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelmodeTypeType fromValue(String v) {
        for (FuelmodeTypeType c: FuelmodeTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
