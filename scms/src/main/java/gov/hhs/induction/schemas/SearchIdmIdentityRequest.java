//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.03 at 10:07:04 PM EDT 
//


package gov.hhs.induction.schemas;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="SearchHHSID" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="SearchUPN" type="{http://hspd12.hhs.gov/federated/enrollment/v1}UPNType" minOccurs="0"/&gt;
 *         &lt;element name="SearchPrimaryEmailAddress" type="{http://hspd12.hhs.gov/federated/enrollment/v1}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="SearchAlternateEmailAddress" type="{http://hspd12.hhs.gov/federated/enrollment/v1}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="SearchOpdivLegacyID" type="{http://hspd12.hhs.gov/federated/enrollment/v1}OpdivEmployeeIDType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnIdmField" type="{http://hspd12.hhs.gov/federated/idm/idmsInterface/v1}IdmDataFieldsEnumType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "searchHHSID",
    "searchUPN",
    "searchPrimaryEmailAddress",
    "searchAlternateEmailAddress",
    "searchOpdivLegacyID",
    "returnIdmField"
})
@XmlRootElement(name = "SearchIdmIdentityRequest", namespace = "http://hspd12.hhs.gov/federated/idm/idmsInterface/v1")
public class SearchIdmIdentityRequest {

    @XmlElement(name = "TransactionHeader", namespace = "http://hspd12.hhs.gov/federated/idm/idmsInterface/v1", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "SearchHHSID", namespace = "http://hspd12.hhs.gov/federated/idm/idmsInterface/v1")
    protected String searchHHSID;
    @XmlElement(name = "SearchUPN", namespace = "http://hspd12.hhs.gov/federated/idm/idmsInterface/v1")
    protected String searchUPN;
    @XmlElement(name = "SearchPrimaryEmailAddress", namespace = "http://hspd12.hhs.gov/federated/idm/idmsInterface/v1")
    protected String searchPrimaryEmailAddress;
    @XmlElement(name = "SearchAlternateEmailAddress", namespace = "http://hspd12.hhs.gov/federated/idm/idmsInterface/v1")
    protected String searchAlternateEmailAddress;
    @XmlElement(name = "SearchOpdivLegacyID", namespace = "http://hspd12.hhs.gov/federated/idm/idmsInterface/v1")
    protected String searchOpdivLegacyID;
    @XmlElement(name = "ReturnIdmField", namespace = "http://hspd12.hhs.gov/federated/idm/idmsInterface/v1")
    @XmlSchemaType(name = "string")
    protected List<IdmDataFieldsEnumType> returnIdmField;

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
     * Gets the value of the searchHHSID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchHHSID() {
        return searchHHSID;
    }

    /**
     * Sets the value of the searchHHSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchHHSID(String value) {
        this.searchHHSID = value;
    }

    /**
     * Gets the value of the searchUPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchUPN() {
        return searchUPN;
    }

    /**
     * Sets the value of the searchUPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchUPN(String value) {
        this.searchUPN = value;
    }

    /**
     * Gets the value of the searchPrimaryEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchPrimaryEmailAddress() {
        return searchPrimaryEmailAddress;
    }

    /**
     * Sets the value of the searchPrimaryEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchPrimaryEmailAddress(String value) {
        this.searchPrimaryEmailAddress = value;
    }

    /**
     * Gets the value of the searchAlternateEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchAlternateEmailAddress() {
        return searchAlternateEmailAddress;
    }

    /**
     * Sets the value of the searchAlternateEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchAlternateEmailAddress(String value) {
        this.searchAlternateEmailAddress = value;
    }

    /**
     * Gets the value of the searchOpdivLegacyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchOpdivLegacyID() {
        return searchOpdivLegacyID;
    }

    /**
     * Sets the value of the searchOpdivLegacyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchOpdivLegacyID(String value) {
        this.searchOpdivLegacyID = value;
    }

    /**
     * Gets the value of the returnIdmField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnIdmField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnIdmField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdmDataFieldsEnumType }
     * 
     * 
     */
    public List<IdmDataFieldsEnumType> getReturnIdmField() {
        if (returnIdmField == null) {
            returnIdmField = new ArrayList<IdmDataFieldsEnumType>();
        }
        return this.returnIdmField;
    }

}
