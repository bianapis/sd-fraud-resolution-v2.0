package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceAnalysis
 */
public class BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceAnalysis   {
  private String caseDeterminationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return caseDeterminationInstanceAnalysisReference
  **/

  public String getCaseDeterminationInstanceAnalysisReference() {
    return caseDeterminationInstanceAnalysisReference;
  }

  public void setCaseDeterminationInstanceAnalysisReference(String caseDeterminationInstanceAnalysisReference) {
    this.caseDeterminationInstanceAnalysisReference = caseDeterminationInstanceAnalysisReference;
  }


}

