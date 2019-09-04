package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceAnalysis
 */
public class BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceAnalysis   {
  private String caseAnalysisInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return caseAnalysisInstanceAnalysisReference
  **/

  public String getCaseAnalysisInstanceAnalysisReference() {
    return caseAnalysisInstanceAnalysisReference;
  }

  public void setCaseAnalysisInstanceAnalysisReference(String caseAnalysisInstanceAnalysisReference) {
    this.caseAnalysisInstanceAnalysisReference = caseAnalysisInstanceAnalysisReference;
  }


}

