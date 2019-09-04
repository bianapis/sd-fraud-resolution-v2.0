package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceAnalysis;
import org.bian.dto.BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord;
import org.bian.dto.BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceReport;
import org.bian.dto.BQCaseAnalysisRetrieveOutputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaseAnalysisRetrieveOutputModel
 */
public class BQCaseAnalysisRetrieveOutputModel   {
  private BQCaseAnalysisRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceRecord caseAnalysisInstanceRecord = null;

  private String caseAnalysisRetrieveActionTaskReference = null;

  private Object caseAnalysisRetrieveActionTaskRecord = null;

  private String caseAnalysisRetrieveActionResponse = null;

  private BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceReport caseAnalysisInstanceReport = null;

  private BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceAnalysis caseAnalysisInstanceAnalysis = null;


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public BQCaseAnalysisRetrieveOutputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(BQCaseAnalysisRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Case Analysis instance retrieve service call 
   * @return caseAnalysisRetrieveActionTaskReference
  **/

  public String getCaseAnalysisRetrieveActionTaskReference() {
    return caseAnalysisRetrieveActionTaskReference;
  }

  public void setCaseAnalysisRetrieveActionTaskReference(String caseAnalysisRetrieveActionTaskReference) {
    this.caseAnalysisRetrieveActionTaskReference = caseAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return caseAnalysisRetrieveActionResponse
  **/

  public String getCaseAnalysisRetrieveActionResponse() {
    return caseAnalysisRetrieveActionResponse;
  }

  public void setCaseAnalysisRetrieveActionResponse(String caseAnalysisRetrieveActionResponse) {
    this.caseAnalysisRetrieveActionResponse = caseAnalysisRetrieveActionResponse;
  }


  /**
   * Get caseAnalysisInstanceReport
   * @return caseAnalysisInstanceReport
  **/

  public BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceReport getCaseAnalysisInstanceReport() {
    return caseAnalysisInstanceReport;
  }

  public void setCaseAnalysisInstanceReport(BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceReport caseAnalysisInstanceReport) {
    this.caseAnalysisInstanceReport = caseAnalysisInstanceReport;
  }


  /**
   * Get caseAnalysisInstanceAnalysis
   * @return caseAnalysisInstanceAnalysis
  **/

  public BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceAnalysis getCaseAnalysisInstanceAnalysis() {
    return caseAnalysisInstanceAnalysis;
  }

  public void setCaseAnalysisInstanceAnalysis(BQCaseAnalysisRetrieveOutputModelCaseAnalysisInstanceAnalysis caseAnalysisInstanceAnalysis) {
    this.caseAnalysisInstanceAnalysis = caseAnalysisInstanceAnalysis;
  }


}

