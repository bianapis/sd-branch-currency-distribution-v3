package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedService
 */
public class SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedService   {
  private String branchCurrencyDistributionServiceReference = null;

  private SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord branchCurrencyDistributionServiceRecord = null;


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

  public SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord getBranchCurrencyDistributionServiceRecord() {
    return branchCurrencyDistributionServiceRecord;
  }

  public void setBranchCurrencyDistributionServiceRecord(SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedServiceBranchCurrencyDistributionServiceRecord branchCurrencyDistributionServiceRecord) {
    this.branchCurrencyDistributionServiceRecord = branchCurrencyDistributionServiceRecord;
  }


}

