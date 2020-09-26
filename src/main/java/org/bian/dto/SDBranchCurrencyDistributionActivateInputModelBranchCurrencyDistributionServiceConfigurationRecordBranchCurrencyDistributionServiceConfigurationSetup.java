package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup
 */
public class SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceConfigurationSetup   {
  private String branchCurrencyDistributionServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return branchCurrencyDistributionServiceConfigurationParameter
  **/

  public String getBranchCurrencyDistributionServiceConfigurationParameter() {
    return branchCurrencyDistributionServiceConfigurationParameter;
  }

  public void setBranchCurrencyDistributionServiceConfigurationParameter(String branchCurrencyDistributionServiceConfigurationParameter) {
    this.branchCurrencyDistributionServiceConfigurationParameter = branchCurrencyDistributionServiceConfigurationParameter;
  }


}

