package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedService;
import org.bian.dto.SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionRetrieveInputModel
 */
public class SDBranchCurrencyDistributionRetrieveInputModel   {
  private Object branchCurrencyDistributionRetrieveActionTaskRecord = null;

  private String branchCurrencyDistributionRetrieveActionRequest = null;

  private SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionRetrieveActionRecord branchCurrencyDistributionRetrieveActionRecord = null;

  private SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedService branchCurrencyDistributionOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchCurrencyDistributionRetrieveActionTaskRecord
  **/

  public Object getBranchCurrencyDistributionRetrieveActionTaskRecord() {
    return branchCurrencyDistributionRetrieveActionTaskRecord;
  }

  public void setBranchCurrencyDistributionRetrieveActionTaskRecord(Object branchCurrencyDistributionRetrieveActionTaskRecord) {
    this.branchCurrencyDistributionRetrieveActionTaskRecord = branchCurrencyDistributionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return branchCurrencyDistributionRetrieveActionRequest
  **/

  public String getBranchCurrencyDistributionRetrieveActionRequest() {
    return branchCurrencyDistributionRetrieveActionRequest;
  }

  public void setBranchCurrencyDistributionRetrieveActionRequest(String branchCurrencyDistributionRetrieveActionRequest) {
    this.branchCurrencyDistributionRetrieveActionRequest = branchCurrencyDistributionRetrieveActionRequest;
  }


  /**
   * Get branchCurrencyDistributionRetrieveActionRecord
   * @return branchCurrencyDistributionRetrieveActionRecord
  **/

  public SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionRetrieveActionRecord getBranchCurrencyDistributionRetrieveActionRecord() {
    return branchCurrencyDistributionRetrieveActionRecord;
  }

  public void setBranchCurrencyDistributionRetrieveActionRecord(SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionRetrieveActionRecord branchCurrencyDistributionRetrieveActionRecord) {
    this.branchCurrencyDistributionRetrieveActionRecord = branchCurrencyDistributionRetrieveActionRecord;
  }


  /**
   * Get branchCurrencyDistributionOfferedService
   * @return branchCurrencyDistributionOfferedService
  **/

  public SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedService getBranchCurrencyDistributionOfferedService() {
    return branchCurrencyDistributionOfferedService;
  }

  public void setBranchCurrencyDistributionOfferedService(SDBranchCurrencyDistributionRetrieveInputModelBranchCurrencyDistributionOfferedService branchCurrencyDistributionOfferedService) {
    this.branchCurrencyDistributionOfferedService = branchCurrencyDistributionOfferedService;
  }


}

