package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionPlanningRetrieveOutputModelDistributionPlanningInstanceReport
 */
public class BQDistributionPlanningRetrieveOutputModelDistributionPlanningInstanceReport   {
  private Object distributionPlanningInstanceReportRecord = null;

  private String distributionPlanningInstanceReportType = null;

  private String distributionPlanningInstanceReportParameters = null;

  private Object distributionPlanningInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return distributionPlanningInstanceReportRecord
  **/

  public Object getDistributionPlanningInstanceReportRecord() {
    return distributionPlanningInstanceReportRecord;
  }

  public void setDistributionPlanningInstanceReportRecord(Object distributionPlanningInstanceReportRecord) {
    this.distributionPlanningInstanceReportRecord = distributionPlanningInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return distributionPlanningInstanceReportType
  **/

  public String getDistributionPlanningInstanceReportType() {
    return distributionPlanningInstanceReportType;
  }

  public void setDistributionPlanningInstanceReportType(String distributionPlanningInstanceReportType) {
    this.distributionPlanningInstanceReportType = distributionPlanningInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return distributionPlanningInstanceReportParameters
  **/

  public String getDistributionPlanningInstanceReportParameters() {
    return distributionPlanningInstanceReportParameters;
  }

  public void setDistributionPlanningInstanceReportParameters(String distributionPlanningInstanceReportParameters) {
    this.distributionPlanningInstanceReportParameters = distributionPlanningInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return distributionPlanningInstanceReport
  **/

  public Object getDistributionPlanningInstanceReport() {
    return distributionPlanningInstanceReport;
  }

  public void setDistributionPlanningInstanceReport(Object distributionPlanningInstanceReport) {
    this.distributionPlanningInstanceReport = distributionPlanningInstanceReport;
  }


}

