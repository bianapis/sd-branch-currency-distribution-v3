package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashDistributionProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCashDistributionProcedureExecuteInputModel
 */
public class CRCashDistributionProcedureExecuteInputModel   {
  private String branchCurrencyDistributionServicingSessionReference = null;

  private String cashDistributionProcedureInstanceReference = null;

  private String cashDistributionProcedureParameterType = null;

  private String cashDistributionProcedureSelectedOption = null;

  private String cashDistributionProcedureRequest = null;

  private String cashDistributionProcedureSchedule = null;

  private String cashDistributionProcedureStatus = null;

  private String cashDistributionProcedureReference = null;

  private String cashDistributionProcedureBusinessUnitReference = null;

  private String cashDistributionProcedureServiceProviderReference = null;

  private String cashDistributionProcedureFinancialFacilityReference = null;

  private String cashDistributionProcedureEmployeeReference = null;

  private String cashDistributionProcedureCustomerReference = null;

  private String cashDistributionProcedureType = null;

  private String cashDistributionProcedureServiceProviderSchedule = null;

  private String cashDistributionProcedureServiceType = null;

  private String cashDistributionProcedureProductandServiceType = null;

  private String cashDistributionProcedureProductandServiceInstance = null;

  private String cashDistributionProcedureTransactionType = null;

  private String cashDistributionProcedureFinancialTransactionArrangement = null;

  private String cashDistributionProcedureCustomerAgreementReference = null;

  private Object cashDistributionProcedureExecuteActionTaskRecord = null;

  private CRCashDistributionProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return branchCurrencyDistributionServicingSessionReference
  **/

  public String getBranchCurrencyDistributionServicingSessionReference() {
    return branchCurrencyDistributionServicingSessionReference;
  }

  public void setBranchCurrencyDistributionServicingSessionReference(String branchCurrencyDistributionServicingSessionReference) {
    this.branchCurrencyDistributionServicingSessionReference = branchCurrencyDistributionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cash Distribution Procedure instance 
   * @return cashDistributionProcedureInstanceReference
  **/

  public String getCashDistributionProcedureInstanceReference() {
    return cashDistributionProcedureInstanceReference;
  }

  public void setCashDistributionProcedureInstanceReference(String cashDistributionProcedureInstanceReference) {
    this.cashDistributionProcedureInstanceReference = cashDistributionProcedureInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Cash Distribution Procedure 
   * @return cashDistributionProcedureReference
  **/

  public String getCashDistributionProcedureReference() {
    return cashDistributionProcedureReference;
  }

  public void setCashDistributionProcedureReference(String cashDistributionProcedureReference) {
    this.cashDistributionProcedureReference = cashDistributionProcedureReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit which is involved in Cash Distribution Procedure 
   * @return cashDistributionProcedureBusinessUnitReference
  **/

  public String getCashDistributionProcedureBusinessUnitReference() {
    return cashDistributionProcedureBusinessUnitReference;
  }

  public void setCashDistributionProcedureBusinessUnitReference(String cashDistributionProcedureBusinessUnitReference) {
    this.cashDistributionProcedureBusinessUnitReference = cashDistributionProcedureBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is the service provider of Cash Distribution Procedure 
   * @return cashDistributionProcedureServiceProviderReference
  **/

  public String getCashDistributionProcedureServiceProviderReference() {
    return cashDistributionProcedureServiceProviderReference;
  }

  public void setCashDistributionProcedureServiceProviderReference(String cashDistributionProcedureServiceProviderReference) {
    this.cashDistributionProcedureServiceProviderReference = cashDistributionProcedureServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Facility related to Cash Distribution Procedure  
   * @return cashDistributionProcedureFinancialFacilityReference
  **/

  public String getCashDistributionProcedureFinancialFacilityReference() {
    return cashDistributionProcedureFinancialFacilityReference;
  }

  public void setCashDistributionProcedureFinancialFacilityReference(String cashDistributionProcedureFinancialFacilityReference) {
    this.cashDistributionProcedureFinancialFacilityReference = cashDistributionProcedureFinancialFacilityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee who is involved in Cash Distribution Procedure 
   * @return cashDistributionProcedureEmployeeReference
  **/

  public String getCashDistributionProcedureEmployeeReference() {
    return cashDistributionProcedureEmployeeReference;
  }

  public void setCashDistributionProcedureEmployeeReference(String cashDistributionProcedureEmployeeReference) {
    this.cashDistributionProcedureEmployeeReference = cashDistributionProcedureEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Cash Distribution Procedure 
   * @return cashDistributionProcedureCustomerReference
  **/

  public String getCashDistributionProcedureCustomerReference() {
    return cashDistributionProcedureCustomerReference;
  }

  public void setCashDistributionProcedureCustomerReference(String cashDistributionProcedureCustomerReference) {
    this.cashDistributionProcedureCustomerReference = cashDistributionProcedureCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of process undertaken within Cash Distribution Procedure 
   * @return cashDistributionProcedureType
  **/

  public String getCashDistributionProcedureType() {
    return cashDistributionProcedureType;
  }

  public void setCashDistributionProcedureType(String cashDistributionProcedureType) {
    this.cashDistributionProcedureType = cashDistributionProcedureType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule according to which the service provider will process the Cash Distribution Procedure 
   * @return cashDistributionProcedureServiceProviderSchedule
  **/

  public String getCashDistributionProcedureServiceProviderSchedule() {
    return cashDistributionProcedureServiceProviderSchedule;
  }

  public void setCashDistributionProcedureServiceProviderSchedule(String cashDistributionProcedureServiceProviderSchedule) {
    this.cashDistributionProcedureServiceProviderSchedule = cashDistributionProcedureServiceProviderSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of services in Cash Distribution Procedure  
   * @return cashDistributionProcedureServiceType
  **/

  public String getCashDistributionProcedureServiceType() {
    return cashDistributionProcedureServiceType;
  }

  public void setCashDistributionProcedureServiceType(String cashDistributionProcedureServiceType) {
    this.cashDistributionProcedureServiceType = cashDistributionProcedureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of products/services related to Cash Distribution Procedure  
   * @return cashDistributionProcedureProductandServiceType
  **/

  public String getCashDistributionProcedureProductandServiceType() {
    return cashDistributionProcedureProductandServiceType;
  }

  public void setCashDistributionProcedureProductandServiceType(String cashDistributionProcedureProductandServiceType) {
    this.cashDistributionProcedureProductandServiceType = cashDistributionProcedureProductandServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the product or service that is related to Cash Distribution Procedure 
   * @return cashDistributionProcedureProductandServiceInstance
  **/

  public String getCashDistributionProcedureProductandServiceInstance() {
    return cashDistributionProcedureProductandServiceInstance;
  }

  public void setCashDistributionProcedureProductandServiceInstance(String cashDistributionProcedureProductandServiceInstance) {
    this.cashDistributionProcedureProductandServiceInstance = cashDistributionProcedureProductandServiceInstance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of transactions in Cash Distribution Procedure  
   * @return cashDistributionProcedureTransactionType
  **/

  public String getCashDistributionProcedureTransactionType() {
    return cashDistributionProcedureTransactionType;
  }

  public void setCashDistributionProcedureTransactionType(String cashDistributionProcedureTransactionType) {
    this.cashDistributionProcedureTransactionType = cashDistributionProcedureTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the Financial Transaction Arrangement that is related to Cash Distribution Procedure  
   * @return cashDistributionProcedureFinancialTransactionArrangement
  **/

  public String getCashDistributionProcedureFinancialTransactionArrangement() {
    return cashDistributionProcedureFinancialTransactionArrangement;
  }

  public void setCashDistributionProcedureFinancialTransactionArrangement(String cashDistributionProcedureFinancialTransactionArrangement) {
    this.cashDistributionProcedureFinancialTransactionArrangement = cashDistributionProcedureFinancialTransactionArrangement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Agreement that is related to Cash Distribution Procedure  
   * @return cashDistributionProcedureCustomerAgreementReference
  **/

  public String getCashDistributionProcedureCustomerAgreementReference() {
    return cashDistributionProcedureCustomerAgreementReference;
  }

  public void setCashDistributionProcedureCustomerAgreementReference(String cashDistributionProcedureCustomerAgreementReference) {
    this.cashDistributionProcedureCustomerAgreementReference = cashDistributionProcedureCustomerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return cashDistributionProcedureExecuteActionTaskRecord
  **/

  public Object getCashDistributionProcedureExecuteActionTaskRecord() {
    return cashDistributionProcedureExecuteActionTaskRecord;
  }

  public void setCashDistributionProcedureExecuteActionTaskRecord(Object cashDistributionProcedureExecuteActionTaskRecord) {
    this.cashDistributionProcedureExecuteActionTaskRecord = cashDistributionProcedureExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCashDistributionProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCashDistributionProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

