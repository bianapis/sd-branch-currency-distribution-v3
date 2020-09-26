package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryProvisioningUpdateOutputModel
 */
public class BQInventoryProvisioningUpdateOutputModel   {
  private String inventoryDistributionOversightPreconditions = null;

  private String inventoryDistributionOversightBusinessUnitEmployeeReference = null;

  private String inventoryDistributionOversightWorkSchedule = null;

  private String inventoryDistributionOversightPostconditions = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceType = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceDescription = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceName = null;

  private String inventoryProvisioningUpdateActionTaskReference = null;

  private Object inventoryProvisioningUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return inventoryDistributionOversightPreconditions
  **/

  public String getInventoryDistributionOversightPreconditions() {
    return inventoryDistributionOversightPreconditions;
  }

  public void setInventoryDistributionOversightPreconditions(String inventoryDistributionOversightPreconditions) {
    this.inventoryDistributionOversightPreconditions = inventoryDistributionOversightPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return inventoryDistributionOversightBusinessUnitEmployeeReference
  **/

  public String getInventoryDistributionOversightBusinessUnitEmployeeReference() {
    return inventoryDistributionOversightBusinessUnitEmployeeReference;
  }

  public void setInventoryDistributionOversightBusinessUnitEmployeeReference(String inventoryDistributionOversightBusinessUnitEmployeeReference) {
    this.inventoryDistributionOversightBusinessUnitEmployeeReference = inventoryDistributionOversightBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return inventoryDistributionOversightWorkSchedule
  **/

  public String getInventoryDistributionOversightWorkSchedule() {
    return inventoryDistributionOversightWorkSchedule;
  }

  public void setInventoryDistributionOversightWorkSchedule(String inventoryDistributionOversightWorkSchedule) {
    this.inventoryDistributionOversightWorkSchedule = inventoryDistributionOversightWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return inventoryDistributionOversightPostconditions
  **/

  public String getInventoryDistributionOversightPostconditions() {
    return inventoryDistributionOversightPostconditions;
  }

  public void setInventoryDistributionOversightPostconditions(String inventoryDistributionOversightPostconditions) {
    this.inventoryDistributionOversightPostconditions = inventoryDistributionOversightPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return inventoryDistributionOversightInventoryDistributionOversightServiceType
  **/

  public String getInventoryDistributionOversightInventoryDistributionOversightServiceType() {
    return inventoryDistributionOversightInventoryDistributionOversightServiceType;
  }

  public void setInventoryDistributionOversightInventoryDistributionOversightServiceType(String inventoryDistributionOversightInventoryDistributionOversightServiceType) {
    this.inventoryDistributionOversightInventoryDistributionOversightServiceType = inventoryDistributionOversightInventoryDistributionOversightServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return inventoryDistributionOversightInventoryDistributionOversightServiceDescription
  **/

  public String getInventoryDistributionOversightInventoryDistributionOversightServiceDescription() {
    return inventoryDistributionOversightInventoryDistributionOversightServiceDescription;
  }

  public void setInventoryDistributionOversightInventoryDistributionOversightServiceDescription(String inventoryDistributionOversightInventoryDistributionOversightServiceDescription) {
    this.inventoryDistributionOversightInventoryDistributionOversightServiceDescription = inventoryDistributionOversightInventoryDistributionOversightServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs
  **/

  public String getInventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs() {
    return inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs;
  }

  public void setInventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs(String inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs) {
    this.inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs = inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct
  **/

  public String getInventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct() {
    return inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct;
  }

  public void setInventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct(String inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct) {
    this.inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct = inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return inventoryDistributionOversightInventoryDistributionOversightServiceName
  **/

  public String getInventoryDistributionOversightInventoryDistributionOversightServiceName() {
    return inventoryDistributionOversightInventoryDistributionOversightServiceName;
  }

  public void setInventoryDistributionOversightInventoryDistributionOversightServiceName(String inventoryDistributionOversightInventoryDistributionOversightServiceName) {
    this.inventoryDistributionOversightInventoryDistributionOversightServiceName = inventoryDistributionOversightInventoryDistributionOversightServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return inventoryProvisioningUpdateActionTaskReference
  **/

  public String getInventoryProvisioningUpdateActionTaskReference() {
    return inventoryProvisioningUpdateActionTaskReference;
  }

  public void setInventoryProvisioningUpdateActionTaskReference(String inventoryProvisioningUpdateActionTaskReference) {
    this.inventoryProvisioningUpdateActionTaskReference = inventoryProvisioningUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return inventoryProvisioningUpdateActionTaskRecord
  **/

  public Object getInventoryProvisioningUpdateActionTaskRecord() {
    return inventoryProvisioningUpdateActionTaskRecord;
  }

  public void setInventoryProvisioningUpdateActionTaskRecord(Object inventoryProvisioningUpdateActionTaskRecord) {
    this.inventoryProvisioningUpdateActionTaskRecord = inventoryProvisioningUpdateActionTaskRecord;
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

