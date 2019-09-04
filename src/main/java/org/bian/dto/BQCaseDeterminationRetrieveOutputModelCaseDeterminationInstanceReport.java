package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceReport
 */
public class BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceReport   {
  private Object caseDeterminationInstanceReportRecord = null;

  private String caseDeterminationInstanceReportType = null;

  private String caseDeterminationInstanceReportParameters = null;

  private Object caseDeterminationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return caseDeterminationInstanceReportRecord
  **/

  public Object getCaseDeterminationInstanceReportRecord() {
    return caseDeterminationInstanceReportRecord;
  }

  public void setCaseDeterminationInstanceReportRecord(Object caseDeterminationInstanceReportRecord) {
    this.caseDeterminationInstanceReportRecord = caseDeterminationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return caseDeterminationInstanceReportType
  **/

  public String getCaseDeterminationInstanceReportType() {
    return caseDeterminationInstanceReportType;
  }

  public void setCaseDeterminationInstanceReportType(String caseDeterminationInstanceReportType) {
    this.caseDeterminationInstanceReportType = caseDeterminationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return caseDeterminationInstanceReportParameters
  **/

  public String getCaseDeterminationInstanceReportParameters() {
    return caseDeterminationInstanceReportParameters;
  }

  public void setCaseDeterminationInstanceReportParameters(String caseDeterminationInstanceReportParameters) {
    this.caseDeterminationInstanceReportParameters = caseDeterminationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return caseDeterminationInstanceReport
  **/

  public Object getCaseDeterminationInstanceReport() {
    return caseDeterminationInstanceReport;
  }

  public void setCaseDeterminationInstanceReport(Object caseDeterminationInstanceReport) {
    this.caseDeterminationInstanceReport = caseDeterminationInstanceReport;
  }


}

