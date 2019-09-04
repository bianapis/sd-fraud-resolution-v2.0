package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionUpdateInputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionUpdateInputModel
 */
public class CRFraudResolutionUpdateInputModel   {
  private String fraudResolutionServicingSessionReference = null;

  private String fraudResolutionInstanceReference = null;

  private CRFraudResolutionUpdateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private Object fraudResolutionUpdateActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud Resolution instance 
   * @return fraudResolutionInstanceReference
  **/

  public String getFraudResolutionInstanceReference() {
    return fraudResolutionInstanceReference;
  }

  public void setFraudResolutionInstanceReference(String fraudResolutionInstanceReference) {
    this.fraudResolutionInstanceReference = fraudResolutionInstanceReference;
  }


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public CRFraudResolutionUpdateInputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(CRFraudResolutionUpdateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return fraudResolutionUpdateActionTaskRecord
  **/

  public Object getFraudResolutionUpdateActionTaskRecord() {
    return fraudResolutionUpdateActionTaskRecord;
  }

  public void setFraudResolutionUpdateActionTaskRecord(Object fraudResolutionUpdateActionTaskRecord) {
    this.fraudResolutionUpdateActionTaskRecord = fraudResolutionUpdateActionTaskRecord;
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

