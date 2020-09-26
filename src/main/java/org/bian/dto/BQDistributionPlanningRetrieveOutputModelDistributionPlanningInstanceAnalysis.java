package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionPlanningRetrieveOutputModelDistributionPlanningInstanceAnalysis
 */
public class BQDistributionPlanningRetrieveOutputModelDistributionPlanningInstanceAnalysis   {
  private Object distributionPlanningInstanceAnalysisRecord = null;

  private String distributionPlanningInstanceAnalysisReportType = null;

  private String distributionPlanningInstanceAnalysisParameters = null;

  private Object distributionPlanningInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return distributionPlanningInstanceAnalysisRecord
  **/

  public Object getDistributionPlanningInstanceAnalysisRecord() {
    return distributionPlanningInstanceAnalysisRecord;
  }

  public void setDistributionPlanningInstanceAnalysisRecord(Object distributionPlanningInstanceAnalysisRecord) {
    this.distributionPlanningInstanceAnalysisRecord = distributionPlanningInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return distributionPlanningInstanceAnalysisReportType
  **/

  public String getDistributionPlanningInstanceAnalysisReportType() {
    return distributionPlanningInstanceAnalysisReportType;
  }

  public void setDistributionPlanningInstanceAnalysisReportType(String distributionPlanningInstanceAnalysisReportType) {
    this.distributionPlanningInstanceAnalysisReportType = distributionPlanningInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return distributionPlanningInstanceAnalysisParameters
  **/

  public String getDistributionPlanningInstanceAnalysisParameters() {
    return distributionPlanningInstanceAnalysisParameters;
  }

  public void setDistributionPlanningInstanceAnalysisParameters(String distributionPlanningInstanceAnalysisParameters) {
    this.distributionPlanningInstanceAnalysisParameters = distributionPlanningInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return distributionPlanningInstanceAnalysisReport
  **/

  public Object getDistributionPlanningInstanceAnalysisReport() {
    return distributionPlanningInstanceAnalysisReport;
  }

  public void setDistributionPlanningInstanceAnalysisReport(Object distributionPlanningInstanceAnalysisReport) {
    this.distributionPlanningInstanceAnalysisReport = distributionPlanningInstanceAnalysisReport;
  }


}

