package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceReport
 */
public class BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceReport   {
  private String caseAnalysisInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return caseAnalysisInstanceReportReference
  **/

  public String getCaseAnalysisInstanceReportReference() {
    return caseAnalysisInstanceReportReference;
  }

  public void setCaseAnalysisInstanceReportReference(String caseAnalysisInstanceReportReference) {
    this.caseAnalysisInstanceReportReference = caseAnalysisInstanceReportReference;
  }


}

