package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionInitiateOutputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionInitiateOutputModel
 */
public class CRFraudResolutionInitiateOutputModel   {
  private String fraudResolutionInstanceReference = null;

  private String fraudResolutionInitiateActionReference = null;

  private Object fraudResolutionInitiateActionRecord = null;

  private String fraudResolutionInstanceStatus = null;

  private CRFraudResolutionInitiateOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return fraudResolutionInitiateActionReference
  **/

  public String getFraudResolutionInitiateActionReference() {
    return fraudResolutionInitiateActionReference;
  }

  public void setFraudResolutionInitiateActionReference(String fraudResolutionInitiateActionReference) {
    this.fraudResolutionInitiateActionReference = fraudResolutionInitiateActionReference;
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

  public CRFraudResolutionInitiateOutputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(CRFraudResolutionInitiateOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


}

