package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudResolutionInitiateOutputModelFraudResolutionInstanceRecord
 */
public class CRFraudResolutionInitiateOutputModelFraudResolutionInstanceRecord   {
  private String fraudCaseType = null;

  private String fraudCaseWorkProducts = null;

  private String fraudCaseResolutionSchedule = null;

  private String fraudCaseStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Type of case (e.g. disputed charge, merchant fraud, stolen/fake device) 
   * @return fraudCaseType
  **/

  public String getFraudCaseType() {
    return fraudCaseType;
  }

  public void setFraudCaseType(String fraudCaseType) {
    this.fraudCaseType = fraudCaseType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the case 
   * @return fraudCaseWorkProducts
  **/

  public String getFraudCaseWorkProducts() {
    return fraudCaseWorkProducts;
  }

  public void setFraudCaseWorkProducts(String fraudCaseWorkProducts) {
    this.fraudCaseWorkProducts = fraudCaseWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target and actual dates for case processing/resolution 
   * @return fraudCaseResolutionSchedule
  **/

  public String getFraudCaseResolutionSchedule() {
    return fraudCaseResolutionSchedule;
  }

  public void setFraudCaseResolutionSchedule(String fraudCaseResolutionSchedule) {
    this.fraudCaseResolutionSchedule = fraudCaseResolutionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing status for the case 
   * @return fraudCaseStatus
  **/

  public String getFraudCaseStatus() {
    return fraudCaseStatus;
  }

  public void setFraudCaseStatus(String fraudCaseStatus) {
    this.fraudCaseStatus = fraudCaseStatus;
  }


}

