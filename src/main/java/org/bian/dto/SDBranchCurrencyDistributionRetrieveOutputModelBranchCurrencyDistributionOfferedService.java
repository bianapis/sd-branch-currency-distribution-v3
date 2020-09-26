package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedService
 */
public class SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedService   {
  private String branchCurrencyDistributionServiceReference = null;

  private SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord branchCurrencyDistributionServiceRecord = null;


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
   * Get branchCurrencyDistributionServiceRecord
   * @return branchCurrencyDistributionServiceRecord
  **/

  public SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord getBranchCurrencyDistributionServiceRecord() {
    return branchCurrencyDistributionServiceRecord;
  }

  public void setBranchCurrencyDistributionServiceRecord(SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord branchCurrencyDistributionServiceRecord) {
    this.branchCurrencyDistributionServiceRecord = branchCurrencyDistributionServiceRecord;
  }


}

