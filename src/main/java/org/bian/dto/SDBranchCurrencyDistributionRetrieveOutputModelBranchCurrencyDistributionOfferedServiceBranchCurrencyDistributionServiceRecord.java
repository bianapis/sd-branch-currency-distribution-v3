package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecordBranchCurrencyDistributionServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord
 */
public class SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord   {
  private String branchCurrencyDistributionServiceType = null;

  private String branchCurrencyDistributionServiceVersion = null;

  private String branchCurrencyDistributionServiceDescription = null;

  private SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecordBranchCurrencyDistributionServicePoliciesandGuidelines branchCurrencyDistributionServicePoliciesandGuidelines = null;

  private String branchCurrencyDistributionServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return branchCurrencyDistributionServiceType
  **/

  public String getBranchCurrencyDistributionServiceType() {
    return branchCurrencyDistributionServiceType;
  }

  public void setBranchCurrencyDistributionServiceType(String branchCurrencyDistributionServiceType) {
    this.branchCurrencyDistributionServiceType = branchCurrencyDistributionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return branchCurrencyDistributionServiceVersion
  **/

  public String getBranchCurrencyDistributionServiceVersion() {
    return branchCurrencyDistributionServiceVersion;
  }

  public void setBranchCurrencyDistributionServiceVersion(String branchCurrencyDistributionServiceVersion) {
    this.branchCurrencyDistributionServiceVersion = branchCurrencyDistributionServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return branchCurrencyDistributionServiceDescription
  **/

  public String getBranchCurrencyDistributionServiceDescription() {
    return branchCurrencyDistributionServiceDescription;
  }

  public void setBranchCurrencyDistributionServiceDescription(String branchCurrencyDistributionServiceDescription) {
    this.branchCurrencyDistributionServiceDescription = branchCurrencyDistributionServiceDescription;
  }


  /**
   * Get branchCurrencyDistributionServicePoliciesandGuidelines
   * @return branchCurrencyDistributionServicePoliciesandGuidelines
  **/

  public SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecordBranchCurrencyDistributionServicePoliciesandGuidelines getBranchCurrencyDistributionServicePoliciesandGuidelines() {
    return branchCurrencyDistributionServicePoliciesandGuidelines;
  }

  public void setBranchCurrencyDistributionServicePoliciesandGuidelines(SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecordBranchCurrencyDistributionServicePoliciesandGuidelines branchCurrencyDistributionServicePoliciesandGuidelines) {
    this.branchCurrencyDistributionServicePoliciesandGuidelines = branchCurrencyDistributionServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return branchCurrencyDistributionServiceSchedule
  **/

  public String getBranchCurrencyDistributionServiceSchedule() {
    return branchCurrencyDistributionServiceSchedule;
  }

  public void setBranchCurrencyDistributionServiceSchedule(String branchCurrencyDistributionServiceSchedule) {
    this.branchCurrencyDistributionServiceSchedule = branchCurrencyDistributionServiceSchedule;
  }


}

