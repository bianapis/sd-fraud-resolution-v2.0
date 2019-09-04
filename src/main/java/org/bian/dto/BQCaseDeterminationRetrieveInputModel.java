package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceAnalysis;
import org.bian.dto.BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationRetrieveInputModel
 */
public class BQCaseDeterminationRetrieveInputModel   {
  private Object caseDeterminationRetrieveActionTaskRecord = null;

  private String caseDeterminationRetrieveActionRequest = null;

  private BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceReport caseDeterminationInstanceReport = null;

  private BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceAnalysis caseDeterminationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return caseDeterminationRetrieveActionTaskRecord
  **/

  public Object getCaseDeterminationRetrieveActionTaskRecord() {
    return caseDeterminationRetrieveActionTaskRecord;
  }

  public void setCaseDeterminationRetrieveActionTaskRecord(Object caseDeterminationRetrieveActionTaskRecord) {
    this.caseDeterminationRetrieveActionTaskRecord = caseDeterminationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return caseDeterminationRetrieveActionRequest
  **/

  public String getCaseDeterminationRetrieveActionRequest() {
    return caseDeterminationRetrieveActionRequest;
  }

  public void setCaseDeterminationRetrieveActionRequest(String caseDeterminationRetrieveActionRequest) {
    this.caseDeterminationRetrieveActionRequest = caseDeterminationRetrieveActionRequest;
  }


  /**
   * Get caseDeterminationInstanceReport
   * @return caseDeterminationInstanceReport
  **/

  public BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceReport getCaseDeterminationInstanceReport() {
    return caseDeterminationInstanceReport;
  }

  public void setCaseDeterminationInstanceReport(BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceReport caseDeterminationInstanceReport) {
    this.caseDeterminationInstanceReport = caseDeterminationInstanceReport;
  }


  /**
   * Get caseDeterminationInstanceAnalysis
   * @return caseDeterminationInstanceAnalysis
  **/

  public BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceAnalysis getCaseDeterminationInstanceAnalysis() {
    return caseDeterminationInstanceAnalysis;
  }

  public void setCaseDeterminationInstanceAnalysis(BQCaseDeterminationRetrieveInputModelCaseDeterminationInstanceAnalysis caseDeterminationInstanceAnalysis) {
    this.caseDeterminationInstanceAnalysis = caseDeterminationInstanceAnalysis;
  }


}

