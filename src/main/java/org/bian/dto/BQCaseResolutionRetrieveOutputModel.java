package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord;
import org.bian.dto.BQCaseResolutionRetrieveOutputModelCaseDeterminationInstanceRecord;
import org.bian.dto.BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceAnalysis;
import org.bian.dto.BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceRecord;
import org.bian.dto.BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceReport;
import org.bian.dto.BQCaseResolutionRetrieveOutputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaseResolutionRetrieveOutputModel
 */
public class BQCaseResolutionRetrieveOutputModel   {
  private BQCaseResolutionRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord caseAnalysisInstanceRecord = null;

  private BQCaseResolutionRetrieveOutputModelCaseDeterminationInstanceRecord caseDeterminationInstanceRecord = null;

  private BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceRecord caseResolutionInstanceRecord = null;

  private String caseResolutionRetrieveActionTaskReference = null;

  private Object caseResolutionRetrieveActionTaskRecord = null;

  private String caseResolutionRetrieveActionResponse = null;

  private BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceReport caseResolutionInstanceReport = null;

  private BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceAnalysis caseResolutionInstanceAnalysis = null;


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public BQCaseResolutionRetrieveOutputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(BQCaseResolutionRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


  /**
   * Get caseAnalysisInstanceRecord
   * @return caseAnalysisInstanceRecord
  **/

  public BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord getCaseAnalysisInstanceRecord() {
    return caseAnalysisInstanceRecord;
  }

  public void setCaseAnalysisInstanceRecord(BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord caseAnalysisInstanceRecord) {
    this.caseAnalysisInstanceRecord = caseAnalysisInstanceRecord;
  }


  /**
   * Get caseDeterminationInstanceRecord
   * @return caseDeterminationInstanceRecord
  **/

  public BQCaseResolutionRetrieveOutputModelCaseDeterminationInstanceRecord getCaseDeterminationInstanceRecord() {
    return caseDeterminationInstanceRecord;
  }

  public void setCaseDeterminationInstanceRecord(BQCaseResolutionRetrieveOutputModelCaseDeterminationInstanceRecord caseDeterminationInstanceRecord) {
    this.caseDeterminationInstanceRecord = caseDeterminationInstanceRecord;
  }


  /**
   * Get caseResolutionInstanceRecord
   * @return caseResolutionInstanceRecord
  **/

  public BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceRecord getCaseResolutionInstanceRecord() {
    return caseResolutionInstanceRecord;
  }

  public void setCaseResolutionInstanceRecord(BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceRecord caseResolutionInstanceRecord) {
    this.caseResolutionInstanceRecord = caseResolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Case Resolution instance retrieve service call 
   * @return caseResolutionRetrieveActionTaskReference
  **/

  public String getCaseResolutionRetrieveActionTaskReference() {
    return caseResolutionRetrieveActionTaskReference;
  }

  public void setCaseResolutionRetrieveActionTaskReference(String caseResolutionRetrieveActionTaskReference) {
    this.caseResolutionRetrieveActionTaskReference = caseResolutionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return caseResolutionRetrieveActionResponse
  **/

  public String getCaseResolutionRetrieveActionResponse() {
    return caseResolutionRetrieveActionResponse;
  }

  public void setCaseResolutionRetrieveActionResponse(String caseResolutionRetrieveActionResponse) {
    this.caseResolutionRetrieveActionResponse = caseResolutionRetrieveActionResponse;
  }


  /**
   * Get caseResolutionInstanceReport
   * @return caseResolutionInstanceReport
  **/

  public BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceReport getCaseResolutionInstanceReport() {
    return caseResolutionInstanceReport;
  }

  public void setCaseResolutionInstanceReport(BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceReport caseResolutionInstanceReport) {
    this.caseResolutionInstanceReport = caseResolutionInstanceReport;
  }


  /**
   * Get caseResolutionInstanceAnalysis
   * @return caseResolutionInstanceAnalysis
  **/

  public BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceAnalysis getCaseResolutionInstanceAnalysis() {
    return caseResolutionInstanceAnalysis;
  }

  public void setCaseResolutionInstanceAnalysis(BQCaseResolutionRetrieveOutputModelCaseResolutionInstanceAnalysis caseResolutionInstanceAnalysis) {
    this.caseResolutionInstanceAnalysis = caseResolutionInstanceAnalysis;
  }


}

