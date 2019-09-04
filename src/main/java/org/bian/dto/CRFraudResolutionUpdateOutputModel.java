package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudResolutionUpdateInputModelFraudResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionUpdateOutputModel
 */
public class CRFraudResolutionUpdateOutputModel   {
  private CRFraudResolutionUpdateInputModelFraudResolutionInstanceRecord fraudResolutionInstanceRecord = null;

  private String fraudResolutionUpdateActionTaskReference = null;

  private Object fraudResolutionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return fraudResolutionUpdateActionTaskReference
  **/

  public String getFraudResolutionUpdateActionTaskReference() {
    return fraudResolutionUpdateActionTaskReference;
  }

  public void setFraudResolutionUpdateActionTaskReference(String fraudResolutionUpdateActionTaskReference) {
    this.fraudResolutionUpdateActionTaskReference = fraudResolutionUpdateActionTaskReference;
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

