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
 * SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecord
 */
public class SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecord   {
  private String branchCurrencyDistributionServiceConfigurationSettingReference = null;

  private String branchCurrencyDistributionServiceConfigurationSettingType = null;

  private SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup branchCurrencyDistributionServiceConfigurationSetup = null;

  private SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription branchCurrencyDistributionServiceSubscription = null;

  private SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement branchCurrencyDistributionServiceAgreement = null;


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


}

