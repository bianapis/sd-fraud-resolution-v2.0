package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceAnalysis
 */
public class BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceAnalysis   {
  private Object caseResolutionInstanceAnalysisRecord = null;

  private String caseResolutionInstanceAnalysisReportType = null;

  private String caseResolutionInstanceAnalysisParameters = null;

  private Object caseResolutionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return caseResolutionInstanceAnalysisRecord
  **/

  public Object getCaseResolutionInstanceAnalysisRecord() {
    return caseResolutionInstanceAnalysisRecord;
  }

  public void setCaseResolutionInstanceAnalysisRecord(Object caseResolutionInstanceAnalysisRecord) {
    this.caseResolutionInstanceAnalysisRecord = caseResolutionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return caseResolutionInstanceAnalysisReportType
  **/

  public String getCaseResolutionInstanceAnalysisReportType() {
    return caseResolutionInstanceAnalysisReportType;
  }

  public void setCaseResolutionInstanceAnalysisReportType(String caseResolutionInstanceAnalysisReportType) {
    this.caseResolutionInstanceAnalysisReportType = caseResolutionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return caseResolutionInstanceAnalysisParameters
  **/

  public String getCaseResolutionInstanceAnalysisParameters() {
    return caseResolutionInstanceAnalysisParameters;
  }

  public void setCaseResolutionInstanceAnalysisParameters(String caseResolutionInstanceAnalysisParameters) {
    this.caseResolutionInstanceAnalysisParameters = caseResolutionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return caseResolutionInstanceAnalysisReport
  **/

  public Object getCaseResolutionInstanceAnalysisReport() {
    return caseResolutionInstanceAnalysisReport;
  }

  public void setCaseResolutionInstanceAnalysisReport(Object caseResolutionInstanceAnalysisReport) {
    this.caseResolutionInstanceAnalysisReport = caseResolutionInstanceAnalysisReport;
  }


}

