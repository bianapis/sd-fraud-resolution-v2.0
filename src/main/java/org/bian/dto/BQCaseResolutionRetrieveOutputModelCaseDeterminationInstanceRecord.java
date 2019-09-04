package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseResolutionRetrieveOutputModelCaseDeterminationInstanceRecord
 */
public class BQCaseResolutionRetrieveOutputModelCaseDeterminationInstanceRecord   {
  private Object fraudCaseDeterminationRecord = null;


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

