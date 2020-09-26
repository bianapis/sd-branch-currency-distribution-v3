package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup;
import org.bian.dto.SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement;
import org.bian.dto.SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecord
 */
public class SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecord   {
  private String branchCurrencyDistributionServiceConfigurationSettingReference = null;

  private String branchCurrencyDistributionServiceConfigurationSettingDescription = null;

  private SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup branchCurrencyDistributionServiceConfigurationSetup = null;

  private SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription branchCurrencyDistributionServiceSubscription = null;

  private SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement branchCurrencyDistributionServiceAgreement = null;

  private String branchCurrencyDistributionServiceStatus = null;


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

  public SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup getBranchCurrencyDistributionServiceConfigurationSetup() {
    return branchCurrencyDistributionServiceConfigurationSetup;
  }

  public void setBranchCurrencyDistributionServiceConfigurationSetup(SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup branchCurrencyDistributionServiceConfigurationSetup) {
    this.branchCurrencyDistributionServiceConfigurationSetup = branchCurrencyDistributionServiceConfigurationSetup;
  }


  /**
   * Get branchCurrencyDistributionServiceSubscription
   * @return branchCurrencyDistributionServiceSubscription
  **/

  public SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription getBranchCurrencyDistributionServiceSubscription() {
    return branchCurrencyDistributionServiceSubscription;
  }

  public void setBranchCurrencyDistributionServiceSubscription(SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription branchCurrencyDistributionServiceSubscription) {
    this.branchCurrencyDistributionServiceSubscription = branchCurrencyDistributionServiceSubscription;
  }


  /**
   * Get branchCurrencyDistributionServiceAgreement
   * @return branchCurrencyDistributionServiceAgreement
  **/

  public SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement getBranchCurrencyDistributionServiceAgreement() {
    return branchCurrencyDistributionServiceAgreement;
  }

  public void setBranchCurrencyDistributionServiceAgreement(SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement branchCurrencyDistributionServiceAgreement) {
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

