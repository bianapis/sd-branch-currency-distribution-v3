package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedService;
import org.bian.dto.SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyDistributionRetrieveOutputModel
 */
public class SDBranchCurrencyDistributionRetrieveOutputModel   {
  private String branchCurrencyDistributionRetrieveActionTaskReference = null;

  private Object branchCurrencyDistributionRetrieveActionTaskRecord = null;

  private String branchCurrencyDistributionRetrieveActionResponse = null;

  private SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionRetrieveActionRecord branchCurrencyDistributionRetrieveActionRecord = null;

  private SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedService branchCurrencyDistributionOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return branchCurrencyDistributionRetrieveActionTaskReference
  **/

  public String getBranchCurrencyDistributionRetrieveActionTaskReference() {
    return branchCurrencyDistributionRetrieveActionTaskReference;
  }

  public void setBranchCurrencyDistributionRetrieveActionTaskReference(String branchCurrencyDistributionRetrieveActionTaskReference) {
    this.branchCurrencyDistributionRetrieveActionTaskReference = branchCurrencyDistributionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return branchCurrencyDistributionRetrieveActionResponse
  **/

  public String getBranchCurrencyDistributionRetrieveActionResponse() {
    return branchCurrencyDistributionRetrieveActionResponse;
  }

  public void setBranchCurrencyDistributionRetrieveActionResponse(String branchCurrencyDistributionRetrieveActionResponse) {
    this.branchCurrencyDistributionRetrieveActionResponse = branchCurrencyDistributionRetrieveActionResponse;
  }


  /**
   * Get branchCurrencyDistributionRetrieveActionRecord
   * @return branchCurrencyDistributionRetrieveActionRecord
  **/

  public SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionRetrieveActionRecord getBranchCurrencyDistributionRetrieveActionRecord() {
    return branchCurrencyDistributionRetrieveActionRecord;
  }

  public void setBranchCurrencyDistributionRetrieveActionRecord(SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionRetrieveActionRecord branchCurrencyDistributionRetrieveActionRecord) {
    this.branchCurrencyDistributionRetrieveActionRecord = branchCurrencyDistributionRetrieveActionRecord;
  }


  /**
   * Get branchCurrencyDistributionOfferedService
   * @return branchCurrencyDistributionOfferedService
  **/

  public SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedService getBranchCurrencyDistributionOfferedService() {
    return branchCurrencyDistributionOfferedService;
  }

  public void setBranchCurrencyDistributionOfferedService(SDBranchCurrencyDistributionRetrieveOutputModelBranchCurrencyDistributionOfferedService branchCurrencyDistributionOfferedService) {
    this.branchCurrencyDistributionOfferedService = branchCurrencyDistributionOfferedService;
  }


}

