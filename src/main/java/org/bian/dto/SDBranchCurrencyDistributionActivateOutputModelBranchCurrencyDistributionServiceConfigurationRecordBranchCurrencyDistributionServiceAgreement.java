package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement
 */
public class SDBranchCurrencyDistributionActivateOutputModelBranchCurrencyDistributionServiceConfigurationRecordBranchCurrencyDistributionServiceAgreement   {
  private String branchCurrencyDistributionServiceAgreementReference = null;

  private String branchCurrencyDistributionServiceUserReference = null;

  private String branchCurrencyDistributionServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return branchCurrencyDistributionServiceAgreementReference
  **/

  public String getBranchCurrencyDistributionServiceAgreementReference() {
    return branchCurrencyDistributionServiceAgreementReference;
  }

  public void setBranchCurrencyDistributionServiceAgreementReference(String branchCurrencyDistributionServiceAgreementReference) {
    this.branchCurrencyDistributionServiceAgreementReference = branchCurrencyDistributionServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return branchCurrencyDistributionServiceUserReference
  **/

  public String getBranchCurrencyDistributionServiceUserReference() {
    return branchCurrencyDistributionServiceUserReference;
  }

  public void setBranchCurrencyDistributionServiceUserReference(String branchCurrencyDistributionServiceUserReference) {
    this.branchCurrencyDistributionServiceUserReference = branchCurrencyDistributionServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return branchCurrencyDistributionServiceAgreementTermsandConditions
  **/

  public String getBranchCurrencyDistributionServiceAgreementTermsandConditions() {
    return branchCurrencyDistributionServiceAgreementTermsandConditions;
  }

  public void setBranchCurrencyDistributionServiceAgreementTermsandConditions(String branchCurrencyDistributionServiceAgreementTermsandConditions) {
    this.branchCurrencyDistributionServiceAgreementTermsandConditions = branchCurrencyDistributionServiceAgreementTermsandConditions;
  }


}

