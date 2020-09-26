package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionActivateInputModel
 */
public class SDBranchCurrencyDistributionActivateInputModel   {
  private Object branchCurrencyDistributionActivationActionTaskRecord = null;

  private String branchCurrencyDistributionCenterReference = null;

  private String branchCurrencyDistributionServiceReference = null;

  private SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecord branchCurrencyDistributionServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return branchCurrencyDistributionActivationActionTaskRecord
  **/

  public Object getBranchCurrencyDistributionActivationActionTaskRecord() {
    return branchCurrencyDistributionActivationActionTaskRecord;
  }

  public void setBranchCurrencyDistributionActivationActionTaskRecord(Object branchCurrencyDistributionActivationActionTaskRecord) {
    this.branchCurrencyDistributionActivationActionTaskRecord = branchCurrencyDistributionActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return branchCurrencyDistributionCenterReference
  **/

  public String getBranchCurrencyDistributionCenterReference() {
    return branchCurrencyDistributionCenterReference;
  }

  public void setBranchCurrencyDistributionCenterReference(String branchCurrencyDistributionCenterReference) {
    this.branchCurrencyDistributionCenterReference = branchCurrencyDistributionCenterReference;
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

  public SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecord getBranchCurrencyDistributionServiceConfigurationRecord() {
    return branchCurrencyDistributionServiceConfigurationRecord;
  }

  public void setBranchCurrencyDistributionServiceConfigurationRecord(SDBranchCurrencyDistributionActivateInputModelBranchCurrencyDistributionServiceConfigurationRecord branchCurrencyDistributionServiceConfigurationRecord) {
    this.branchCurrencyDistributionServiceConfigurationRecord = branchCurrencyDistributionServiceConfigurationRecord;
  }


}

