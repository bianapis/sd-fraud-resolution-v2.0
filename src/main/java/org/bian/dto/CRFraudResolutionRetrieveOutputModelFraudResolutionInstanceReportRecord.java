package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceReportRecord
 */
public class CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceReportRecord   {
  private String fraudResolutionInstanceReportData = null;

  private String fraudResolutionInstanceReportType = null;

  private Object fraudResolutionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fraudResolutionInstanceReportData
  **/

  public String getFraudResolutionInstanceReportData() {
    return fraudResolutionInstanceReportData;
  }

  public void setFraudResolutionInstanceReportData(String fraudResolutionInstanceReportData) {
    this.fraudResolutionInstanceReportData = fraudResolutionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fraudResolutionInstanceReport
  **/

  public Object getFraudResolutionInstanceReport() {
    return fraudResolutionInstanceReport;
  }

  public void setFraudResolutionInstanceReport(Object fraudResolutionInstanceReport) {
    this.fraudResolutionInstanceReport = fraudResolutionInstanceReport;
  }


}

