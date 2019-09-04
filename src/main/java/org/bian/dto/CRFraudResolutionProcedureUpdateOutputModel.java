package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionProcedureUpdateInputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionProcedureUpdateOutputModel
 */
public class CRFraudResolutionProcedureUpdateOutputModel   {
  private CRFraudResolutionProcedureUpdateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private String fraudResolutionProcedureUpdateActionTaskReference = null;

  private Object fraudResolutionProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return fraudResolutionProcedureUpdateActionTaskReference
  **/

  public String getFraudResolutionProcedureUpdateActionTaskReference() {
    return fraudResolutionProcedureUpdateActionTaskReference;
  }

  public void setFraudResolutionProcedureUpdateActionTaskReference(String fraudResolutionProcedureUpdateActionTaskReference) {
    this.fraudResolutionProcedureUpdateActionTaskReference = fraudResolutionProcedureUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

