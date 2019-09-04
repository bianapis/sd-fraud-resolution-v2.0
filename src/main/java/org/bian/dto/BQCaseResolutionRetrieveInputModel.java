package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseResolutionRetrieveInputModelCaseResolutionInstanceAnalysis;
import org.bian.dto.BQCaseResolutionRetrieveInputModelCaseResolutionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCaseResolutionRetrieveInputModel
 */
public class BQCaseResolutionRetrieveInputModel   {
  private Object caseResolutionRetrieveActionTaskRecord = null;

  private String caseResolutionRetrieveActionRequest = null;

  private BQCaseResolutionRetrieveInputModelCaseResolutionInstanceReport caseResolutionInstanceReport = null;

  private BQCaseResolutionRetrieveInputModelCaseResolutionInstanceAnalysis caseResolutionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return caseResolutionRetrieveActionTaskRecord
  **/

  public Object getCaseResolutionRetrieveActionTaskRecord() {
    return caseResolutionRetrieveActionTaskRecord;
  }

  public void setCaseResolutionRetrieveActionTaskRecord(Object caseResolutionRetrieveActionTaskRecord) {
    this.caseResolutionRetrieveActionTaskRecord = caseResolutionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return caseResolutionRetrieveActionRequest
  **/

  public String getCaseResolutionRetrieveActionRequest() {
    return caseResolutionRetrieveActionRequest;
  }

  public void setCaseResolutionRetrieveActionRequest(String caseResolutionRetrieveActionRequest) {
    this.caseResolutionRetrieveActionRequest = caseResolutionRetrieveActionRequest;
  }


  /**
   * Get caseResolutionInstanceReport
   * @return caseResolutionInstanceReport
  **/

  public BQCaseResolutionRetrieveInputModelCaseResolutionInstanceReport getCaseResolutionInstanceReport() {
    return caseResolutionInstanceReport;
  }

  public void setCaseResolutionInstanceReport(BQCaseResolutionRetrieveInputModelCaseResolutionInstanceReport caseResolutionInstanceReport) {
    this.caseResolutionInstanceReport = caseResolutionInstanceReport;
  }


  /**
   * Get caseResolutionInstanceAnalysis
   * @return caseResolutionInstanceAnalysis
  **/

  public BQCaseResolutionRetrieveInputModelCaseResolutionInstanceAnalysis getCaseResolutionInstanceAnalysis() {
    return caseResolutionInstanceAnalysis;
  }

  public void setCaseResolutionInstanceAnalysis(BQCaseResolutionRetrieveInputModelCaseResolutionInstanceAnalysis caseResolutionInstanceAnalysis) {
    this.caseResolutionInstanceAnalysis = caseResolutionInstanceAnalysis;
  }


}

