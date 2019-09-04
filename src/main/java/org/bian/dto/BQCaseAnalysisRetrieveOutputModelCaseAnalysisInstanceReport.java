package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceReport
 */
public class BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceReport   {
  private Object caseAnalysisInstanceReportRecord = null;

  private String caseAnalysisInstanceReportType = null;

  private String caseAnalysisInstanceReportParameters = null;

  private Object caseAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return caseAnalysisInstanceReportRecord
  **/

  public Object getCaseAnalysisInstanceReportRecord() {
    return caseAnalysisInstanceReportRecord;
  }

  public void setCaseAnalysisInstanceReportRecord(Object caseAnalysisInstanceReportRecord) {
    this.caseAnalysisInstanceReportRecord = caseAnalysisInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return caseAnalysisInstanceReportType
  **/

  public String getCaseAnalysisInstanceReportType() {
    return caseAnalysisInstanceReportType;
  }

  public void setCaseAnalysisInstanceReportType(String caseAnalysisInstanceReportType) {
    this.caseAnalysisInstanceReportType = caseAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return caseAnalysisInstanceReportParameters
  **/

  public String getCaseAnalysisInstanceReportParameters() {
    return caseAnalysisInstanceReportParameters;
  }

  public void setCaseAnalysisInstanceReportParameters(String caseAnalysisInstanceReportParameters) {
    this.caseAnalysisInstanceReportParameters = caseAnalysisInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return caseAnalysisInstanceReport
  **/

  public Object getCaseAnalysisInstanceReport() {
    return caseAnalysisInstanceReport;
  }

  public void setCaseAnalysisInstanceReport(Object caseAnalysisInstanceReport) {
    this.caseAnalysisInstanceReport = caseAnalysisInstanceReport;
  }


}

