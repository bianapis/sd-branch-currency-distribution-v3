package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashDistributionProcedureControlOutputModel
 */
public class CRCashDistributionProcedureControlOutputModel   {
  private String cashDistributionProcedureParameterType = null;

  private String cashDistributionProcedureSelectedOption = null;

  private String cashDistributionProcedureRequest = null;

  private String cashDistributionProcedureSchedule = null;

  private String cashDistributionProcedureStatus = null;

  private String cashDistributionProcedureControlActionTaskReference = null;

  private Object cashDistributionProcedureControlActionTaskRecord = null;

  private String cashDistributionProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Cash Distribution Procedure 
   * @return cashDistributionProcedureParameterType
  **/

  public String getCashDistributionProcedureParameterType() {
    return cashDistributionProcedureParameterType;
  }

  public void setCashDistributionProcedureParameterType(String cashDistributionProcedureParameterType) {
    this.cashDistributionProcedureParameterType = cashDistributionProcedureParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Cash Distribution Procedure 
   * @return cashDistributionProcedureSelectedOption
  **/

  public String getCashDistributionProcedureSelectedOption() {
    return cashDistributionProcedureSelectedOption;
  }

  public void setCashDistributionProcedureSelectedOption(String cashDistributionProcedureSelectedOption) {
    this.cashDistributionProcedureSelectedOption = cashDistributionProcedureSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to process CashDistribution 
   * @return cashDistributionProcedureRequest
  **/

  public String getCashDistributionProcedureRequest() {
    return cashDistributionProcedureRequest;
  }

  public void setCashDistributionProcedureRequest(String cashDistributionProcedureRequest) {
    this.cashDistributionProcedureRequest = cashDistributionProcedureRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to process CashDistribution 
   * @return cashDistributionProcedureSchedule
  **/

  public String getCashDistributionProcedureSchedule() {
    return cashDistributionProcedureSchedule;
  }

  public void setCashDistributionProcedureSchedule(String cashDistributionProcedureSchedule) {
    this.cashDistributionProcedureSchedule = cashDistributionProcedureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Cash Distribution Procedure 
   * @return cashDistributionProcedureStatus
  **/

  public String getCashDistributionProcedureStatus() {
    return cashDistributionProcedureStatus;
  }

  public void setCashDistributionProcedureStatus(String cashDistributionProcedureStatus) {
    this.cashDistributionProcedureStatus = cashDistributionProcedureStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cash Distribution Procedure instance control processing service call 
   * @return cashDistributionProcedureControlActionTaskReference
  **/

  public String getCashDistributionProcedureControlActionTaskReference() {
    return cashDistributionProcedureControlActionTaskReference;
  }

  public void setCashDistributionProcedureControlActionTaskReference(String cashDistributionProcedureControlActionTaskReference) {
    this.cashDistributionProcedureControlActionTaskReference = cashDistributionProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return cashDistributionProcedureControlActionTaskRecord
  **/

  public Object getCashDistributionProcedureControlActionTaskRecord() {
    return cashDistributionProcedureControlActionTaskRecord;
  }

  public void setCashDistributionProcedureControlActionTaskRecord(Object cashDistributionProcedureControlActionTaskRecord) {
    this.cashDistributionProcedureControlActionTaskRecord = cashDistributionProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return cashDistributionProcedureControlActionResponse
  **/

  public String getCashDistributionProcedureControlActionResponse() {
    return cashDistributionProcedureControlActionResponse;
  }

  public void setCashDistributionProcedureControlActionResponse(String cashDistributionProcedureControlActionResponse) {
    this.cashDistributionProcedureControlActionResponse = cashDistributionProcedureControlActionResponse;
  }


}

