package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceReport
 */
public class BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceReport   {
  private Object caseResolutionInstanceReportRecord = null;

  private String caseResolutionInstanceReportType = null;

  private String caseResolutionInstanceReportParameters = null;

  private Object caseResolutionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return caseResolutionInstanceReportRecord
  **/

  public Object getCaseResolutionInstanceReportRecord() {
    return caseResolutionInstanceReportRecord;
  }

  public void setCaseResolutionInstanceReportRecord(Object caseResolutionInstanceReportRecord) {
    this.caseResolutionInstanceReportRecord = caseResolutionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return caseResolutionInstanceReportType
  **/

  public String getCaseResolutionInstanceReportType() {
    return caseResolutionInstanceReportType;
  }

  public void setCaseResolutionInstanceReportType(String caseResolutionInstanceReportType) {
    this.caseResolutionInstanceReportType = caseResolutionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return caseResolutionInstanceReportParameters
  **/

  public String getCaseResolutionInstanceReportParameters() {
    return caseResolutionInstanceReportParameters;
  }

  public void setCaseResolutionInstanceReportParameters(String caseResolutionInstanceReportParameters) {
    this.caseResolutionInstanceReportParameters = caseResolutionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return caseResolutionInstanceReport
  **/

  public Object getCaseResolutionInstanceReport() {
    return caseResolutionInstanceReport;
  }

  public void setCaseResolutionInstanceReport(Object caseResolutionInstanceReport) {
    this.caseResolutionInstanceReport = caseResolutionInstanceReport;
  }


}

