package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionPlanningUpdateOutputModel
 */
public class BQDistributionPlanningUpdateOutputModel   {
  private String distributionPlanningPreconditions = null;

  private String distributionPlanningBusinessUnitEmployeeReference = null;

  private String distributionPlanningWorkSchedule = null;

  private String distributionPlanningPostconditions = null;

  private String distributionPlanningDistributionPlanningServiceType = null;

  private String distributionPlanningDistributionPlanningServiceDescription = null;

  private String distributionPlanningDistributionPlanningServiceInputsandOuputs = null;

  private String distributionPlanningDistributionPlanningServiceWorkProduct = null;

  private String distributionPlanningDistributionPlanningServiceName = null;

  private String distributionPlanningUpdateActionTaskReference = null;

  private Object distributionPlanningUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return distributionPlanningPreconditions
  **/

  public String getDistributionPlanningPreconditions() {
    return distributionPlanningPreconditions;
  }

  public void setDistributionPlanningPreconditions(String distributionPlanningPreconditions) {
    this.distributionPlanningPreconditions = distributionPlanningPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return distributionPlanningBusinessUnitEmployeeReference
  **/

  public String getDistributionPlanningBusinessUnitEmployeeReference() {
    return distributionPlanningBusinessUnitEmployeeReference;
  }

  public void setDistributionPlanningBusinessUnitEmployeeReference(String distributionPlanningBusinessUnitEmployeeReference) {
    this.distributionPlanningBusinessUnitEmployeeReference = distributionPlanningBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return distributionPlanningWorkSchedule
  **/

  public String getDistributionPlanningWorkSchedule() {
    return distributionPlanningWorkSchedule;
  }

  public void setDistributionPlanningWorkSchedule(String distributionPlanningWorkSchedule) {
    this.distributionPlanningWorkSchedule = distributionPlanningWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return distributionPlanningPostconditions
  **/

  public String getDistributionPlanningPostconditions() {
    return distributionPlanningPostconditions;
  }

  public void setDistributionPlanningPostconditions(String distributionPlanningPostconditions) {
    this.distributionPlanningPostconditions = distributionPlanningPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return distributionPlanningDistributionPlanningServiceType
  **/

  public String getDistributionPlanningDistributionPlanningServiceType() {
    return distributionPlanningDistributionPlanningServiceType;
  }

  public void setDistributionPlanningDistributionPlanningServiceType(String distributionPlanningDistributionPlanningServiceType) {
    this.distributionPlanningDistributionPlanningServiceType = distributionPlanningDistributionPlanningServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return distributionPlanningDistributionPlanningServiceDescription
  **/

  public String getDistributionPlanningDistributionPlanningServiceDescription() {
    return distributionPlanningDistributionPlanningServiceDescription;
  }

  public void setDistributionPlanningDistributionPlanningServiceDescription(String distributionPlanningDistributionPlanningServiceDescription) {
    this.distributionPlanningDistributionPlanningServiceDescription = distributionPlanningDistributionPlanningServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return distributionPlanningDistributionPlanningServiceInputsandOuputs
  **/

  public String getDistributionPlanningDistributionPlanningServiceInputsandOuputs() {
    return distributionPlanningDistributionPlanningServiceInputsandOuputs;
  }

  public void setDistributionPlanningDistributionPlanningServiceInputsandOuputs(String distributionPlanningDistributionPlanningServiceInputsandOuputs) {
    this.distributionPlanningDistributionPlanningServiceInputsandOuputs = distributionPlanningDistributionPlanningServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return distributionPlanningDistributionPlanningServiceWorkProduct
  **/

  public String getDistributionPlanningDistributionPlanningServiceWorkProduct() {
    return distributionPlanningDistributionPlanningServiceWorkProduct;
  }

  public void setDistributionPlanningDistributionPlanningServiceWorkProduct(String distributionPlanningDistributionPlanningServiceWorkProduct) {
    this.distributionPlanningDistributionPlanningServiceWorkProduct = distributionPlanningDistributionPlanningServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return distributionPlanningDistributionPlanningServiceName
  **/

  public String getDistributionPlanningDistributionPlanningServiceName() {
    return distributionPlanningDistributionPlanningServiceName;
  }

  public void setDistributionPlanningDistributionPlanningServiceName(String distributionPlanningDistributionPlanningServiceName) {
    this.distributionPlanningDistributionPlanningServiceName = distributionPlanningDistributionPlanningServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return distributionPlanningUpdateActionTaskReference
  **/

  public String getDistributionPlanningUpdateActionTaskReference() {
    return distributionPlanningUpdateActionTaskReference;
  }

  public void setDistributionPlanningUpdateActionTaskReference(String distributionPlanningUpdateActionTaskReference) {
    this.distributionPlanningUpdateActionTaskReference = distributionPlanningUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return distributionPlanningUpdateActionTaskRecord
  **/

  public Object getDistributionPlanningUpdateActionTaskRecord() {
    return distributionPlanningUpdateActionTaskRecord;
  }

  public void setDistributionPlanningUpdateActionTaskRecord(Object distributionPlanningUpdateActionTaskRecord) {
    this.distributionPlanningUpdateActionTaskRecord = distributionPlanningUpdateActionTaskRecord;
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

