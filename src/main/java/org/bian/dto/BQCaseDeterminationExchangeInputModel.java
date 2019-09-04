package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionProcedureExchangeInputModelFraudResolutionProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationExchangeInputModel
 */
public class BQCaseDeterminationExchangeInputModel   {
  private String fraudResolutionProcedureInstanceReference = null;

  private String caseDeterminationInstanceReference = null;

  private Object caseDeterminationExchangeActionTaskRecord = null;

  private CRFraudResolutionProcedureExchangeInputModelFraudResolutionProcedureExchangeActionRequest caseDeterminationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Case Determination instance 
   * @return caseDeterminationInstanceReference
  **/

  public String getCaseDeterminationInstanceReference() {
    return caseDeterminationInstanceReference;
  }

  public void setCaseDeterminationInstanceReference(String caseDeterminationInstanceReference) {
    this.caseDeterminationInstanceReference = caseDeterminationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return caseDeterminationExchangeActionTaskRecord
  **/

  public Object getCaseDeterminationExchangeActionTaskRecord() {
    return caseDeterminationExchangeActionTaskRecord;
  }

  public void setCaseDeterminationExchangeActionTaskRecord(Object caseDeterminationExchangeActionTaskRecord) {
    this.caseDeterminationExchangeActionTaskRecord = caseDeterminationExchangeActionTaskRecord;
  }


  /**
   * Get caseDeterminationExchangeActionRequest
   * @return caseDeterminationExchangeActionRequest
  **/

  public CRFraudResolutionProcedureExchangeInputModelFraudResolutionProcedureExchangeActionRequest getCaseDeterminationExchangeActionRequest() {
    return caseDeterminationExchangeActionRequest;
  }

  public void setCaseDeterminationExchangeActionRequest(CRFraudResolutionProcedureExchangeInputModelFraudResolutionProcedureExchangeActionRequest caseDeterminationExchangeActionRequest) {
    this.caseDeterminationExchangeActionRequest = caseDeterminationExchangeActionRequest;
  }


}

