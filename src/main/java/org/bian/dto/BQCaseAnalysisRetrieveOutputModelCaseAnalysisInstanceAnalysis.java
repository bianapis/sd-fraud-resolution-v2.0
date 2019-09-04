package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceAnalysis
 */
public class BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceAnalysis   {
  private Object caseAnalysisInstanceAnalysisRecord = null;

  private String caseAnalysisInstanceAnalysisReportType = null;

  private String caseAnalysisInstanceAnalysisParameters = null;

  private Object caseAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return caseAnalysisInstanceAnalysisRecord
  **/

  public Object getCaseAnalysisInstanceAnalysisRecord() {
    return caseAnalysisInstanceAnalysisRecord;
  }

  public void setCaseAnalysisInstanceAnalysisRecord(Object caseAnalysisInstanceAnalysisRecord) {
    this.caseAnalysisInstanceAnalysisRecord = caseAnalysisInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return caseAnalysisInstanceAnalysisReportType
  **/

  public String getCaseAnalysisInstanceAnalysisReportType() {
    return caseAnalysisInstanceAnalysisReportType;
  }

  public void setCaseAnalysisInstanceAnalysisReportType(String caseAnalysisInstanceAnalysisReportType) {
    this.caseAnalysisInstanceAnalysisReportType = caseAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return caseAnalysisInstanceAnalysisParameters
  **/

  public String getCaseAnalysisInstanceAnalysisParameters() {
    return caseAnalysisInstanceAnalysisParameters;
  }

  public void setCaseAnalysisInstanceAnalysisParameters(String caseAnalysisInstanceAnalysisParameters) {
    this.caseAnalysisInstanceAnalysisParameters = caseAnalysisInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return caseAnalysisInstanceAnalysisReport
  **/

  public Object getCaseAnalysisInstanceAnalysisReport() {
    return caseAnalysisInstanceAnalysisReport;
  }

  public void setCaseAnalysisInstanceAnalysisReport(Object caseAnalysisInstanceAnalysisReport) {
    this.caseAnalysisInstanceAnalysisReport = caseAnalysisInstanceAnalysisReport;
  }


}

