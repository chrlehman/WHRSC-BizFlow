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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines information associated with a 
 * 				federal organizational code.  This is the 4 character
 * 				alphanumeric code assigned to government departments, agencies
 * 				and quasi government entities.
 * 			
 * 
 * <p>Java class for FederalOrgInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FederalOrgInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FederalOrganizationCode" type="{http://hspd12.hhs.gov/piv/binding/v1}FederalOrganizationCodeType"/&gt;
 *         &lt;element name="FederalOrganizationType" type="{http://hspd12.hhs.gov/piv/binding/v1}FederalOrganizationTypeType"/&gt;
 *         &lt;element name="DepartmentName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DepartmentAcronym" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AgencyName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AgencyAcronym" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CanIssueCards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanBindPivCards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FederalOrgInfoType", namespace = "http://hspd12.hhs.gov/piv/binding/v1", propOrder = {
    "federalOrganizationCode",
    "federalOrganizationType",
    "departmentName",
    "departmentAcronym",
    "agencyName",
    "agencyAcronym",
    "canIssueCards",
    "canBindPivCards"
})
public class FederalOrgInfoType {

    @XmlElement(name = "FederalOrganizationCode", required = true)
    protected String federalOrganizationCode;
    @XmlElement(name = "FederalOrganizationType", required = true)
    @XmlSchemaType(name = "string")
    protected FederalOrganizationTypeType federalOrganizationType;
    @XmlElement(name = "DepartmentName")
    protected String departmentName;
    @XmlElement(name = "DepartmentAcronym")
    protected String departmentAcronym;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "AgencyAcronym")
    protected String agencyAcronym;
    @XmlElement(name = "CanIssueCards")
    protected Boolean canIssueCards;
    @XmlElement(name = "CanBindPivCards")
    protected Boolean canBindPivCards;

    /**
     * Gets the value of the federalOrganizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalOrganizationCode() {
        return federalOrganizationCode;
    }

    /**
     * Sets the value of the federalOrganizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalOrganizationCode(String value) {
        this.federalOrganizationCode = value;
    }

    /**
     * Gets the value of the federalOrganizationType property.
     * 
     * @return
     *     possible object is
     *     {@link FederalOrganizationTypeType }
     *     
     */
    public FederalOrganizationTypeType getFederalOrganizationType() {
        return federalOrganizationType;
    }

    /**
     * Sets the value of the federalOrganizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FederalOrganizationTypeType }
     *     
     */
    public void setFederalOrganizationType(FederalOrganizationTypeType value) {
        this.federalOrganizationType = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the departmentAcronym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentAcronym() {
        return departmentAcronym;
    }

    /**
     * Sets the value of the departmentAcronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentAcronym(String value) {
        this.departmentAcronym = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the agencyAcronym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyAcronym() {
        return agencyAcronym;
    }

    /**
     * Sets the value of the agencyAcronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyAcronym(String value) {
        this.agencyAcronym = value;
    }

    /**
     * Gets the value of the canIssueCards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanIssueCards() {
        return canIssueCards;
    }

    /**
     * Sets the value of the canIssueCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanIssueCards(Boolean value) {
        this.canIssueCards = value;
    }

    /**
     * Gets the value of the canBindPivCards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBindPivCards() {
        return canBindPivCards;
    }

    /**
     * Sets the value of the canBindPivCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBindPivCards(Boolean value) {
        this.canBindPivCards = value;
    }

}