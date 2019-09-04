package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseResolutionRequestInputModelCaseResolutionInstanceRecord;
import org.bian.dto.BQCaseResolutionRequestInputModelFraudResolutionInstanceRecord;
import org.bian.dto.BQCaseResolutionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQCaseResolutionRequestInputModel
 */
public class BQCaseResolutionRequestInputModel   {
  private BQCaseResolutionRequestInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private String fraudResolutionProcedureInstanceReference = null;

  private String caseResolutionInstanceReference = null;

  private BQCaseResolutionRequestInputModelCaseResolutionInstanceRecord caseResolutionInstanceRecord = null;

  private Object caseResolutionRequestActionTaskRecord = null;

  private BQCaseResolutionRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public BQCaseResolutionRequestInputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(BQCaseResolutionRequestInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Fraud Resolution Procedure instance 
   * @return fraudResolutionProcedureInstanceReference
  **/

  public String getFraudResolutionProcedureInstanceReference() {
    return fraudResolutionProcedureInstanceReference;
  }

  public void setFraudResolutionProcedureInstanceReference(String fraudResolutionProcedureInstanceReference) {
    this.fraudResolutionProcedureInstanceReference = fraudResolutionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Case Resolution instance 
   * @return caseResolutionInstanceReference
  **/

  public String getCaseResolutionInstanceReference() {
    return caseResolutionInstanceReference;
  }

  public void setCaseResolutionInstanceReference(String caseResolutionInstanceReference) {
    this.caseResolutionInstanceReference = caseResolutionInstanceReference;
  }


  /**
   * Get caseResolutionInstanceRecord
   * @return caseResolutionInstanceRecord
  **/

  public BQCaseResolutionRequestInputModelCaseResolutionInstanceRecord getCaseResolutionInstanceRecord() {
    return caseResolutionInstanceRecord;
  }

  public void setCaseResolutionInstanceRecord(BQCaseResolutionRequestInputModelCaseResolutionInstanceRecord caseResolutionInstanceRecord) {
    this.caseResolutionInstanceRecord = caseResolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return caseResolutionRequestActionTaskRecord
  **/

  public Object getCaseResolutionRequestActionTaskRecord() {
    return caseResolutionRequestActionTaskRecord;
  }

  public void setCaseResolutionRequestActionTaskRecord(Object caseResolutionRequestActionTaskRecord) {
    this.caseResolutionRequestActionTaskRecord = caseResolutionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQCaseResolutionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQCaseResolutionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

