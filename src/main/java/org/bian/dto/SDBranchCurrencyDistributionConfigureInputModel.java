package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionConfigureInputModel
 */
public class SDBranchCurrencyDistributionConfigureInputModel   {
  private Object branchCurrencyDistributionConfigurationActionTaskRecord = null;

  private String branchCurrencyDistributionServicingSessionReference = null;

  private String branchCurrencyDistributionServiceReference = null;

  private SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecord branchCurrencyDistributionServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return branchCurrencyDistributionServiceReference
  **/

  public String getBranchCurrencyDistributionServiceReference() {
    return branchCurrencyDistributionServiceReference;
  }

  public void setBranchCurrencyDistributionServiceReference(String branchCurrencyDistributionServiceReference) {
    this.branchCurrencyDistributionServiceReference = branchCurrencyDistributionServiceReference;
  }


  /**
   * Get branchCurrencyDistributionServiceConfigurationRecord
   * @return branchCurrencyDistributionServiceConfigurationRecord
  **/

  public SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecord getBranchCurrencyDistributionServiceConfigurationRecord() {
    return branchCurrencyDistributionServiceConfigurationRecord;
  }

  public void setBranchCurrencyDistributionServiceConfigurationRecord(SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecord branchCurrencyDistributionServiceConfigurationRecord) {
    this.branchCurrencyDistributionServiceConfigurationRecord = branchCurrencyDistributionServiceConfigurationRecord;
  }


}

