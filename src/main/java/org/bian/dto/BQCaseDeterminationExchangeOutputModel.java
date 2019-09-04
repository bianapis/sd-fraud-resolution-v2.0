package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationExchangeOutputModel
 */
public class BQCaseDeterminationExchangeOutputModel   {
  private String caseDeterminationExchangeActionTaskReference = null;

  private Object caseDeterminationExchangeActionTaskRecord = null;

  private String caseDeterminationExchangeActionResponse = null;

  private String caseDeterminationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Case Determination instance exchange service call 
   * @return caseDeterminationExchangeActionTaskReference
  **/

  public String getCaseDeterminationExchangeActionTaskReference() {
    return caseDeterminationExchangeActionTaskReference;
  }

  public void setCaseDeterminationExchangeActionTaskReference(String caseDeterminationExchangeActionTaskReference) {
    this.caseDeterminationExchangeActionTaskReference = caseDeterminationExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return caseDeterminationExchangeActionResponse
  **/

  public String getCaseDeterminationExchangeActionResponse() {
    return caseDeterminationExchangeActionResponse;
  }

  public void setCaseDeterminationExchangeActionResponse(String caseDeterminationExchangeActionResponse) {
    this.caseDeterminationExchangeActionResponse = caseDeterminationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Case Determination instance (e.g. accepted, rejected, verified) 
   * @return caseDeterminationInstanceStatus
  **/

  public String getCaseDeterminationInstanceStatus() {
    return caseDeterminationInstanceStatus;
  }

  public void setCaseDeterminationInstanceStatus(String caseDeterminationInstanceStatus) {
    this.caseDeterminationInstanceStatus = caseDeterminationInstanceStatus;
  }


}

