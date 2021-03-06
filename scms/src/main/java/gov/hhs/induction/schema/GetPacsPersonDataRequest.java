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
 *         &lt;element name="SearchPersonIds" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsPersonIdentifiersType"/&gt;
 *         &lt;element name="WantPersonInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WantCardInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "searchPersonIds",
    "wantPersonInfo",
    "wantCardInfo"
})
@XmlRootElement(name = "GetPacsPersonDataRequest")
public class GetPacsPersonDataRequest {

    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "SearchPersonIds", required = true)
    protected PacsPersonIdentifiersType searchPersonIds;
    @XmlElement(name = "WantPersonInfo", defaultValue = "false")
    protected Boolean wantPersonInfo;
    @XmlElement(name = "WantCardInfo", defaultValue = "false")
    protected Boolean wantCardInfo;

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
     * Gets the value of the searchPersonIds property.
     * 
     * @return
     *     possible object is
     *     {@link PacsPersonIdentifiersType }
     *     
     */
    public PacsPersonIdentifiersType getSearchPersonIds() {
        return searchPersonIds;
    }

    /**
     * Sets the value of the searchPersonIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsPersonIdentifiersType }
     *     
     */
    public void setSearchPersonIds(PacsPersonIdentifiersType value) {
        this.searchPersonIds = value;
    }

    /**
     * Gets the value of the wantPersonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantPersonInfo() {
        return wantPersonInfo;
    }

    /**
     * Sets the value of the wantPersonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantPersonInfo(Boolean value) {
        this.wantPersonInfo = value;
    }

    /**
     * Gets the value of the wantCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantCardInfo() {
        return wantCardInfo;
    }

    /**
     * Sets the value of the wantCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantCardInfo(Boolean value) {
        this.wantCardInfo = value;
    }

}
