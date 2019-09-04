package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceAnalysis;
import org.bian.dto.BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCaseAnalysisRetrieveInputModel
 */
public class BQCaseAnalysisRetrieveInputModel   {
  private Object caseAnalysisRetrieveActionTaskRecord = null;

  private String caseAnalysisRetrieveActionRequest = null;

  private BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceReport caseAnalysisInstanceReport = null;

  private BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceAnalysis caseAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return caseAnalysisRetrieveActionTaskRecord
  **/

  public Object getCaseAnalysisRetrieveActionTaskRecord() {
    return caseAnalysisRetrieveActionTaskRecord;
  }

  public void setCaseAnalysisRetrieveActionTaskRecord(Object caseAnalysisRetrieveActionTaskRecord) {
    this.caseAnalysisRetrieveActionTaskRecord = caseAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return caseAnalysisRetrieveActionRequest
  **/

  public String getCaseAnalysisRetrieveActionRequest() {
    return caseAnalysisRetrieveActionRequest;
  }

  public void setCaseAnalysisRetrieveActionRequest(String caseAnalysisRetrieveActionRequest) {
    this.caseAnalysisRetrieveActionRequest = caseAnalysisRetrieveActionRequest;
  }


  /**
   * Get caseAnalysisInstanceReport
   * @return caseAnalysisInstanceReport
  **/

  public BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceReport getCaseAnalysisInstanceReport() {
    return caseAnalysisInstanceReport;
  }

  public void setCaseAnalysisInstanceReport(BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceReport caseAnalysisInstanceReport) {
    this.caseAnalysisInstanceReport = caseAnalysisInstanceReport;
  }


  /**
   * Get caseAnalysisInstanceAnalysis
   * @return caseAnalysisInstanceAnalysis
  **/

  public BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceAnalysis getCaseAnalysisInstanceAnalysis() {
    return caseAnalysisInstanceAnalysis;
  }

  public void setCaseAnalysisInstanceAnalysis(BQCaseAnalysisRetrieveInputModelCaseAnalysisInstanceAnalysis caseAnalysisInstanceAnalysis) {
    this.caseAnalysisInstanceAnalysis = caseAnalysisInstanceAnalysis;
  }


}

