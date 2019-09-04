package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceAnalysis
 */
public class CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceAnalysis   {
  private String fraudResolutionInstanceAnalysisData = null;

  private String fraudResolutionInstanceAnalysisReportType = null;

  private Object fraudResolutionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fraudResolutionInstanceAnalysisData
  **/

  public String getFraudResolutionInstanceAnalysisData() {
    return fraudResolutionInstanceAnalysisData;
  }

  public void setFraudResolutionInstanceAnalysisData(String fraudResolutionInstanceAnalysisData) {
    this.fraudResolutionInstanceAnalysisData = fraudResolutionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudResolutionInstanceAnalysisReportType
  **/

  public String getFraudResolutionInstanceAnalysisReportType() {
    return fraudResolutionInstanceAnalysisReportType;
  }

  public void setFraudResolutionInstanceAnalysisReportType(String fraudResolutionInstanceAnalysisReportType) {
    this.fraudResolutionInstanceAnalysisReportType = fraudResolutionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fraudResolutionInstanceAnalysisReport
  **/

  public Object getFraudResolutionInstanceAnalysisReport() {
    return fraudResolutionInstanceAnalysisReport;
  }

  public void setFraudResolutionInstanceAnalysisReport(Object fraudResolutionInstanceAnalysisReport) {
    this.fraudResolutionInstanceAnalysisReport = fraudResolutionInstanceAnalysisReport;
  }


}

