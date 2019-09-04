package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceAnalysis;
import org.bian.dto.CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceRecord;
import org.bian.dto.CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionRetrieveOutputModel
 */
public class CRFraudResolutionRetrieveOutputModel   {
  private CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private String fraudResolutionRetrieveActionTaskReference = null;

  private Object fraudResolutionRetrieveActionTaskRecord = null;

  private String fraudResolutionRetrieveActionResponse = null;

  private CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceReportRecord fraudResolutionInstanceReportRecord = null;

  private CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceAnalysis fraudResolutionInstanceAnalysis = null;


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Resolution instance retrieve service call 
   * @return fraudResolutionRetrieveActionTaskReference
  **/

  public String getFraudResolutionRetrieveActionTaskReference() {
    return fraudResolutionRetrieveActionTaskReference;
  }

  public void setFraudResolutionRetrieveActionTaskReference(String fraudResolutionRetrieveActionTaskReference) {
    this.fraudResolutionRetrieveActionTaskReference = fraudResolutionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fraudResolutionRetrieveActionResponse
  **/

  public String getFraudResolutionRetrieveActionResponse() {
    return fraudResolutionRetrieveActionResponse;
  }

  public void setFraudResolutionRetrieveActionResponse(String fraudResolutionRetrieveActionResponse) {
    this.fraudResolutionRetrieveActionResponse = fraudResolutionRetrieveActionResponse;
  }


  /**
   * Get fraudResolutionInstanceReportRecord
   * @return fraudResolutionInstanceReportRecord
  **/

  public CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceReportRecord getFraudResolutionInstanceReportRecord() {
    return fraudResolutionInstanceReportRecord;
  }

  public void setFraudResolutionInstanceReportRecord(CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceReportRecord fraudResolutionInstanceReportRecord) {
    this.fraudResolutionInstanceReportRecord = fraudResolutionInstanceReportRecord;
  }


  /**
   * Get fraudResolutionInstanceAnalysis
   * @return fraudResolutionInstanceAnalysis
  **/

  public CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceAnalysis getFraudResolutionInstanceAnalysis() {
    return fraudResolutionInstanceAnalysis;
  }

  public void setFraudResolutionInstanceAnalysis(CRFraudResolutionRetrieveOutputModelFraudResolutionInstanceAnalysis fraudResolutionInstanceAnalysis) {
    this.fraudResolutionInstanceAnalysis = fraudResolutionInstanceAnalysis;
  }


}

