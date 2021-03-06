//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

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
 *         &lt;element name="CardBarCodeData" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PackageTrackingID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardReceivedLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardHandlerPI" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "cardBarCodeData",
    "packageTrackingID",
    "cardReceivedLocation",
    "cardHandlerPI",
    "startDate",
    "endDate"
})
@XmlRootElement(name = "GetCardTrackingHistoryRequest")
public class GetCardTrackingHistoryRequest {

    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "CardBarCodeData")
    protected String cardBarCodeData;
    @XmlElement(name = "PackageTrackingID")
    protected String packageTrackingID;
    @XmlElement(name = "CardReceivedLocation")
    protected String cardReceivedLocation;
    @XmlElement(name = "CardHandlerPI")
    protected String cardHandlerPI;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

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
     * Gets the value of the cardBarCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBarCodeData() {
        return cardBarCodeData;
    }

    /**
     * Sets the value of the cardBarCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBarCodeData(String value) {
        this.cardBarCodeData = value;
    }

    /**
     * Gets the value of the packageTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingID() {
        return packageTrackingID;
    }

    /**
     * Sets the value of the packageTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingID(String value) {
        this.packageTrackingID = value;
    }

    /**
     * Gets the value of the cardReceivedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardReceivedLocation() {
        return cardReceivedLocation;
    }

    /**
     * Sets the value of the cardReceivedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardReceivedLocation(String value) {
        this.cardReceivedLocation = value;
    }

    /**
     * Gets the value of the cardHandlerPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHandlerPI() {
        return cardHandlerPI;
    }

    /**
     * Sets the value of the cardHandlerPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHandlerPI(String value) {
        this.cardHandlerPI = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
