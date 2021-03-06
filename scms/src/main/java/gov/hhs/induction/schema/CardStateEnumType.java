//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStateEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStateEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PersonalizationRequested"/&gt;
 *     &lt;enumeration value="CardPersonalized"/&gt;
 *     &lt;enumeration value="CardShipped"/&gt;
 *     &lt;enumeration value="CardAwaitingIssuance"/&gt;
 *     &lt;enumeration value="CardIssued"/&gt;
 *     &lt;enumeration value="CardSuspended"/&gt;
 *     &lt;enumeration value="CardReactivated"/&gt;
 *     &lt;enumeration value="CardRevoked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardStateEnumType")
@XmlEnum
public enum CardStateEnumType {

    @XmlEnumValue("PersonalizationRequested")
    PERSONALIZATION_REQUESTED("PersonalizationRequested"),
    @XmlEnumValue("CardPersonalized")
    CARD_PERSONALIZED("CardPersonalized"),
    @XmlEnumValue("CardShipped")
    CARD_SHIPPED("CardShipped"),
    @XmlEnumValue("CardAwaitingIssuance")
    CARD_AWAITING_ISSUANCE("CardAwaitingIssuance"),
    @XmlEnumValue("CardIssued")
    CARD_ISSUED("CardIssued"),
    @XmlEnumValue("CardSuspended")
    CARD_SUSPENDED("CardSuspended"),
    @XmlEnumValue("CardReactivated")
    CARD_REACTIVATED("CardReactivated"),
    @XmlEnumValue("CardRevoked")
    CARD_REVOKED("CardRevoked");
    private final String value;

    CardStateEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStateEnumType fromValue(String v) {
        for (CardStateEnumType c: CardStateEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
