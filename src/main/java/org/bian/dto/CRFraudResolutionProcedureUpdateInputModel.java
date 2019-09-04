package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionProcedureUpdateInputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureUpdateInputModel
 */
public class CRFraudResolutionProcedureUpdateInputModel   {
  private String fraudResolutionServicingSessionReference = null;

  private String fraudResolutionProcedureInstanceReference = null;

  private CRFraudResolutionProcedureUpdateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private Object fraudResolutionProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return fraudResolutionServicingSessionReference
  **/

  public String getFraudResolutionServicingSessionReference() {
    return fraudResolutionServicingSessionReference;
  }

  public void setFraudResolutionServicingSessionReference(String fraudResolutionServicingSessionReference) {
    this.fraudResolutionServicingSessionReference = fraudResolutionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud Resolution Procedure instance 
   * @return fraudResolutionProcedureInstanceReference
  **/

  public String getFraudResolutionProcedureInstanceReference() {
    return fraudResolutionProcedureInstanceReference;
  }

  public void setFraudResolutionProcedureInstanceReference(String fraudResolutionProcedureInstanceReference) {
    this.fraudResolutionProcedureInstanceReference = fraudResolutionProcedureInstanceReference;
  }


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public CRFraudResolutionProcedureUpdateInputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(CRFraudResolutionProcedureUpdateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return fraudResolutionProcedureUpdateActionTaskRecord
  **/

  public Object getFraudResolutionProcedureUpdateActionTaskRecord() {
    return fraudResolutionProcedureUpdateActionTaskRecord;
  }

  public void setFraudResolutionProcedureUpdateActionTaskRecord(Object fraudResolutionProcedureUpdateActionTaskRecord) {
    this.fraudResolutionProcedureUpdateActionTaskRecord = fraudResolutionProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

