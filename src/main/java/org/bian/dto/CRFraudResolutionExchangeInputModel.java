package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionExchangeInputModelFraudResolutionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionExchangeInputModel
 */
public class CRFraudResolutionExchangeInputModel   {
  private String fraudResolutionServicingSessionReference = null;

  private String fraudResolutionInstanceReference = null;

  private Object fraudResolutionExchangeActionTaskRecord = null;

  private CRFraudResolutionExchangeInputModelFraudResolutionExchangeActionRequest fraudResolutionExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud Resolution instance 
   * @return fraudResolutionInstanceReference
  **/

  public String getFraudResolutionInstanceReference() {
    return fraudResolutionInstanceReference;
  }

  public void setFraudResolutionInstanceReference(String fraudResolutionInstanceReference) {
    this.fraudResolutionInstanceReference = fraudResolutionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return fraudResolutionExchangeActionTaskRecord
  **/

  public Object getFraudResolutionExchangeActionTaskRecord() {
    return fraudResolutionExchangeActionTaskRecord;
  }

  public void setFraudResolutionExchangeActionTaskRecord(Object fraudResolutionExchangeActionTaskRecord) {
    this.fraudResolutionExchangeActionTaskRecord = fraudResolutionExchangeActionTaskRecord;
  }


  /**
   * Get fraudResolutionExchangeActionRequest
   * @return fraudResolutionExchangeActionRequest
  **/

  public CRFraudResolutionExchangeInputModelFraudResolutionExchangeActionRequest getFraudResolutionExchangeActionRequest() {
    return fraudResolutionExchangeActionRequest;
  }

  public void setFraudResolutionExchangeActionRequest(CRFraudResolutionExchangeInputModelFraudResolutionExchangeActionRequest fraudResolutionExchangeActionRequest) {
    this.fraudResolutionExchangeActionRequest = fraudResolutionExchangeActionRequest;
  }


}

