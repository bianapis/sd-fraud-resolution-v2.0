package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionRetrieveInputModelFraudResolutionInstanceAnalysis;
import org.bian.dto.CRFraudResolutionRetrieveInputModelFraudResolutionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionRetrieveInputModel
 */
public class CRFraudResolutionRetrieveInputModel   {
  private Object fraudResolutionRetrieveActionTaskRecord = null;

  private String fraudResolutionRetrieveActionRequest = null;

  private CRFraudResolutionRetrieveInputModelFraudResolutionInstanceReportRecord fraudResolutionInstanceReportRecord = null;

  private CRFraudResolutionRetrieveInputModelFraudResolutionInstanceAnalysis fraudResolutionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudResolutionRetrieveActionTaskRecord
  **/

  public Object getFraudResolutionRetrieveActionTaskRecord() {
    return fraudResolutionRetrieveActionTaskRecord;
  }

  public void setFraudResolutionRetrieveActionTaskRecord(Object fraudResolutionRetrieveActionTaskRecord) {
    this.fraudResolutionRetrieveActionTaskRecord = fraudResolutionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fraudResolutionRetrieveActionRequest
  **/

  public String getFraudResolutionRetrieveActionRequest() {
    return fraudResolutionRetrieveActionRequest;
  }

  public void setFraudResolutionRetrieveActionRequest(String fraudResolutionRetrieveActionRequest) {
    this.fraudResolutionRetrieveActionRequest = fraudResolutionRetrieveActionRequest;
  }


  /**
   * Get fraudResolutionInstanceReportRecord
   * @return fraudResolutionInstanceReportRecord
  **/

  public CRFraudResolutionRetrieveInputModelFraudResolutionInstanceReportRecord getFraudResolutionInstanceReportRecord() {
    return fraudResolutionInstanceReportRecord;
  }

  public void setFraudResolutionInstanceReportRecord(CRFraudResolutionRetrieveInputModelFraudResolutionInstanceReportRecord fraudResolutionInstanceReportRecord) {
    this.fraudResolutionInstanceReportRecord = fraudResolutionInstanceReportRecord;
  }


  /**
   * Get fraudResolutionInstanceAnalysis
   * @return fraudResolutionInstanceAnalysis
  **/

  public CRFraudResolutionRetrieveInputModelFraudResolutionInstanceAnalysis getFraudResolutionInstanceAnalysis() {
    return fraudResolutionInstanceAnalysis;
  }

  public void setFraudResolutionInstanceAnalysis(CRFraudResolutionRetrieveInputModelFraudResolutionInstanceAnalysis fraudResolutionInstanceAnalysis) {
    this.fraudResolutionInstanceAnalysis = fraudResolutionInstanceAnalysis;
  }


}

