
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AkselTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AkselTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="40"/&gt;
 *     &lt;enumeration value="Enkeltmontering"/&gt;
 *     &lt;enumeration value="Storvolumendæk"/&gt;
 *     &lt;enumeration value="Dobbeltmontering"/&gt;
 *     &lt;enumeration value="Pendelaksel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AkselTypeType")
@XmlEnum
public enum AkselTypeType {

    @XmlEnumValue("Enkeltmontering")
    ENKELTMONTERING("Enkeltmontering"),
    @XmlEnumValue("Storvolumend\u00e6k")
    STORVOLUMENDÆK("Storvolumend\u00e6k"),
    @XmlEnumValue("Dobbeltmontering")
    DOBBELTMONTERING("Dobbeltmontering"),
    @XmlEnumValue("Pendelaksel")
    PENDELAKSEL("Pendelaksel");
    private final String value;

    AkselTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AkselTypeType fromValue(String v) {
        for (AkselTypeType c: AkselTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
