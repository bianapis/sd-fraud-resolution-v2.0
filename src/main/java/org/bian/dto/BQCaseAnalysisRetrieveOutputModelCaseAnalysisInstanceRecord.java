package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord
 */
public class BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord   {
  private String fraudCaseRootCause = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the case analysis 
   * @return fraudCaseRootCause
  **/

  public String getFraudCaseRootCause() {
    return fraudCaseRootCause;
  }

  public void setFraudCaseRootCause(String fraudCaseRootCause) {
    this.fraudCaseRootCause = fraudCaseRootCause;
  }


}

