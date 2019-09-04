package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionProcedureInitiateInputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureInitiateInputModel
 */
public class CRFraudResolutionProcedureInitiateInputModel   {
  private String fraudResolutionServicingSessionReference = null;

  private Object fraudResolutionProcedureInitiateActionRecord = null;

  private String fraudResolutionProcedureInstanceStatus = null;

  private CRFraudResolutionProcedureInitiateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;


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

  public CRFraudResolutionProcedureInitiateInputModelFraudResolutionInstanceRecord getFraudResolutionInstanceRecord() {
    return fraudResolutionInstanceRecord;
  }

  public void setFraudResolutionInstanceRecord(CRFraudResolutionProcedureInitiateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord) {
    this.fraudResolutionInstanceRecord = fraudResolutionInstanceRecord;
  }


}

