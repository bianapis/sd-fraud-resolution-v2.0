package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceRecord
 */
public class CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceRecord   {
  private String fraudCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String merchantReference = null;

  private String interstedPartyReference = null;

  private String contactReference = null;

  private String transactionReference = null;

  private Object transactionRecord = null;

  private String caseLocation = null;

  private String date = null;

  private String employeeBusinessUnitReference = null;

  private String fraudCaseWorkProducts = null;

  private String fraudCaseResolutionSchedule = null;

  private String fraudCaseStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Type of case (e.g. disputed charge, merchant fraud, stolen/fake device) 
   * @return fraudCaseType
  **/

  public String getFraudCaseType() {
    return fraudCaseType;
  }

  public void setFraudCaseType(String fraudCaseType) {
    this.fraudCaseType = fraudCaseType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the product/service associated with case 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer associated with case if applicable 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the merchant associated with case if applicable 
   * @return merchantReference
  **/

  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any other interested parties (such as intermediaries) 
   * @return interstedPartyReference
  **/

  public String getInterstedPartyReference() {
    return interstedPartyReference;
  }

  public void setInterstedPartyReference(String interstedPartyReference) {
    this.interstedPartyReference = interstedPartyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Customer contact reference if the case was raised during a customer contact 
   * @return contactReference
  **/

  public String getContactReference() {
    return contactReference;
  }

  public void setContactReference(String contactReference) {
    this.contactReference = contactReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to one or more product transactions associated with the case 
   * @return transactionReference
  **/

  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Record contains all details of the transaction (not itemized) 
   * @return transactionRecord
  **/

  public Object getTransactionRecord() {
    return transactionRecord;
  }

  public void setTransactionRecord(Object transactionRecord) {
    this.transactionRecord = transactionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of a physical address or electronic venue the fraud was detected 
   * @return caseLocation
  **/

  public String getCaseLocation() {
    return caseLocation;
  }

  public void setCaseLocation(String caseLocation) {
    this.caseLocation = caseLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Specific dates and ties of significance to the case 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit and or employee reference where the case was raised 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the case 
   * @return fraudCaseWorkProducts
  **/

  public String getFraudCaseWorkProducts() {
    return fraudCaseWorkProducts;
  }

  public void setFraudCaseWorkProducts(String fraudCaseWorkProducts) {
    this.fraudCaseWorkProducts = fraudCaseWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target and actual dates for case processing/resolution 
   * @return fraudCaseResolutionSchedule
  **/

  public String getFraudCaseResolutionSchedule() {
    return fraudCaseResolutionSchedule;
  }

  public void setFraudCaseResolutionSchedule(String fraudCaseResolutionSchedule) {
    this.fraudCaseResolutionSchedule = fraudCaseResolutionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing status for the case 
   * @return fraudCaseStatus
  **/

  public String getFraudCaseStatus() {
    return fraudCaseStatus;
  }

  public void setFraudCaseStatus(String fraudCaseStatus) {
    this.fraudCaseStatus = fraudCaseStatus;
  }


}

