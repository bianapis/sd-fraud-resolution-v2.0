package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceAnalysis
 */
public class BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceAnalysis   {
  private Object caseDeterminationInstanceAnalysisRecord = null;

  private String caseDeterminationInstanceAnalysisReportType = null;

  private String caseDeterminationInstanceAnalysisParameters = null;

  private Object caseDeterminationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return caseDeterminationInstanceAnalysisRecord
  **/

  public Object getCaseDeterminationInstanceAnalysisRecord() {
    return caseDeterminationInstanceAnalysisRecord;
  }

  public void setCaseDeterminationInstanceAnalysisRecord(Object caseDeterminationInstanceAnalysisRecord) {
    this.caseDeterminationInstanceAnalysisRecord = caseDeterminationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return caseDeterminationInstanceAnalysisReportType
  **/

  public String getCaseDeterminationInstanceAnalysisReportType() {
    return caseDeterminationInstanceAnalysisReportType;
  }

  public void setCaseDeterminationInstanceAnalysisReportType(String caseDeterminationInstanceAnalysisReportType) {
    this.caseDeterminationInstanceAnalysisReportType = caseDeterminationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return caseDeterminationInstanceAnalysisParameters
  **/

  public String getCaseDeterminationInstanceAnalysisParameters() {
    return caseDeterminationInstanceAnalysisParameters;
  }

  public void setCaseDeterminationInstanceAnalysisParameters(String caseDeterminationInstanceAnalysisParameters) {
    this.caseDeterminationInstanceAnalysisParameters = caseDeterminationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return caseDeterminationInstanceAnalysisReport
  **/

  public Object getCaseDeterminationInstanceAnalysisReport() {
    return caseDeterminationInstanceAnalysisReport;
  }

  public void setCaseDeterminationInstanceAnalysisReport(Object caseDeterminationInstanceAnalysisReport) {
    this.caseDeterminationInstanceAnalysisReport = caseDeterminationInstanceAnalysisReport;
  }


}

