package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionFeedbackOutputModelBranchCurrencyDistributionFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionFeedbackOutputModel
 */
public class SDBranchCurrencyDistributionFeedbackOutputModel   {
  private String branchCurrencyDistributionFeedbackActionTaskReference = null;

  private Object branchCurrencyDistributionFeedbackActionTaskRecord = null;

  private SDBranchCurrencyDistributionFeedbackOutputModelBranchCurrencyDistributionFeedbackActionRecord branchCurrencyDistributionFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return branchCurrencyDistributionFeedbackActionTaskReference
  **/

  public String getBranchCurrencyDistributionFeedbackActionTaskReference() {
    return branchCurrencyDistributionFeedbackActionTaskReference;
  }

  public void setBranchCurrencyDistributionFeedbackActionTaskReference(String branchCurrencyDistributionFeedbackActionTaskReference) {
    this.branchCurrencyDistributionFeedbackActionTaskReference = branchCurrencyDistributionFeedbackActionTaskReference;
  }


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

  public SDBranchCurrencyDistributionFeedbackOutputModelBranchCurrencyDistributionFeedbackActionRecord getBranchCurrencyDistributionFeedbackActionRecord() {
    return branchCurrencyDistributionFeedbackActionRecord;
  }

  public void setBranchCurrencyDistributionFeedbackActionRecord(SDBranchCurrencyDistributionFeedbackOutputModelBranchCurrencyDistributionFeedbackActionRecord branchCurrencyDistributionFeedbackActionRecord) {
    this.branchCurrencyDistributionFeedbackActionRecord = branchCurrencyDistributionFeedbackActionRecord;
  }


}

