package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureExchangeOutputModel
 */
public class CRFraudResolutionProcedureExchangeOutputModel   {
  private String fraudResolutionProcedureExchangeActionTaskReference = null;

  private Object fraudResolutionProcedureExchangeActionTaskRecord = null;

  private String fraudResolutionProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Resolution Procedure instance exchange service call 
   * @return fraudResolutionProcedureExchangeActionTaskReference
  **/

  public String getFraudResolutionProcedureExchangeActionTaskReference() {
    return fraudResolutionProcedureExchangeActionTaskReference;
  }

  public void setFraudResolutionProcedureExchangeActionTaskReference(String fraudResolutionProcedureExchangeActionTaskReference) {
    this.fraudResolutionProcedureExchangeActionTaskReference = fraudResolutionProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return fraudResolutionProcedureExchangeActionTaskRecord
  **/

  public Object getFraudResolutionProcedureExchangeActionTaskRecord() {
    return fraudResolutionProcedureExchangeActionTaskRecord;
  }

  public void setFraudResolutionProcedureExchangeActionTaskRecord(Object fraudResolutionProcedureExchangeActionTaskRecord) {
    this.fraudResolutionProcedureExchangeActionTaskRecord = fraudResolutionProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return fraudResolutionProcedureExchangeActionResponse
  **/

  public String getFraudResolutionProcedureExchangeActionResponse() {
    return fraudResolutionProcedureExchangeActionResponse;
  }

  public void setFraudResolutionProcedureExchangeActionResponse(String fraudResolutionProcedureExchangeActionResponse) {
    this.fraudResolutionProcedureExchangeActionResponse = fraudResolutionProcedureExchangeActionResponse;
  }


}

