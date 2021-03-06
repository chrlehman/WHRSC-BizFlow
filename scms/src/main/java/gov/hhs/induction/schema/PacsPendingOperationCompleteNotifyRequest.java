//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="PersonIds" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsPersonIdentifiersType"/&gt;
 *         &lt;element name="OperationResult" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsPendingOperationResultType" maxOccurs="unbounded"/&gt;
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
    "personIds",
    "operationResult"
})
@XmlRootElement(name = "PacsPendingOperationCompleteNotifyRequest")
public class PacsPendingOperationCompleteNotifyRequest {

    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "PersonIds", required = true)
    protected PacsPersonIdentifiersType personIds;
    @XmlElement(name = "OperationResult", required = true)
    protected List<PacsPendingOperationResultType> operationResult;

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
     * Gets the value of the personIds property.
     * 
     * @return
     *     possible object is
     *     {@link PacsPersonIdentifiersType }
     *     
     */
    public PacsPersonIdentifiersType getPersonIds() {
        return personIds;
    }

    /**
     * Sets the value of the personIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsPersonIdentifiersType }
     *     
     */
    public void setPersonIds(PacsPersonIdentifiersType value) {
        this.personIds = value;
    }

    /**
     * Gets the value of the operationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PacsPendingOperationResultType }
     * 
     * 
     */
    public List<PacsPendingOperationResultType> getOperationResult() {
        if (operationResult == null) {
            operationResult = new ArrayList<PacsPendingOperationResultType>();
        }
        return this.operationResult;
    }

}
