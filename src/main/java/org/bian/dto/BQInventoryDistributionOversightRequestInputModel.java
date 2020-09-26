package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashDistributionProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQInventoryDistributionOversightRequestInputModel
 */
public class BQInventoryDistributionOversightRequestInputModel   {
  private String cashDistributionProcedureInstanceReference = null;

  private String inventoryDistributionOversightInstanceReference = null;

  private Object inventoryDistributionOversightRequestActionTaskRecord = null;

  private CRCashDistributionProcedureRequestInputModelRequestRecordType requestRecordType = null;

  private String distributionVehicleAdministrationPreconditions = null;

  private String distributionVehicleAdministrationBusinessUnitEmployeeReference = null;

  private String distributionVehicleAdministrationWorkSchedule = null;

  private String distributionVehicleAdministrationPostconditions = null;

  private String distributionVehicleAdministrationVehicleAdministrationServiceType = null;

  private String distributionVehicleAdministrationVehicleAdministrationServiceDescription = null;

  private String distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs = null;

  private String distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct = null;

  private String distributionVehicleAdministrationVehicleAdministrationServiceName = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inventory Distribution Oversight instance 
   * @return inventoryDistributionOversightInstanceReference
  **/

  public String getInventoryDistributionOversightInstanceReference() {
    return inventoryDistributionOversightInstanceReference;
  }

  public void setInventoryDistributionOversightInstanceReference(String inventoryDistributionOversightInstanceReference) {
    this.inventoryDistributionOversightInstanceReference = inventoryDistributionOversightInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return inventoryDistributionOversightRequestActionTaskRecord
  **/

  public Object getInventoryDistributionOversightRequestActionTaskRecord() {
    return inventoryDistributionOversightRequestActionTaskRecord;
  }

  public void setInventoryDistributionOversightRequestActionTaskRecord(Object inventoryDistributionOversightRequestActionTaskRecord) {
    this.inventoryDistributionOversightRequestActionTaskRecord = inventoryDistributionOversightRequestActionTaskRecord;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return distributionVehicleAdministrationPreconditions
  **/

  public String getDistributionVehicleAdministrationPreconditions() {
    return distributionVehicleAdministrationPreconditions;
  }

  public void setDistributionVehicleAdministrationPreconditions(String distributionVehicleAdministrationPreconditions) {
    this.distributionVehicleAdministrationPreconditions = distributionVehicleAdministrationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return distributionVehicleAdministrationBusinessUnitEmployeeReference
  **/

  public String getDistributionVehicleAdministrationBusinessUnitEmployeeReference() {
    return distributionVehicleAdministrationBusinessUnitEmployeeReference;
  }

  public void setDistributionVehicleAdministrationBusinessUnitEmployeeReference(String distributionVehicleAdministrationBusinessUnitEmployeeReference) {
    this.distributionVehicleAdministrationBusinessUnitEmployeeReference = distributionVehicleAdministrationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return distributionVehicleAdministrationWorkSchedule
  **/

  public String getDistributionVehicleAdministrationWorkSchedule() {
    return distributionVehicleAdministrationWorkSchedule;
  }

  public void setDistributionVehicleAdministrationWorkSchedule(String distributionVehicleAdministrationWorkSchedule) {
    this.distributionVehicleAdministrationWorkSchedule = distributionVehicleAdministrationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return distributionVehicleAdministrationPostconditions
  **/

  public String getDistributionVehicleAdministrationPostconditions() {
    return distributionVehicleAdministrationPostconditions;
  }

  public void setDistributionVehicleAdministrationPostconditions(String distributionVehicleAdministrationPostconditions) {
    this.distributionVehicleAdministrationPostconditions = distributionVehicleAdministrationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return distributionVehicleAdministrationVehicleAdministrationServiceType
  **/

  public String getDistributionVehicleAdministrationVehicleAdministrationServiceType() {
    return distributionVehicleAdministrationVehicleAdministrationServiceType;
  }

  public void setDistributionVehicleAdministrationVehicleAdministrationServiceType(String distributionVehicleAdministrationVehicleAdministrationServiceType) {
    this.distributionVehicleAdministrationVehicleAdministrationServiceType = distributionVehicleAdministrationVehicleAdministrationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return distributionVehicleAdministrationVehicleAdministrationServiceDescription
  **/

  public String getDistributionVehicleAdministrationVehicleAdministrationServiceDescription() {
    return distributionVehicleAdministrationVehicleAdministrationServiceDescription;
  }

  public void setDistributionVehicleAdministrationVehicleAdministrationServiceDescription(String distributionVehicleAdministrationVehicleAdministrationServiceDescription) {
    this.distributionVehicleAdministrationVehicleAdministrationServiceDescription = distributionVehicleAdministrationVehicleAdministrationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs
  **/

  public String getDistributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs() {
    return distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs;
  }

  public void setDistributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs(String distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs) {
    this.distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs = distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct
  **/

  public String getDistributionVehicleAdministrationVehicleAdministrationServiceWorkProduct() {
    return distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct;
  }

  public void setDistributionVehicleAdministrationVehicleAdministrationServiceWorkProduct(String distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct) {
    this.distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct = distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return distributionVehicleAdministrationVehicleAdministrationServiceName
  **/

  public String getDistributionVehicleAdministrationVehicleAdministrationServiceName() {
    return distributionVehicleAdministrationVehicleAdministrationServiceName;
  }

  public void setDistributionVehicleAdministrationVehicleAdministrationServiceName(String distributionVehicleAdministrationVehicleAdministrationServiceName) {
    this.distributionVehicleAdministrationVehicleAdministrationServiceName = distributionVehicleAdministrationVehicleAdministrationServiceName;
  }


}

