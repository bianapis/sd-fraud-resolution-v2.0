package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionProcedureInitiateOutputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureInitiateOutputModel
 */
public class CRFraudResolutionProcedureInitiateOutputModel   {
  private String fraudResolutionProcedureInstanceReference = null;

  private String fraudResolutionProcedureInitiateActionReference = null;

  private Object fraudResolutionProcedureInitiateActionRecord = null;

  private String fraudResolutionProcedureInstanceStatus = null;

  private CRFraudResolutionProcedureInitiateOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return fraudResolutionProcedureInitiateActionReference
  **/

  public String getFraudResolutionProcedureInitiateActionReference() {
    return fraudResolutionProcedureInitiateActionReference;
  }

  public void setFraudResolutionProcedureInitiateActionReference(String fraudResolutionProcedureInitiateActionReference) {
    this.fraudResolutionProcedureInitiateActionReference = fraudResolutionProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return fraudResolutionProcedureInitiateActionRecord
  **/

  public Object getFraudResolutionProcedureInitiateActionRecord() {
    return fraudResolutionProcedureInitiateActionRecord;
  }

  public void setFraudResolutionProcedureInitiateActionRecord(Object fraudResolutionProcedureInitiateActionRecord) {
    this.fraudResolutionProcedureInitiateActionRecord = fraudResolutionProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Fraud Resolution Procedure instance (e.g. initialised, pending, active) 
   * @return fraudResolutionProcedureInstanceStatus
  **/

  public String getFraudResolutionProcedureInstanceStatus() {
    return fraudResolutionProcedureInstanceStatus;
  }

  public void setFraudResolutionProcedureInstanceStatus(String fraudResolutionProcedureInstanceStatus) {
    this.fraudResolutionProcedureInstanceStatus = fraudResolutionProcedureInstanceStatus;
  }


  /**
   * Get fraudResolutionInstanceRecord
   * @return fraudResolutionInstanceRecord
  **/

  public CRFraudResolutionProcedureInitiateOutputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(CRFraudResolutionProcedureInitiateOutputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


}

