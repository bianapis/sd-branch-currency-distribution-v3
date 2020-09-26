package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionActivateOutputModel
 */
public class SDBranchCurrencyDistributionActivateOutputModel   {
  private String branchCurrencyDistributionActivationActionTaskReference = null;

  private Object branchCurrencyDistributionActivationActionTaskRecord = null;

  private String branchCurrencyDistributionServicingSessionReference = null;

  private Object branchCurrencyDistributionServicingSessionRecord = null;

  private SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecord branchCurrencyDistributionServiceConfigurationRecord = null;

  private String branchCurrencyDistributionServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return branchCurrencyDistributionActivationActionTaskReference
  **/

  public String getBranchCurrencyDistributionActivationActionTaskReference() {
    return branchCurrencyDistributionActivationActionTaskReference;
  }

  public void setBranchCurrencyDistributionActivationActionTaskReference(String branchCurrencyDistributionActivationActionTaskReference) {
    this.branchCurrencyDistributionActivationActionTaskReference = branchCurrencyDistributionActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return branchCurrencyDistributionActivationActionTaskRecord
  **/

  public Object getBranchCurrencyDistributionActivationActionTaskRecord() {
    return branchCurrencyDistributionActivationActionTaskRecord;
  }

  public void setBranchCurrencyDistributionActivationActionTaskRecord(Object branchCurrencyDistributionActivationActionTaskRecord) {
    this.branchCurrencyDistributionActivationActionTaskRecord = branchCurrencyDistributionActivationActionTaskRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return branchCurrencyDistributionServicingSessionRecord
  **/

  public Object getBranchCurrencyDistributionServicingSessionRecord() {
    return branchCurrencyDistributionServicingSessionRecord;
  }

  public void setBranchCurrencyDistributionServicingSessionRecord(Object branchCurrencyDistributionServicingSessionRecord) {
    this.branchCurrencyDistributionServicingSessionRecord = branchCurrencyDistributionServicingSessionRecord;
  }


  /**
   * Get branchCurrencyDistributionServiceConfigurationRecord
   * @return branchCurrencyDistributionServiceConfigurationRecord
  **/

  public SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecord getBranchCurrencyDistributionServiceConfigurationRecord() {
    return branchCurrencyDistributionServiceConfigurationRecord;
  }

  public void setBranchCurrencyDistributionServiceConfigurationRecord(SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecord branchCurrencyDistributionServiceConfigurationRecord) {
    this.branchCurrencyDistributionServiceConfigurationRecord = branchCurrencyDistributionServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return branchCurrencyDistributionServicingSessionStatus
  **/

  public String getBranchCurrencyDistributionServicingSessionStatus() {
    return branchCurrencyDistributionServicingSessionStatus;
  }

  public void setBranchCurrencyDistributionServicingSessionStatus(String branchCurrencyDistributionServicingSessionStatus) {
    this.branchCurrencyDistributionServicingSessionStatus = branchCurrencyDistributionServicingSessionStatus;
  }


}

