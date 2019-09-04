package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceReportRecord
 */
public class CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceReportRecord   {
  private String fraudResolutionProcedureInstanceReportData = null;

  private String fraudResolutionProcedureInstanceReportType = null;

  private Object fraudResolutionProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fraudResolutionProcedureInstanceReportData
  **/

  public String getFraudResolutionProcedureInstanceReportData() {
    return fraudResolutionProcedureInstanceReportData;
  }

  public void setFraudResolutionProcedureInstanceReportData(String fraudResolutionProcedureInstanceReportData) {
    this.fraudResolutionProcedureInstanceReportData = fraudResolutionProcedureInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fraudResolutionProcedureInstanceReport
  **/

  public Object getFraudResolutionProcedureInstanceReport() {
    return fraudResolutionProcedureInstanceReport;
  }

  public void setFraudResolutionProcedureInstanceReport(Object fraudResolutionProcedureInstanceReport) {
    this.fraudResolutionProcedureInstanceReport = fraudResolutionProcedureInstanceReport;
  }


}

