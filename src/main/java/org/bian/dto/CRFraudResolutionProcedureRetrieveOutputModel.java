package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionInstanceRecord;
import org.bian.dto.CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceAnalysis;
import org.bian.dto.CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureRetrieveOutputModel
 */
public class CRFraudResolutionProcedureRetrieveOutputModel   {
  private CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private String fraudResolutionProcedureRetrieveActionTaskReference = null;

  private Object fraudResolutionProcedureRetrieveActionTaskRecord = null;

  private String fraudResolutionProcedureRetrieveActionResponse = null;

  private CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceReportRecord fraudResolutionProcedureInstanceReportRecord = null;

  private CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceAnalysis fraudResolutionProcedureInstanceAnalysis = null;


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Resolution Procedure instance retrieve service call 
   * @return fraudResolutionProcedureRetrieveActionTaskReference
  **/

  public String getFraudResolutionProcedureRetrieveActionTaskReference() {
    return fraudResolutionProcedureRetrieveActionTaskReference;
  }

  public void setFraudResolutionProcedureRetrieveActionTaskReference(String fraudResolutionProcedureRetrieveActionTaskReference) {
    this.fraudResolutionProcedureRetrieveActionTaskReference = fraudResolutionProcedureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fraudResolutionProcedureRetrieveActionResponse
  **/

  public String getFraudResolutionProcedureRetrieveActionResponse() {
    return fraudResolutionProcedureRetrieveActionResponse;
  }

  public void setFraudResolutionProcedureRetrieveActionResponse(String fraudResolutionProcedureRetrieveActionResponse) {
    this.fraudResolutionProcedureRetrieveActionResponse = fraudResolutionProcedureRetrieveActionResponse;
  }


  /**
   * Get fraudResolutionProcedureInstanceReportRecord
   * @return fraudResolutionProcedureInstanceReportRecord
  **/

  public CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceReportRecord getFraudResolutionProcedureInstanceReportRecord() {
    return fraudResolutionProcedureInstanceReportRecord;
  }

  public void setFraudResolutionProcedureInstanceReportRecord(CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceReportRecord fraudResolutionProcedureInstanceReportRecord) {
    this.fraudResolutionProcedureInstanceReportRecord = fraudResolutionProcedureInstanceReportRecord;
  }


  /**
   * Get fraudResolutionProcedureInstanceAnalysis
   * @return fraudResolutionProcedureInstanceAnalysis
  **/

  public CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceAnalysis getFraudResolutionProcedureInstanceAnalysis() {
    return fraudResolutionProcedureInstanceAnalysis;
  }

  public void setFraudResolutionProcedureInstanceAnalysis(CRFraudResolutionProcedureRetrieveOutputModelFraudResolutionProcedureInstanceAnalysis fraudResolutionProcedureInstanceAnalysis) {
    this.fraudResolutionProcedureInstanceAnalysis = fraudResolutionProcedureInstanceAnalysis;
  }


}

