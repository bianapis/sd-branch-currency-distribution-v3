package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecordBranchCurrencyDistributionServicePoliciesandGuidelines
 */
public class SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecordBranchCurrencyDistributionServicePoliciesandGuidelines   {
  private String branchCurrencyDistributionServiceEligibility = null;

  private String branchCurrencyDistributionServiceIntendedUses = null;

  private String branchCurrencyDistributionServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return branchCurrencyDistributionServiceEligibility
  **/

  public String getBranchCurrencyDistributionServiceEligibility() {
    return branchCurrencyDistributionServiceEligibility;
  }

  public void setBranchCurrencyDistributionServiceEligibility(String branchCurrencyDistributionServiceEligibility) {
    this.branchCurrencyDistributionServiceEligibility = branchCurrencyDistributionServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return branchCurrencyDistributionServiceIntendedUses
  **/

  public String getBranchCurrencyDistributionServiceIntendedUses() {
    return branchCurrencyDistributionServiceIntendedUses;
  }

  public void setBranchCurrencyDistributionServiceIntendedUses(String branchCurrencyDistributionServiceIntendedUses) {
    this.branchCurrencyDistributionServiceIntendedUses = branchCurrencyDistributionServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return branchCurrencyDistributionServicePricingandTerms
  **/

  public String getBranchCurrencyDistributionServicePricingandTerms() {
    return branchCurrencyDistributionServicePricingandTerms;
  }

  public void setBranchCurrencyDistributionServicePricingandTerms(String branchCurrencyDistributionServicePricingandTerms) {
    this.branchCurrencyDistributionServicePricingandTerms = branchCurrencyDistributionServicePricingandTerms;
  }


}

