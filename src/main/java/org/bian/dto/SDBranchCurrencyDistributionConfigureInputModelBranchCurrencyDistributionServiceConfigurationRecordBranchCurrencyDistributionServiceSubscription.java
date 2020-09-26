package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription
 */
public class SDBranchCurrencyDistributionConfigureInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceSubscription   {
  private String branchCurrencyDistributionServiceSubscriberReference = null;

  private String branchCurrencyDistributionServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return branchCurrencyDistributionServiceSubscriberReference
  **/

  public String getBranchCurrencyDistributionServiceSubscriberReference() {
    return branchCurrencyDistributionServiceSubscriberReference;
  }

  public void setBranchCurrencyDistributionServiceSubscriberReference(String branchCurrencyDistributionServiceSubscriberReference) {
    this.branchCurrencyDistributionServiceSubscriberReference = branchCurrencyDistributionServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return branchCurrencyDistributionServiceSubscriberAccessProfile
  **/

  public String getBranchCurrencyDistributionServiceSubscriberAccessProfile() {
    return branchCurrencyDistributionServiceSubscriberAccessProfile;
  }

  public void setBranchCurrencyDistributionServiceSubscriberAccessProfile(String branchCurrencyDistributionServiceSubscriberAccessProfile) {
    this.branchCurrencyDistributionServiceSubscriberAccessProfile = branchCurrencyDistributionServiceSubscriberAccessProfile;
  }


}

