package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord;
import org.bian.dto.BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceAnalysis;
import org.bian.dto.BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceRecord;
import org.bian.dto.BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceReport;
import org.bian.dto.BQCaseDeterminationRetrieveOutputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaseDeterminationRetrieveOutputModel
 */
public class BQCaseDeterminationRetrieveOutputModel   {
  private BQCaseDeterminationRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord caseAnalysisInstanceRecord = null;

  private BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceRecord caseDeterminationInstanceRecord = null;

  private String caseDeterminationRetrieveActionTaskReference = null;

  private Object caseDeterminationRetrieveActionTaskRecord = null;

  private String caseDeterminationRetrieveActionResponse = null;

  private BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceReport caseDeterminationInstanceReport = null;

  private BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceAnalysis caseDeterminationInstanceAnalysis = null;


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public BQCaseDeterminationRetrieveOutputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(BQCaseDeterminationRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
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

  public BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceRecord getCaseDeterminationInstanceRecord() {
    return caseDeterminationInstanceRecord;
  }

  public void setCaseDeterminationInstanceRecord(BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceRecord caseDeterminationInstanceRecord) {
    this.caseDeterminationInstanceRecord = caseDeterminationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Case Determination instance retrieve service call 
   * @return caseDeterminationRetrieveActionTaskReference
  **/

  public String getCaseDeterminationRetrieveActionTaskReference() {
    return caseDeterminationRetrieveActionTaskReference;
  }

  public void setCaseDeterminationRetrieveActionTaskReference(String caseDeterminationRetrieveActionTaskReference) {
    this.caseDeterminationRetrieveActionTaskReference = caseDeterminationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return caseDeterminationRetrieveActionResponse
  **/

  public String getCaseDeterminationRetrieveActionResponse() {
    return caseDeterminationRetrieveActionResponse;
  }

  public void setCaseDeterminationRetrieveActionResponse(String caseDeterminationRetrieveActionResponse) {
    this.caseDeterminationRetrieveActionResponse = caseDeterminationRetrieveActionResponse;
  }


  /**
   * Get caseDeterminationInstanceReport
   * @return caseDeterminationInstanceReport
  **/

  public BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceReport getCaseDeterminationInstanceReport() {
    return caseDeterminationInstanceReport;
  }

  public void setCaseDeterminationInstanceReport(BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceReport caseDeterminationInstanceReport) {
    this.caseDeterminationInstanceReport = caseDeterminationInstanceReport;
  }


  /**
   * Get caseDeterminationInstanceAnalysis
   * @return caseDeterminationInstanceAnalysis
  **/

  public BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceAnalysis getCaseDeterminationInstanceAnalysis() {
    return caseDeterminationInstanceAnalysis;
  }

  public void setCaseDeterminationInstanceAnalysis(BQCaseDeterminationRetrieveOutputModelCaseDeterminationInstanceAnalysis caseDeterminationInstanceAnalysis) {
    this.caseDeterminationInstanceAnalysis = caseDeterminationInstanceAnalysis;
  }


}

