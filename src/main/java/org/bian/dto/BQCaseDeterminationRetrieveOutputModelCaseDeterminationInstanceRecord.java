package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceRecord
 */
public class BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceRecord   {
  private String customerAgreementReference = null;

  private String customerAgreement = null;

  private String merchantAgreementReference = null;

  private String merchantAgreement = null;

  private String interestedPartyAgreementReference = null;

  private String interestedPartyAgreement = null;

  private Object fraudCaseDeterminationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the involved customer's agreement 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Customer agreement accessed to determine constraints on resolution approach 
   * @return customerAgreement
  **/

  public String getCustomerAgreement() {
    return customerAgreement;
  }

  public void setCustomerAgreement(String customerAgreement) {
    this.customerAgreement = customerAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the involved merchant's agreement 
   * @return merchantAgreementReference
  **/

  public String getMerchantAgreementReference() {
    return merchantAgreementReference;
  }

  public void setMerchantAgreementReference(String merchantAgreementReference) {
    this.merchantAgreementReference = merchantAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Merchant agreement accessed to determine constraints on resolution approach 
   * @return merchantAgreement
  **/

  public String getMerchantAgreement() {
    return merchantAgreement;
  }

  public void setMerchantAgreement(String merchantAgreement) {
    this.merchantAgreement = merchantAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the interested party's agreement 
   * @return interestedPartyAgreementReference
  **/

  public String getInterestedPartyAgreementReference() {
    return interestedPartyAgreementReference;
  }

  public void setInterestedPartyAgreementReference(String interestedPartyAgreementReference) {
    this.interestedPartyAgreementReference = interestedPartyAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Interested party agreement accessed to determine constraints on resolution approach 
   * @return interestedPartyAgreement
  **/

  public String getInterestedPartyAgreement() {
    return interestedPartyAgreement;
  }

  public void setInterestedPartyAgreement(String interestedPartyAgreement) {
    this.interestedPartyAgreement = interestedPartyAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Record of rules and guidelines applied to determine fraud case resolution 
   * @return fraudCaseDeterminationRecord
  **/

  public Object getFraudCaseDeterminationRecord() {
    return fraudCaseDeterminationRecord;
  }

  public void setFraudCaseDeterminationRecord(Object fraudCaseDeterminationRecord) {
    this.fraudCaseDeterminationRecord = fraudCaseDeterminationRecord;
  }


}

