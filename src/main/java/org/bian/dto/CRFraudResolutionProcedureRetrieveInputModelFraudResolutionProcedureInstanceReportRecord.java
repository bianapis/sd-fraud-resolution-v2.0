package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceReportRecord
 */
public class CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceReportRecord   {
  private String fraudResolutionProcedureInstanceReportReference = null;

  private String fraudResolutionProcedureInstanceReportType = null;

  private String fraudResolutionProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fraudResolutionProcedureInstanceReportReference
  **/

  public String getFraudResolutionProcedureInstanceReportReference() {
    return fraudResolutionProcedureInstanceReportReference;
  }

  public void setFraudResolutionProcedureInstanceReportReference(String fraudResolutionProcedureInstanceReportReference) {
    this.fraudResolutionProcedureInstanceReportReference = fraudResolutionProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudResolutionProcedureInstanceReportType
  **/

  public String getFraudResolutionProcedureInstanceReportType() {
    return fraudResolutionProcedureInstanceReportType;
  }

  public void setFraudResolutionProcedureInstanceReportType(String fraudResolutionProcedureInstanceReportType) {
    this.fraudResolutionProcedureInstanceReportType = fraudResolutionProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fraudResolutionProcedureInstanceReportParameters
  **/

  public String getFraudResolutionProcedureInstanceReportParameters() {
    return fraudResolutionProcedureInstanceReportParameters;
  }

  public void setFraudResolutionProcedureInstanceReportParameters(String fraudResolutionProcedureInstanceReportParameters) {
    this.fraudResolutionProcedureInstanceReportParameters = fraudResolutionProcedureInstanceReportParameters;
  }


}

