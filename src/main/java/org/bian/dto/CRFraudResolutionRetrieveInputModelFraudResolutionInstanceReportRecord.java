package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionRetrieveInputModelFraudResolutionInstanceReportRecord
 */
public class CRFraudResolutionRetrieveInputModelFraudResolutionInstanceReportRecord   {
  private String fraudResolutionInstanceReportReference = null;

  private String fraudResolutionInstanceReportType = null;

  private String fraudResolutionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fraudResolutionInstanceReportReference
  **/

  public String getFraudResolutionInstanceReportReference() {
    return fraudResolutionInstanceReportReference;
  }

  public void setFraudResolutionInstanceReportReference(String fraudResolutionInstanceReportReference) {
    this.fraudResolutionInstanceReportReference = fraudResolutionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudResolutionInstanceReportType
  **/

  public String getFraudResolutionInstanceReportType() {
    return fraudResolutionInstanceReportType;
  }

  public void setFraudResolutionInstanceReportType(String fraudResolutionInstanceReportType) {
    this.fraudResolutionInstanceReportType = fraudResolutionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fraudResolutionInstanceReportParameters
  **/

  public String getFraudResolutionInstanceReportParameters() {
    return fraudResolutionInstanceReportParameters;
  }

  public void setFraudResolutionInstanceReportParameters(String fraudResolutionInstanceReportParameters) {
    this.fraudResolutionInstanceReportParameters = fraudResolutionInstanceReportParameters;
  }


}

