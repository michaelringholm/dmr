
package dk.skat.dmr.proxies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoeretoejErklaeringOpretterRolleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KoeretoejErklaeringOpretterRolleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="50"/&gt;
 *     &lt;enumeration value="Importør"/&gt;
 *     &lt;enumeration value="Forhandler"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoeretoejErklaeringOpretterRolleType")
@XmlEnum
public enum KoeretoejErklaeringOpretterRolleType {

    @XmlEnumValue("Import\u00f8r")
    IMPORTØR("Import\u00f8r"),
    @XmlEnumValue("Forhandler")
    FORHANDLER("Forhandler");
    private final String value;

    KoeretoejErklaeringOpretterRolleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoeretoejErklaeringOpretterRolleType fromValue(String v) {
        for (KoeretoejErklaeringOpretterRolleType c: KoeretoejErklaeringOpretterRolleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
