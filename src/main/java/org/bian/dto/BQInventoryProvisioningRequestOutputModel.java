package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryProvisioningRequestOutputModel
 */
public class BQInventoryProvisioningRequestOutputModel   {
  private String inventoryDistributionOversightPreconditions = null;

  private String inventoryDistributionOversightBusinessUnitEmployeeReference = null;

  private String inventoryDistributionOversightWorkSchedule = null;

  private String inventoryDistributionOversightPostconditions = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceType = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceDescription = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct = null;

  private String inventoryDistributionOversightInventoryDistributionOversightServiceName = null;

  private String inventoryProvisioningRequestActionTaskReference = null;

  private Object inventoryProvisioningRequestActionTaskRecord = null;

  private String inventoryProvisioningRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inventory Provisioning instance request service call 
   * @return inventoryProvisioningRequestActionTaskReference
  **/

  public String getInventoryProvisioningRequestActionTaskReference() {
    return inventoryProvisioningRequestActionTaskReference;
  }

  public void setInventoryProvisioningRequestActionTaskReference(String inventoryProvisioningRequestActionTaskReference) {
    this.inventoryProvisioningRequestActionTaskReference = inventoryProvisioningRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return inventoryProvisioningRequestActionTaskRecord
  **/

  public Object getInventoryProvisioningRequestActionTaskRecord() {
    return inventoryProvisioningRequestActionTaskRecord;
  }

  public void setInventoryProvisioningRequestActionTaskRecord(Object inventoryProvisioningRequestActionTaskRecord) {
    this.inventoryProvisioningRequestActionTaskRecord = inventoryProvisioningRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inventory Provisioning service request record 
   * @return inventoryProvisioningRequestRecordReference
  **/

  public String getInventoryProvisioningRequestRecordReference() {
    return inventoryProvisioningRequestRecordReference;
  }

  public void setInventoryProvisioningRequestRecordReference(String inventoryProvisioningRequestRecordReference) {
    this.inventoryProvisioningRequestRecordReference = inventoryProvisioningRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

