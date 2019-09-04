package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceAnalysis
 */
public class CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceAnalysis   {
  private String fraudResolutionProcedureInstanceAnalysisData = null;

  private String fraudResolutionProcedureInstanceAnalysisReportType = null;

  private Object fraudResolutionProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fraudResolutionProcedureInstanceAnalysisData
  **/

  public String getFraudResolutionProcedureInstanceAnalysisData() {
    return fraudResolutionProcedureInstanceAnalysisData;
  }

  public void setFraudResolutionProcedureInstanceAnalysisData(String fraudResolutionProcedureInstanceAnalysisData) {
    this.fraudResolutionProcedureInstanceAnalysisData = fraudResolutionProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudResolutionProcedureInstanceAnalysisReportType
  **/

  public String getFraudResolutionProcedureInstanceAnalysisReportType() {
    return fraudResolutionProcedureInstanceAnalysisReportType;
  }

  public void setFraudResolutionProcedureInstanceAnalysisReportType(String fraudResolutionProcedureInstanceAnalysisReportType) {
    this.fraudResolutionProcedureInstanceAnalysisReportType = fraudResolutionProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fraudResolutionProcedureInstanceAnalysisReport
  **/

  public Object getFraudResolutionProcedureInstanceAnalysisReport() {
    return fraudResolutionProcedureInstanceAnalysisReport;
  }

  public void setFraudResolutionProcedureInstanceAnalysisReport(Object fraudResolutionProcedureInstanceAnalysisReport) {
    this.fraudResolutionProcedureInstanceAnalysisReport = fraudResolutionProcedureInstanceAnalysisReport;
  }


}

