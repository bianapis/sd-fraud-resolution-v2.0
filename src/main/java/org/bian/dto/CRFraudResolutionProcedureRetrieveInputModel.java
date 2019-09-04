package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceAnalysis;
import org.bian.dto.CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureRetrieveInputModel
 */
public class CRFraudResolutionProcedureRetrieveInputModel   {
  private Object fraudResolutionProcedureRetrieveActionTaskRecord = null;

  private String fraudResolutionProcedureRetrieveActionRequest = null;

  private CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceReportRecord fraudResolutionProcedureInstanceReportRecord = null;

  private CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceAnalysis fraudResolutionProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudResolutionProcedureRetrieveActionTaskRecord
  **/

  public Object getFraudResolutionProcedureRetrieveActionTaskRecord() {
    return fraudResolutionProcedureRetrieveActionTaskRecord;
  }

  public void setFraudResolutionProcedureRetrieveActionTaskRecord(Object fraudResolutionProcedureRetrieveActionTaskRecord) {
    this.fraudResolutionProcedureRetrieveActionTaskRecord = fraudResolutionProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fraudResolutionProcedureRetrieveActionRequest
  **/

  public String getFraudResolutionProcedureRetrieveActionRequest() {
    return fraudResolutionProcedureRetrieveActionRequest;
  }

  public void setFraudResolutionProcedureRetrieveActionRequest(String fraudResolutionProcedureRetrieveActionRequest) {
    this.fraudResolutionProcedureRetrieveActionRequest = fraudResolutionProcedureRetrieveActionRequest;
  }


  /**
   * Get fraudResolutionProcedureInstanceReportRecord
   * @return fraudResolutionProcedureInstanceReportRecord
  **/

  public CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceReportRecord getFraudResolutionProcedureInstanceReportRecord() {
    return fraudResolutionProcedureInstanceReportRecord;
  }

  public void setFraudResolutionProcedureInstanceReportRecord(CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceReportRecord fraudResolutionProcedureInstanceReportRecord) {
    this.fraudResolutionProcedureInstanceReportRecord = fraudResolutionProcedureInstanceReportRecord;
  }


  /**
   * Get fraudResolutionProcedureInstanceAnalysis
   * @return fraudResolutionProcedureInstanceAnalysis
  **/

  public CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceAnalysis getFraudResolutionProcedureInstanceAnalysis() {
    return fraudResolutionProcedureInstanceAnalysis;
  }

  public void setFraudResolutionProcedureInstanceAnalysis(CRFraudResolutionProcedureRetrieveInputModelFraudResolutionProcedureInstanceAnalysis fraudResolutionProcedureInstanceAnalysis) {
    this.fraudResolutionProcedureInstanceAnalysis = fraudResolutionProcedureInstanceAnalysis;
  }


}

