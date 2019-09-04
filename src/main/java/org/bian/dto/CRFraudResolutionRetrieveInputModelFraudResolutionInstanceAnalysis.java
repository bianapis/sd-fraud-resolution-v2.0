package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionRetrieveInputModelFraudResolutionInstanceAnalysis
 */
public class CRFraudResolutionRetrieveInputModelFraudResolutionInstanceAnalysis   {
  private String fraudResolutionInstanceAnalysisReference = null;

  private String fraudResolutionInstanceAnalysisReportType = null;

  private String fraudResolutionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fraudResolutionInstanceAnalysisReference
  **/

  public String getFraudResolutionInstanceAnalysisReference() {
    return fraudResolutionInstanceAnalysisReference;
  }

  public void setFraudResolutionInstanceAnalysisReference(String fraudResolutionInstanceAnalysisReference) {
    this.fraudResolutionInstanceAnalysisReference = fraudResolutionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fraudResolutionInstanceAnalysisParameters
  **/

  public String getFraudResolutionInstanceAnalysisParameters() {
    return fraudResolutionInstanceAnalysisParameters;
  }

  public void setFraudResolutionInstanceAnalysisParameters(String fraudResolutionInstanceAnalysisParameters) {
    this.fraudResolutionInstanceAnalysisParameters = fraudResolutionInstanceAnalysisParameters;
  }


}

