package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionConfigureOutputModelBranchCurrencyDistributionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionConfigureOutputModel
 */
public class SDBranchCurrencyDistributionConfigureOutputModel   {
  private String branchCurrencyDistributionConfigurationActionTaskReference = null;

  private Object branchCurrencyDistributionConfigurationActionTaskRecord = null;

  private SDBranchCurrencyDistributionConfigureOutputModelBranchCurrencyDistributionServiceConfigurationRecord branchCurrencyDistributionServiceConfigurationRecord = null;

  private String branchCurrencyDistributionServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return branchCurrencyDistributionConfigurationActionTaskReference
  **/

  public String getBranchCurrencyDistributionConfigurationActionTaskReference() {
    return branchCurrencyDistributionConfigurationActionTaskReference;
  }

  public void setBranchCurrencyDistributionConfigurationActionTaskReference(String branchCurrencyDistributionConfigurationActionTaskReference) {
    this.branchCurrencyDistributionConfigurationActionTaskReference = branchCurrencyDistributionConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return branchCurrencyDistributionConfigurationActionTaskRecord
  **/

  public Object getBranchCurrencyDistributionConfigurationActionTaskRecord() {
    return branchCurrencyDistributionConfigurationActionTaskRecord;
  }

  public void setBranchCurrencyDistributionConfigurationActionTaskRecord(Object branchCurrencyDistributionConfigurationActionTaskRecord) {
    this.branchCurrencyDistributionConfigurationActionTaskRecord = branchCurrencyDistributionConfigurationActionTaskRecord;
  }


  /**
   * Get branchCurrencyDistributionServiceConfigurationRecord
   * @return branchCurrencyDistributionServiceConfigurationRecord
  **/

  public SDBranchCurrencyDistributionConfigureOutputModelBranchCurrencyDistributionServiceConfigurationRecord getBranchCurrencyDistributionServiceConfigurationRecord() {
    return branchCurrencyDistributionServiceConfigurationRecord;
  }

  public void setBranchCurrencyDistributionServiceConfigurationRecord(SDBranchCurrencyDistributionConfigureOutputModelBranchCurrencyDistributionServiceConfigurationRecord branchCurrencyDistributionServiceConfigurationRecord) {
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

