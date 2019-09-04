package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionExchangeOutputModel
 */
public class CRFraudResolutionExchangeOutputModel   {
  private String fraudResolutionExchangeActionTaskReference = null;

  private Object fraudResolutionExchangeActionTaskRecord = null;

  private String fraudResolutionExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Resolution instance exchange service call 
   * @return fraudResolutionExchangeActionTaskReference
  **/

  public String getFraudResolutionExchangeActionTaskReference() {
    return fraudResolutionExchangeActionTaskReference;
  }

  public void setFraudResolutionExchangeActionTaskReference(String fraudResolutionExchangeActionTaskReference) {
    this.fraudResolutionExchangeActionTaskReference = fraudResolutionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return fraudResolutionExchangeActionResponse
  **/

  public String getFraudResolutionExchangeActionResponse() {
    return fraudResolutionExchangeActionResponse;
  }

  public void setFraudResolutionExchangeActionResponse(String fraudResolutionExchangeActionResponse) {
    this.fraudResolutionExchangeActionResponse = fraudResolutionExchangeActionResponse;
  }


}

