package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceReport
 */
public class BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceReport   {
  private String caseDeterminationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return caseDeterminationInstanceReportReference
  **/

  public String getCaseDeterminationInstanceReportReference() {
    return caseDeterminationInstanceReportReference;
  }

  public void setCaseDeterminationInstanceReportReference(String caseDeterminationInstanceReportReference) {
    this.caseDeterminationInstanceReportReference = caseDeterminationInstanceReportReference;
  }


}

