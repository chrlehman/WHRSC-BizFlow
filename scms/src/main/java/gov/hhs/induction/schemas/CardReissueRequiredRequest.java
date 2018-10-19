//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.03 at 10:07:04 PM EDT 
//


package gov.hhs.induction.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionHeader" type="{http://hspd12.hhs.gov/federated/enrollment/v1}TransactionHeaderType"/&gt;
 *         &lt;element name="CardHolderPI" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType"/&gt;
 *         &lt;element name="CardReissueReason" type="{http://hspd12.hhs.gov/federated/enrollment/v1}CardReissueReasonCodeType"/&gt;
 *         &lt;element name="CardPersonalizationLocationType" type="{http://hspd12.hhs.gov/federated/enrollment/v1}CardPersonalizationLocationTypeCodeType"/&gt;
 *         &lt;element name="NewBiometricCaptureRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionHeader",
    "cardHolderPI",
    "cardReissueReason",
    "cardPersonalizationLocationType",
    "newBiometricCaptureRequired"
})
@XmlRootElement(name = "CardReissueRequiredRequest")
public class CardReissueRequiredRequest {

    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "CardHolderPI", required = true)
    protected String cardHolderPI;
    @XmlElement(name = "CardReissueReason", required = true)
    @XmlSchemaType(name = "string")
    protected CardReissueReasonCodeType cardReissueReason;
    @XmlElement(name = "CardPersonalizationLocationType", required = true)
    @XmlSchemaType(name = "string")
    protected CardPersonalizationLocationTypeCodeType cardPersonalizationLocationType;
    @XmlElement(name = "NewBiometricCaptureRequired")
    protected boolean newBiometricCaptureRequired;

    /**
     * Gets the value of the transactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHeaderType }
     *     
     */
    public TransactionHeaderType getTransactionHeader() {
        return transactionHeader;
    }

    /**
     * Sets the value of the transactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHeaderType }
     *     
     */
    public void setTransactionHeader(TransactionHeaderType value) {
        this.transactionHeader = value;
    }

    /**
     * Gets the value of the cardHolderPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderPI() {
        return cardHolderPI;
    }

    /**
     * Sets the value of the cardHolderPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderPI(String value) {
        this.cardHolderPI = value;
    }

    /**
     * Gets the value of the cardReissueReason property.
     * 
     * @return
     *     possible object is
     *     {@link CardReissueReasonCodeType }
     *     
     */
    public CardReissueReasonCodeType getCardReissueReason() {
        return cardReissueReason;
    }

    /**
     * Sets the value of the cardReissueReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardReissueReasonCodeType }
     *     
     */
    public void setCardReissueReason(CardReissueReasonCodeType value) {
        this.cardReissueReason = value;
    }

    /**
     * Gets the value of the cardPersonalizationLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link CardPersonalizationLocationTypeCodeType }
     *     
     */
    public CardPersonalizationLocationTypeCodeType getCardPersonalizationLocationType() {
        return cardPersonalizationLocationType;
    }

    /**
     * Sets the value of the cardPersonalizationLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPersonalizationLocationTypeCodeType }
     *     
     */
    public void setCardPersonalizationLocationType(CardPersonalizationLocationTypeCodeType value) {
        this.cardPersonalizationLocationType = value;
    }

    /**
     * Gets the value of the newBiometricCaptureRequired property.
     * 
     */
    public boolean isNewBiometricCaptureRequired() {
        return newBiometricCaptureRequired;
    }

    /**
     * Sets the value of the newBiometricCaptureRequired property.
     * 
     */
    public void setNewBiometricCaptureRequired(boolean value) {
        this.newBiometricCaptureRequired = value;
    }

}