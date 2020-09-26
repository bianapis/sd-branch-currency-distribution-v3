package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionFeedbackInputModelBranchCurrencyDistributionFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionFeedbackInputModel
 */
public class SDBranchCurrencyDistributionFeedbackInputModel   {
  private Object branchCurrencyDistributionFeedbackActionTaskRecord = null;

  private SDBranchCurrencyDistributionFeedbackInputModelBranchCurrencyDistributionFeedbackActionRecord branchCurrencyDistributionFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return branchCurrencyDistributionFeedbackActionTaskRecord
  **/

  public Object getBranchCurrencyDistributionFeedbackActionTaskRecord() {
    return branchCurrencyDistributionFeedbackActionTaskRecord;
  }

  public void setBranchCurrencyDistributionFeedbackActionTaskRecord(Object branchCurrencyDistributionFeedbackActionTaskRecord) {
    this.branchCurrencyDistributionFeedbackActionTaskRecord = branchCurrencyDistributionFeedbackActionTaskRecord;
  }


  /**
   * Get branchCurrencyDistributionFeedbackActionRecord
   * @return branchCurrencyDistributionFeedbackActionRecord
  **/

  public SDBranchCurrencyDistributionFeedbackInputModelBranchCurrencyDistributionFeedbackActionRecord getBranchCurrencyDistributionFeedbackActionRecord() {
    return branchCurrencyDistributionFeedbackActionRecord;
  }

  public void setBranchCurrencyDistributionFeedbackActionRecord(SDBranchCurrencyDistributionFeedbackInputModelBranchCurrencyDistributionFeedbackActionRecord branchCurrencyDistributionFeedbackActionRecord) {
    this.branchCurrencyDistributionFeedbackActionRecord = branchCurrencyDistributionFeedbackActionRecord;
  }


}

