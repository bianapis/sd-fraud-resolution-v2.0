package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionProcedureExchangeInputModelFraudResolutionProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureExchangeInputModel
 */
public class CRFraudResolutionProcedureExchangeInputModel   {
  private String fraudResolutionServicingSessionReference = null;

  private String fraudResolutionProcedureInstanceReference = null;

  private Object fraudResolutionProcedureExchangeActionTaskRecord = null;

  private CRFraudResolutionProcedureExchangeInputModelFraudResolutionProcedureExchangeActionRequest fraudResolutionProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return fraudResolutionServicingSessionReference
  **/

  public String getFraudResolutionServicingSessionReference() {
    return fraudResolutionServicingSessionReference;
  }

  public void setFraudResolutionServicingSessionReference(String fraudResolutionServicingSessionReference) {
    this.fraudResolutionServicingSessionReference = fraudResolutionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud Resolution Procedure instance 
   * @return fraudResolutionProcedureInstanceReference
  **/

  public String getFraudResolutionProcedureInstanceReference() {
    return fraudResolutionProcedureInstanceReference;
  }

  public void setFraudResolutionProcedureInstanceReference(String fraudResolutionProcedureInstanceReference) {
    this.fraudResolutionProcedureInstanceReference = fraudResolutionProcedureInstanceReference;
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
   * Get fraudResolutionProcedureExchangeActionRequest
   * @return fraudResolutionProcedureExchangeActionRequest
  **/

  public CRFraudResolutionProcedureExchangeInputModelFraudResolutionProcedureExchangeActionRequest getFraudResolutionProcedureExchangeActionRequest() {
    return fraudResolutionProcedureExchangeActionRequest;
  }

  public void setFraudResolutionProcedureExchangeActionRequest(CRFraudResolutionProcedureExchangeInputModelFraudResolutionProcedureExchangeActionRequest fraudResolutionProcedureExchangeActionRequest) {
    this.fraudResolutionProcedureExchangeActionRequest = fraudResolutionProcedureExchangeActionRequest;
  }


}

