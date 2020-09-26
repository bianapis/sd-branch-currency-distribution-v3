package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionVehicleAdministrationRetrieveOutputModelDistributionVehicleAdministrationInstanceAnalysis
 */
public class BQDistributionVehicleAdministrationRetrieveOutputModelDistributionVehicleAdministrationInstanceAnalysis   {
  private Object distributionVehicleAdministrationInstanceAnalysisRecord = null;

  private String distributionVehicleAdministrationInstanceAnalysisReportType = null;

  private String distributionVehicleAdministrationInstanceAnalysisParameters = null;

  private Object distributionVehicleAdministrationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return distributionVehicleAdministrationInstanceAnalysisRecord
  **/

  public Object getDistributionVehicleAdministrationInstanceAnalysisRecord() {
    return distributionVehicleAdministrationInstanceAnalysisRecord;
  }

  public void setDistributionVehicleAdministrationInstanceAnalysisRecord(Object distributionVehicleAdministrationInstanceAnalysisRecord) {
    this.distributionVehicleAdministrationInstanceAnalysisRecord = distributionVehicleAdministrationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return distributionVehicleAdministrationInstanceAnalysisReportType
  **/

  public String getDistributionVehicleAdministrationInstanceAnalysisReportType() {
    return distributionVehicleAdministrationInstanceAnalysisReportType;
  }

  public void setDistributionVehicleAdministrationInstanceAnalysisReportType(String distributionVehicleAdministrationInstanceAnalysisReportType) {
    this.distributionVehicleAdministrationInstanceAnalysisReportType = distributionVehicleAdministrationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return distributionVehicleAdministrationInstanceAnalysisParameters
  **/

  public String getDistributionVehicleAdministrationInstanceAnalysisParameters() {
    return distributionVehicleAdministrationInstanceAnalysisParameters;
  }

  public void setDistributionVehicleAdministrationInstanceAnalysisParameters(String distributionVehicleAdministrationInstanceAnalysisParameters) {
    this.distributionVehicleAdministrationInstanceAnalysisParameters = distributionVehicleAdministrationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return distributionVehicleAdministrationInstanceAnalysisReport
  **/

  public Object getDistributionVehicleAdministrationInstanceAnalysisReport() {
    return distributionVehicleAdministrationInstanceAnalysisReport;
  }

  public void setDistributionVehicleAdministrationInstanceAnalysisReport(Object distributionVehicleAdministrationInstanceAnalysisReport) {
    this.distributionVehicleAdministrationInstanceAnalysisReport = distributionVehicleAdministrationInstanceAnalysisReport;
  }


}

