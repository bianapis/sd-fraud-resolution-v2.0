package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseResolutionRequestOutputModel
 */
public class BQCaseResolutionRequestOutputModel   {
  private String caseResolutionRequestActionTaskReference = null;

  private Object caseResolutionRequestActionTaskRecord = null;

  private String caseResolutionRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Case Resolution instance request service call 
   * @return caseResolutionRequestActionTaskReference
  **/

  public String getCaseResolutionRequestActionTaskReference() {
    return caseResolutionRequestActionTaskReference;
  }

  public void setCaseResolutionRequestActionTaskReference(String caseResolutionRequestActionTaskReference) {
    this.caseResolutionRequestActionTaskReference = caseResolutionRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Case Resolution service request record 
   * @return caseResolutionRequestRecordReference
  **/

  public String getCaseResolutionRequestRecordReference() {
    return caseResolutionRequestRecordReference;
  }

  public void setCaseResolutionRequestRecordReference(String caseResolutionRequestRecordReference) {
    this.caseResolutionRequestRecordReference = caseResolutionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

