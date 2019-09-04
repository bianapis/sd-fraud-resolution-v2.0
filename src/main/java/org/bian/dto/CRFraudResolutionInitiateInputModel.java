package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionInitiateInputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionInitiateInputModel
 */
public class CRFraudResolutionInitiateInputModel   {
  private String fraudResolutionServicingSessionReference = null;

  private Object fraudResolutionInitiateActionRecord = null;

  private String fraudResolutionInstanceStatus = null;

  private CRFraudResolutionInitiateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return fraudResolutionInitiateActionRecord
  **/

  public Object getFraudResolutionInitiateActionRecord() {
    return fraudResolutionInitiateActionRecord;
  }

  public void setFraudResolutionInitiateActionRecord(Object fraudResolutionInitiateActionRecord) {
    this.fraudResolutionInitiateActionRecord = fraudResolutionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Fraud Resolution instance (e.g. initialised, pending, active) 
   * @return fraudResolutionInstanceStatus
  **/

  public String getFraudResolutionInstanceStatus() {
    return fraudResolutionInstanceStatus;
  }

  public void setFraudResolutionInstanceStatus(String fraudResolutionInstanceStatus) {
    this.fraudResolutionInstanceStatus = fraudResolutionInstanceStatus;
  }


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public CRFraudResolutionInitiateInputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(CRFraudResolutionInitiateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


}

