package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashDistributionProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQDistributionVehicleAdministrationRequestInputModel
 */
public class BQDistributionVehicleAdministrationRequestInputModel   {
  private String inventoryProvisioningPreconditions = null;

  private String inventoryProvisioningBusinessUnitEmployeeReference = null;

  private String inventoryProvisioningWorkSchedule = null;

  private String inventoryProvisioningPostconditions = null;

  private String inventoryProvisioningInventoryProvisioningServiceType = null;

  private String inventoryProvisioningInventoryProvisioningServiceDescription = null;

  private String inventoryProvisioningInventoryProvisioningServiceInputsandOuputs = null;

  private String inventoryProvisioningInventoryProvisioningServiceWorkProduct = null;

  private String cashDistributionProcedureInstanceReference = null;

  private String distributionVehicleAdministrationInstanceReference = null;

  private Object distributionVehicleAdministrationRequestActionTaskRecord = null;

  private CRCashDistributionProcedureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return inventoryProvisioningPreconditions
  **/

  public String getInventoryProvisioningPreconditions() {
    return inventoryProvisioningPreconditions;
  }

  public void setInventoryProvisioningPreconditions(String inventoryProvisioningPreconditions) {
    this.inventoryProvisioningPreconditions = inventoryProvisioningPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return inventoryProvisioningBusinessUnitEmployeeReference
  **/

  public String getInventoryProvisioningBusinessUnitEmployeeReference() {
    return inventoryProvisioningBusinessUnitEmployeeReference;
  }

  public void setInventoryProvisioningBusinessUnitEmployeeReference(String inventoryProvisioningBusinessUnitEmployeeReference) {
    this.inventoryProvisioningBusinessUnitEmployeeReference = inventoryProvisioningBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return inventoryProvisioningWorkSchedule
  **/

  public String getInventoryProvisioningWorkSchedule() {
    return inventoryProvisioningWorkSchedule;
  }

  public void setInventoryProvisioningWorkSchedule(String inventoryProvisioningWorkSchedule) {
    this.inventoryProvisioningWorkSchedule = inventoryProvisioningWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return inventoryProvisioningPostconditions
  **/

  public String getInventoryProvisioningPostconditions() {
    return inventoryProvisioningPostconditions;
  }

  public void setInventoryProvisioningPostconditions(String inventoryProvisioningPostconditions) {
    this.inventoryProvisioningPostconditions = inventoryProvisioningPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return inventoryProvisioningInventoryProvisioningServiceType
  **/

  public String getInventoryProvisioningInventoryProvisioningServiceType() {
    return inventoryProvisioningInventoryProvisioningServiceType;
  }

  public void setInventoryProvisioningInventoryProvisioningServiceType(String inventoryProvisioningInventoryProvisioningServiceType) {
    this.inventoryProvisioningInventoryProvisioningServiceType = inventoryProvisioningInventoryProvisioningServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return inventoryProvisioningInventoryProvisioningServiceDescription
  **/

  public String getInventoryProvisioningInventoryProvisioningServiceDescription() {
    return inventoryProvisioningInventoryProvisioningServiceDescription;
  }

  public void setInventoryProvisioningInventoryProvisioningServiceDescription(String inventoryProvisioningInventoryProvisioningServiceDescription) {
    this.inventoryProvisioningInventoryProvisioningServiceDescription = inventoryProvisioningInventoryProvisioningServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return inventoryProvisioningInventoryProvisioningServiceInputsandOuputs
  **/

  public String getInventoryProvisioningInventoryProvisioningServiceInputsandOuputs() {
    return inventoryProvisioningInventoryProvisioningServiceInputsandOuputs;
  }

  public void setInventoryProvisioningInventoryProvisioningServiceInputsandOuputs(String inventoryProvisioningInventoryProvisioningServiceInputsandOuputs) {
    this.inventoryProvisioningInventoryProvisioningServiceInputsandOuputs = inventoryProvisioningInventoryProvisioningServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return inventoryProvisioningInventoryProvisioningServiceWorkProduct
  **/

  public String getInventoryProvisioningInventoryProvisioningServiceWorkProduct() {
    return inventoryProvisioningInventoryProvisioningServiceWorkProduct;
  }

  public void setInventoryProvisioningInventoryProvisioningServiceWorkProduct(String inventoryProvisioningInventoryProvisioningServiceWorkProduct) {
    this.inventoryProvisioningInventoryProvisioningServiceWorkProduct = inventoryProvisioningInventoryProvisioningServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Cash Distribution Procedure instance 
   * @return cashDistributionProcedureInstanceReference
  **/

  public String getCashDistributionProcedureInstanceReference() {
    return cashDistributionProcedureInstanceReference;
  }

  public void setCashDistributionProcedureInstanceReference(String cashDistributionProcedureInstanceReference) {
    this.cashDistributionProcedureInstanceReference = cashDistributionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Distribution Vehicle Administration instance 
   * @return distributionVehicleAdministrationInstanceReference
  **/

  public String getDistributionVehicleAdministrationInstanceReference() {
    return distributionVehicleAdministrationInstanceReference;
  }

  public void setDistributionVehicleAdministrationInstanceReference(String distributionVehicleAdministrationInstanceReference) {
    this.distributionVehicleAdministrationInstanceReference = distributionVehicleAdministrationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return distributionVehicleAdministrationRequestActionTaskRecord
  **/

  public Object getDistributionVehicleAdministrationRequestActionTaskRecord() {
    return distributionVehicleAdministrationRequestActionTaskRecord;
  }

  public void setDistributionVehicleAdministrationRequestActionTaskRecord(Object distributionVehicleAdministrationRequestActionTaskRecord) {
    this.distributionVehicleAdministrationRequestActionTaskRecord = distributionVehicleAdministrationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCashDistributionProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCashDistributionProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

