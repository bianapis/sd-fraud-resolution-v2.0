package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceRecord
 */
public class BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceRecord   {
  private Object fraudCaseResolutionRecord = null;

  private String employeeBusinessUnitReference = null;

  private String correspondenceReference = null;

  private String adjustmentChargebackReference = null;

  private String consortiaReportingInstanceReference = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String paymentOrderReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Record sets out, defines and assigns resolution tasks 
   * @return fraudCaseResolutionRecord
  **/

  public Object getFraudCaseResolutionRecord() {
    return fraudCaseResolutionRecord;
  }

  public void setFraudCaseResolutionRecord(Object fraudCaseResolutionRecord) {
    this.fraudCaseResolutionRecord = fraudCaseResolutionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employee and or business unit responsible for the resolution 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to all correspondence (e.g. confirmation messages sent to involved parties, includes internal and external legal/law enforcement authorities) 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any associated adjustment or chargeback transaction initiated by the resolution 
   * @return adjustmentChargebackReference
  **/

  public String getAdjustmentChargebackReference() {
    return adjustmentChargebackReference;
  }

  public void setAdjustmentChargebackReference(String adjustmentChargebackReference) {
    this.adjustmentChargebackReference = adjustmentChargebackReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the consortia notification transaction for fraud resultion activity 
   * @return consortiaReportingInstanceReference
  **/

  public String getConsortiaReportingInstanceReference() {
    return consortiaReportingInstanceReference;
  }

  public void setConsortiaReportingInstanceReference(String consortiaReportingInstanceReference) {
    this.consortiaReportingInstanceReference = consortiaReportingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any financial adjustments that are made during the case 
   * @return paymentOrderReference
  **/

  public String getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(String paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }


}

