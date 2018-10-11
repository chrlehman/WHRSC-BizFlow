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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="PIVTerminationReason" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PIVTerminationReasonCodeType"/&gt;
 *         &lt;element name="SuspendCardUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "pivTerminationReason",
    "suspendCardUntil"
})
@XmlRootElement(name = "PIVTerminationRequest")
public class PIVTerminationRequest {

    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "CardHolderPI", required = true)
    protected String cardHolderPI;
    @XmlElement(name = "PIVTerminationReason", required = true)
    @XmlSchemaType(name = "string")
    protected PIVTerminationReasonCodeType pivTerminationReason;
    @XmlElement(name = "SuspendCardUntil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspendCardUntil;

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
     * Gets the value of the pivTerminationReason property.
     * 
     * @return
     *     possible object is
     *     {@link PIVTerminationReasonCodeType }
     *     
     */
    public PIVTerminationReasonCodeType getPIVTerminationReason() {
        return pivTerminationReason;
    }

    /**
     * Sets the value of the pivTerminationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIVTerminationReasonCodeType }
     *     
     */
    public void setPIVTerminationReason(PIVTerminationReasonCodeType value) {
        this.pivTerminationReason = value;
    }

    /**
     * Gets the value of the suspendCardUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendCardUntil() {
        return suspendCardUntil;
    }

    /**
     * Sets the value of the suspendCardUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendCardUntil(XMLGregorianCalendar value) {
        this.suspendCardUntil = value;
    }

}
