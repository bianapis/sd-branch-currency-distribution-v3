package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceAnalysis;
import org.bian.dto.BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInventoryProvisioningRetrieveOutputModel
 */
public class BQInventoryProvisioningRetrieveOutputModel   {
  private String inventoryProvisioningPreconditions = null;

  private String inventoryProvisioningBusinessUnitEmployeeReference = null;

  private String inventoryProvisioningWorkSchedule = null;

  private String inventoryProvisioningPostconditions = null;

  private String inventoryProvisioningInventoryProvisioningServiceType = null;

  private String inventoryProvisioningInventoryProvisioningServiceDescription = null;

  private String inventoryProvisioningInventoryProvisioningServiceInputsandOuputs = null;

  private String inventoryProvisioningInventoryProvisioningServiceWorkProduct = null;

  private String inventoryProvisioningRetrieveActionTaskReference = null;

  private Object inventoryProvisioningRetrieveActionTaskRecord = null;

  private String inventoryProvisioningRetrieveActionResponse = null;

  private BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceReport inventoryProvisioningInstanceReport = null;

  private BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceAnalysis inventoryProvisioningInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inventory Provisioning instance retrieve service call 
   * @return inventoryProvisioningRetrieveActionTaskReference
  **/

  public String getInventoryProvisioningRetrieveActionTaskReference() {
    return inventoryProvisioningRetrieveActionTaskReference;
  }

  public void setInventoryProvisioningRetrieveActionTaskReference(String inventoryProvisioningRetrieveActionTaskReference) {
    this.inventoryProvisioningRetrieveActionTaskReference = inventoryProvisioningRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inventoryProvisioningRetrieveActionTaskRecord
  **/

  public Object getInventoryProvisioningRetrieveActionTaskRecord() {
    return inventoryProvisioningRetrieveActionTaskRecord;
  }

  public void setInventoryProvisioningRetrieveActionTaskRecord(Object inventoryProvisioningRetrieveActionTaskRecord) {
    this.inventoryProvisioningRetrieveActionTaskRecord = inventoryProvisioningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return inventoryProvisioningRetrieveActionResponse
  **/

  public String getInventoryProvisioningRetrieveActionResponse() {
    return inventoryProvisioningRetrieveActionResponse;
  }

  public void setInventoryProvisioningRetrieveActionResponse(String inventoryProvisioningRetrieveActionResponse) {
    this.inventoryProvisioningRetrieveActionResponse = inventoryProvisioningRetrieveActionResponse;
  }


  /**
   * Get inventoryProvisioningInstanceReport
   * @return inventoryProvisioningInstanceReport
  **/

  public BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceReport getInventoryProvisioningInstanceReport() {
    return inventoryProvisioningInstanceReport;
  }

  public void setInventoryProvisioningInstanceReport(BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceReport inventoryProvisioningInstanceReport) {
    this.inventoryProvisioningInstanceReport = inventoryProvisioningInstanceReport;
  }


  /**
   * Get inventoryProvisioningInstanceAnalysis
   * @return inventoryProvisioningInstanceAnalysis
  **/

  public BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceAnalysis getInventoryProvisioningInstanceAnalysis() {
    return inventoryProvisioningInstanceAnalysis;
  }

  public void setInventoryProvisioningInstanceAnalysis(BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceAnalysis inventoryProvisioningInstanceAnalysis) {
    this.inventoryProvisioningInstanceAnalysis = inventoryProvisioningInstanceAnalysis;
  }


}

