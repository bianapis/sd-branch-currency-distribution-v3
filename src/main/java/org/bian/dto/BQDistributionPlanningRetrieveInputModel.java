package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceAnalysis;
import org.bian.dto.BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDistributionPlanningRetrieveInputModel
 */
public class BQDistributionPlanningRetrieveInputModel   {
  private Object distributionPlanningRetrieveActionTaskRecord = null;

  private String distributionPlanningRetrieveActionRequest = null;

  private BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceReport distributionPlanningInstanceReport = null;

  private BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceAnalysis distributionPlanningInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return distributionPlanningRetrieveActionTaskRecord
  **/

  public Object getDistributionPlanningRetrieveActionTaskRecord() {
    return distributionPlanningRetrieveActionTaskRecord;
  }

  public void setDistributionPlanningRetrieveActionTaskRecord(Object distributionPlanningRetrieveActionTaskRecord) {
    this.distributionPlanningRetrieveActionTaskRecord = distributionPlanningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return distributionPlanningRetrieveActionRequest
  **/

  public String getDistributionPlanningRetrieveActionRequest() {
    return distributionPlanningRetrieveActionRequest;
  }

  public void setDistributionPlanningRetrieveActionRequest(String distributionPlanningRetrieveActionRequest) {
    this.distributionPlanningRetrieveActionRequest = distributionPlanningRetrieveActionRequest;
  }


  /**
   * Get distributionPlanningInstanceReport
   * @return distributionPlanningInstanceReport
  **/

  public BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceReport getDistributionPlanningInstanceReport() {
    return distributionPlanningInstanceReport;
  }

  public void setDistributionPlanningInstanceReport(BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceReport distributionPlanningInstanceReport) {
    this.distributionPlanningInstanceReport = distributionPlanningInstanceReport;
  }


  /**
   * Get distributionPlanningInstanceAnalysis
   * @return distributionPlanningInstanceAnalysis
  **/

  public BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceAnalysis getDistributionPlanningInstanceAnalysis() {
    return distributionPlanningInstanceAnalysis;
  }

  public void setDistributionPlanningInstanceAnalysis(BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceAnalysis distributionPlanningInstanceAnalysis) {
    this.distributionPlanningInstanceAnalysis = distributionPlanningInstanceAnalysis;
  }


}

