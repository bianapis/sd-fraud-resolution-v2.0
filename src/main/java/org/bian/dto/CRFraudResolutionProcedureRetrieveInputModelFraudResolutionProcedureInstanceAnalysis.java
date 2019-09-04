package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceAnalysis
 */
public class CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceAnalysis   {
  private String fraudResolutionProcedureInstanceAnalysisReference = null;

  private String fraudResolutionProcedureInstanceAnalysisReportType = null;

  private String fraudResolutionProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fraudResolutionProcedureInstanceAnalysisReference
  **/

  public String getFraudResolutionProcedureInstanceAnalysisReference() {
    return fraudResolutionProcedureInstanceAnalysisReference;
  }

  public void setFraudResolutionProcedureInstanceAnalysisReference(String fraudResolutionProcedureInstanceAnalysisReference) {
    this.fraudResolutionProcedureInstanceAnalysisReference = fraudResolutionProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fraudResolutionProcedureInstanceAnalysisParameters
  **/

  public String getFraudResolutionProcedureInstanceAnalysisParameters() {
    return fraudResolutionProcedureInstanceAnalysisParameters;
  }

  public void setFraudResolutionProcedureInstanceAnalysisParameters(String fraudResolutionProcedureInstanceAnalysisParameters) {
    this.fraudResolutionProcedureInstanceAnalysisParameters = fraudResolutionProcedureInstanceAnalysisParameters;
  }


}

