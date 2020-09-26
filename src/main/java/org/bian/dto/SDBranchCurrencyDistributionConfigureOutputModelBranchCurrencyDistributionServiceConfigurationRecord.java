package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement;
import org.bian.dto.SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup;
import org.bian.dto.SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionConfigureOutputModelBranchCurrencyDistributionServiceConfigurationRecord
 */
public class SDBranchCurrencyDistributionConfigureOutputModelBranchCurrencyDistributionServiceConfigurationRecord   {
  private String branchCurrencyDistributionServiceConfigurationSettingDescription = null;

  private SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup branchCurrencyDistributionServiceConfigurationSetup = null;

  private SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription branchCurrencyDistributionServiceSubscription = null;

  private SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement branchCurrencyDistributionServiceAgreement = null;

  private String branchCurrencyDistributionServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return branchCurrencyDistributionServiceConfigurationSettingDescription
  **/

  public String getBranchCurrencyDistributionServiceConfigurationSettingDescription() {
    return branchCurrencyDistributionServiceConfigurationSettingDescription;
  }

  public void setBranchCurrencyDistributionServiceConfigurationSettingDescription(String branchCurrencyDistributionServiceConfigurationSettingDescription) {
    this.branchCurrencyDistributionServiceConfigurationSettingDescription = branchCurrencyDistributionServiceConfigurationSettingDescription;
  }


  /**
   * Get branchCurrencyDistributionServiceConfigurationSetup
   * @return branchCurrencyDistributionServiceConfigurationSetup
  **/

  public SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup getBranchCurrencyDistributionServiceConfigurationSetup() {
    return branchCurrencyDistributionServiceConfigurationSetup;
  }

  public void setBranchCurrencyDistributionServiceConfigurationSetup(SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup branchCurrencyDistributionServiceConfigurationSetup) {
    this.branchCurrencyDistributionServiceConfigurationSetup = branchCurrencyDistributionServiceConfigurationSetup;
  }


  /**
   * Get branchCurrencyDistributionServiceSubscription
   * @return branchCurrencyDistributionServiceSubscription
  **/

  public SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription getBranchCurrencyDistributionServiceSubscription() {
    return branchCurrencyDistributionServiceSubscription;
  }

  public void setBranchCurrencyDistributionServiceSubscription(SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription branchCurrencyDistributionServiceSubscription) {
    this.branchCurrencyDistributionServiceSubscription = branchCurrencyDistributionServiceSubscription;
  }


  /**
   * Get branchCurrencyDistributionServiceAgreement
   * @return branchCurrencyDistributionServiceAgreement
  **/

  public SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement getBranchCurrencyDistributionServiceAgreement() {
    return branchCurrencyDistributionServiceAgreement;
  }

  public void setBranchCurrencyDistributionServiceAgreement(SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement branchCurrencyDistributionServiceAgreement) {
    this.branchCurrencyDistributionServiceAgreement = branchCurrencyDistributionServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return branchCurrencyDistributionServiceStatus
  **/

  public String getBranchCurrencyDistributionServiceStatus() {
    return branchCurrencyDistributionServiceStatus;
  }

  public void setBranchCurrencyDistributionServiceStatus(String branchCurrencyDistributionServiceStatus) {
    this.branchCurrencyDistributionServiceStatus = branchCurrencyDistributionServiceStatus;
  }


}

