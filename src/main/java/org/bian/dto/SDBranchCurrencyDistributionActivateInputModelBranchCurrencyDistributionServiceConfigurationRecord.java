package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecord
 */
public class SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecord   {
  private String branchCurrencyDistributionServiceConfigurationSettingReference = null;

  private String branchCurrencyDistributionServiceConfigurationSettingType = null;

  private SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup branchCurrencyDistributionServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return branchCurrencyDistributionServiceConfigurationSettingReference
  **/

  public String getBranchCurrencyDistributionServiceConfigurationSettingReference() {
    return branchCurrencyDistributionServiceConfigurationSettingReference;
  }

  public void setBranchCurrencyDistributionServiceConfigurationSettingReference(String branchCurrencyDistributionServiceConfigurationSettingReference) {
    this.branchCurrencyDistributionServiceConfigurationSettingReference = branchCurrencyDistributionServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return branchCurrencyDistributionServiceConfigurationSettingType
  **/

  public String getBranchCurrencyDistributionServiceConfigurationSettingType() {
    return branchCurrencyDistributionServiceConfigurationSettingType;
  }

  public void setBranchCurrencyDistributionServiceConfigurationSettingType(String branchCurrencyDistributionServiceConfigurationSettingType) {
    this.branchCurrencyDistributionServiceConfigurationSettingType = branchCurrencyDistributionServiceConfigurationSettingType;
  }


  /**
   * Get branchCurrencyDistributionServiceConfigurationSetup
   * @return branchCurrencyDistributionServiceConfigurationSetup
  **/

  public SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup getBranchCurrencyDistributionServiceConfigurationSetup() {
    return branchCurrencyDistributionServiceConfigurationSetup;
  }

  public void setBranchCurrencyDistributionServiceConfigurationSetup(SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup branchCurrencyDistributionServiceConfigurationSetup) {
    this.branchCurrencyDistributionServiceConfigurationSetup = branchCurrencyDistributionServiceConfigurationSetup;
  }


}

