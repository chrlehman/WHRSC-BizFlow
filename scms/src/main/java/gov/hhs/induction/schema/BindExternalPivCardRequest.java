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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="ApplicantPI" type="{http://hspd12.hhs.gov/piv/binding/v1}PersonIdType"/&gt;
 *         &lt;element name="SubmitterPI" type="{http://hspd12.hhs.gov/piv/binding/v1}PersonIdType"/&gt;
 *         &lt;element name="EwsResourceTag" type="{http://hspd12.hhs.gov/piv/binding/v1}ResourceTagType"/&gt;
 *         &lt;element name="EwsSiteTag" type="{http://hspd12.hhs.gov/piv/binding/v1}SiteTagType"/&gt;
 *         &lt;element name="CardCIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardATR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;maxLength value="33"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardIIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardCapabilityContainer" type="{http://hspd12.hhs.gov/piv/binding/v1}PivModelCardCapabilityType"/&gt;
 *         &lt;element name="CardHolderUniqueId" type="{http://hspd12.hhs.gov/piv/binding/v1}PivModelCardHolderUniqueIdType"/&gt;
 *         &lt;element name="CardPrintedInfo" type="{http://hspd12.hhs.gov/piv/binding/v1}PivModelCardPrintedInformationType" minOccurs="0"/&gt;
 *         &lt;element name="CardHolderFingerprintsCbeff" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="CardHolderFacialImageCbeff" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="PivAuthenticationCertDer" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="PivDigitalSignatureCertDer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="PivKeyManagementCertDer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="PivCardAuthenticationCertDer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "applicantPI",
    "submitterPI",
    "ewsResourceTag",
    "ewsSiteTag",
    "cardCIN",
    "cardATR",
    "cardIIN",
    "cardCapabilityContainer",
    "cardHolderUniqueId",
    "cardPrintedInfo",
    "cardHolderFingerprintsCbeff",
    "cardHolderFacialImageCbeff",
    "pivAuthenticationCertDer",
    "pivDigitalSignatureCertDer",
    "pivKeyManagementCertDer",
    "pivCardAuthenticationCertDer"
})
@XmlRootElement(name = "BindExternalPivCardRequest", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
public class BindExternalPivCardRequest {

    @XmlElement(name = "ApplicantPI", namespace = "http://hspd12.hhs.gov/piv/binding/v1", required = true)
    protected String applicantPI;
    @XmlElement(name = "SubmitterPI", namespace = "http://hspd12.hhs.gov/piv/binding/v1", required = true)
    protected String submitterPI;
    @XmlElement(name = "EwsResourceTag", namespace = "http://hspd12.hhs.gov/piv/binding/v1", required = true)
    protected String ewsResourceTag;
    @XmlElement(name = "EwsSiteTag", namespace = "http://hspd12.hhs.gov/piv/binding/v1", required = true)
    protected String ewsSiteTag;
    @XmlElement(name = "CardCIN", namespace = "http://hspd12.hhs.gov/piv/binding/v1", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] cardCIN;
    @XmlElement(name = "CardATR", namespace = "http://hspd12.hhs.gov/piv/binding/v1", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] cardATR;
    @XmlElement(name = "CardIIN", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected String cardIIN;
    @XmlElement(name = "CardCapabilityContainer", namespace = "http://hspd12.hhs.gov/piv/binding/v1", required = true)
    protected PivModelCardCapabilityType cardCapabilityContainer;
    @XmlElement(name = "CardHolderUniqueId", namespace = "http://hspd12.hhs.gov/piv/binding/v1", required = true)
    protected PivModelCardHolderUniqueIdType cardHolderUniqueId;
    @XmlElement(name = "CardPrintedInfo", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected PivModelCardPrintedInformationType cardPrintedInfo;
    @XmlElement(name = "CardHolderFingerprintsCbeff", namespace = "http://hspd12.hhs.gov/piv/binding/v1", required = true)
    protected byte[] cardHolderFingerprintsCbeff;
    @XmlElement(name = "CardHolderFacialImageCbeff", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected byte[] cardHolderFacialImageCbeff;
    @XmlElement(name = "PivAuthenticationCertDer", namespace = "http://hspd12.hhs.gov/piv/binding/v1", required = true)
    protected byte[] pivAuthenticationCertDer;
    @XmlElement(name = "PivDigitalSignatureCertDer", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected byte[] pivDigitalSignatureCertDer;
    @XmlElement(name = "PivKeyManagementCertDer", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected byte[] pivKeyManagementCertDer;
    @XmlElement(name = "PivCardAuthenticationCertDer", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected byte[] pivCardAuthenticationCertDer;

    /**
     * Gets the value of the applicantPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantPI() {
        return applicantPI;
    }

    /**
     * Sets the value of the applicantPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantPI(String value) {
        this.applicantPI = value;
    }

    /**
     * Gets the value of the submitterPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitterPI() {
        return submitterPI;
    }

    /**
     * Sets the value of the submitterPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitterPI(String value) {
        this.submitterPI = value;
    }

    /**
     * Gets the value of the ewsResourceTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEwsResourceTag() {
        return ewsResourceTag;
    }

    /**
     * Sets the value of the ewsResourceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEwsResourceTag(String value) {
        this.ewsResourceTag = value;
    }

    /**
     * Gets the value of the ewsSiteTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEwsSiteTag() {
        return ewsSiteTag;
    }

    /**
     * Sets the value of the ewsSiteTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEwsSiteTag(String value) {
        this.ewsSiteTag = value;
    }

    /**
     * Gets the value of the cardCIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCardCIN() {
        return cardCIN;
    }

    /**
     * Sets the value of the cardCIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCIN(byte[] value) {
        this.cardCIN = value;
    }

    /**
     * Gets the value of the cardATR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCardATR() {
        return cardATR;
    }

    /**
     * Sets the value of the cardATR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardATR(byte[] value) {
        this.cardATR = value;
    }

    /**
     * Gets the value of the cardIIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIIN() {
        return cardIIN;
    }

    /**
     * Sets the value of the cardIIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIIN(String value) {
        this.cardIIN = value;
    }

    /**
     * Gets the value of the cardCapabilityContainer property.
     * 
     * @return
     *     possible object is
     *     {@link PivModelCardCapabilityType }
     *     
     */
    public PivModelCardCapabilityType getCardCapabilityContainer() {
        return cardCapabilityContainer;
    }

    /**
     * Sets the value of the cardCapabilityContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PivModelCardCapabilityType }
     *     
     */
    public void setCardCapabilityContainer(PivModelCardCapabilityType value) {
        this.cardCapabilityContainer = value;
    }

    /**
     * Gets the value of the cardHolderUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link PivModelCardHolderUniqueIdType }
     *     
     */
    public PivModelCardHolderUniqueIdType getCardHolderUniqueId() {
        return cardHolderUniqueId;
    }

    /**
     * Sets the value of the cardHolderUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PivModelCardHolderUniqueIdType }
     *     
     */
    public void setCardHolderUniqueId(PivModelCardHolderUniqueIdType value) {
        this.cardHolderUniqueId = value;
    }

    /**
     * Gets the value of the cardPrintedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PivModelCardPrintedInformationType }
     *     
     */
    public PivModelCardPrintedInformationType getCardPrintedInfo() {
        return cardPrintedInfo;
    }

    /**
     * Sets the value of the cardPrintedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PivModelCardPrintedInformationType }
     *     
     */
    public void setCardPrintedInfo(PivModelCardPrintedInformationType value) {
        this.cardPrintedInfo = value;
    }

    /**
     * Gets the value of the cardHolderFingerprintsCbeff property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardHolderFingerprintsCbeff() {
        return cardHolderFingerprintsCbeff;
    }

    /**
     * Sets the value of the cardHolderFingerprintsCbeff property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCardHolderFingerprintsCbeff(byte[] value) {
        this.cardHolderFingerprintsCbeff = value;
    }

    /**
     * Gets the value of the cardHolderFacialImageCbeff property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardHolderFacialImageCbeff() {
        return cardHolderFacialImageCbeff;
    }

    /**
     * Sets the value of the cardHolderFacialImageCbeff property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCardHolderFacialImageCbeff(byte[] value) {
        this.cardHolderFacialImageCbeff = value;
    }

    /**
     * Gets the value of the pivAuthenticationCertDer property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPivAuthenticationCertDer() {
        return pivAuthenticationCertDer;
    }

    /**
     * Sets the value of the pivAuthenticationCertDer property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPivAuthenticationCertDer(byte[] value) {
        this.pivAuthenticationCertDer = value;
    }

    /**
     * Gets the value of the pivDigitalSignatureCertDer property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPivDigitalSignatureCertDer() {
        return pivDigitalSignatureCertDer;
    }

    /**
     * Sets the value of the pivDigitalSignatureCertDer property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPivDigitalSignatureCertDer(byte[] value) {
        this.pivDigitalSignatureCertDer = value;
    }

    /**
     * Gets the value of the pivKeyManagementCertDer property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPivKeyManagementCertDer() {
        return pivKeyManagementCertDer;
    }

    /**
     * Sets the value of the pivKeyManagementCertDer property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPivKeyManagementCertDer(byte[] value) {
        this.pivKeyManagementCertDer = value;
    }

    /**
     * Gets the value of the pivCardAuthenticationCertDer property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPivCardAuthenticationCertDer() {
        return pivCardAuthenticationCertDer;
    }

    /**
     * Sets the value of the pivCardAuthenticationCertDer property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPivCardAuthenticationCertDer(byte[] value) {
        this.pivCardAuthenticationCertDer = value;
    }

}
