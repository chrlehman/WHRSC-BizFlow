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
 *         		This Type defines the data elements describing the results for 
 *         		an attempt to compare the field values for two applicants.  Typically
 *         		one of the Applicants will be on the IDMS and the other Applicant
 *         		will be on a remote system.
 *         	
 * 
 * <p>Java class for ApplicantFieldDifferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicantFieldDifferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldDifference" type="{http://hspd12.hhs.gov/federated/enrollment/v1}SyncApplicantDataFieldsEnumType"/&gt;
 *         &lt;element name="IdmsFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompareFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantFieldDifferenceType", propOrder = {
    "fieldDifference",
    "idmsFieldValue",
    "compareFieldValue"
})
public class ApplicantFieldDifferenceType {

    @XmlElement(name = "FieldDifference", required = true)
    @XmlSchemaType(name = "string")
    protected SyncApplicantDataFieldsEnumType fieldDifference;
    @XmlElement(name = "IdmsFieldValue")
    protected String idmsFieldValue;
    @XmlElement(name = "CompareFieldValue")
    protected String compareFieldValue;

    /**
     * Gets the value of the fieldDifference property.
     * 
     * @return
     *     possible object is
     *     {@link SyncApplicantDataFieldsEnumType }
     *     
     */
    public SyncApplicantDataFieldsEnumType getFieldDifference() {
        return fieldDifference;
    }

    /**
     * Sets the value of the fieldDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncApplicantDataFieldsEnumType }
     *     
     */
    public void setFieldDifference(SyncApplicantDataFieldsEnumType value) {
        this.fieldDifference = value;
    }

    /**
     * Gets the value of the idmsFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdmsFieldValue() {
        return idmsFieldValue;
    }

    /**
     * Sets the value of the idmsFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdmsFieldValue(String value) {
        this.idmsFieldValue = value;
    }

    /**
     * Gets the value of the compareFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompareFieldValue() {
        return compareFieldValue;
    }

    /**
     * Sets the value of the compareFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompareFieldValue(String value) {
        this.compareFieldValue = value;
    }

}