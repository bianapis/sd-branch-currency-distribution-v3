package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionVehicleAdministrationRetrieveOutputModelDistributionVehicleAdministrationInstanceReport
 */
public class BQDistributionVehicleAdministrationRetrieveOutputModelDistributionVehicleAdministrationInstanceReport   {
  private Object distributionVehicleAdministrationInstanceReportRecord = null;

  private String distributionVehicleAdministrationInstanceReportType = null;

  private String distributionVehicleAdministrationInstanceReportParameters = null;

  private Object distributionVehicleAdministrationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return distributionVehicleAdministrationInstanceReportRecord
  **/

  public Object getDistributionVehicleAdministrationInstanceReportRecord() {
    return distributionVehicleAdministrationInstanceReportRecord;
  }

  public void setDistributionVehicleAdministrationInstanceReportRecord(Object distributionVehicleAdministrationInstanceReportRecord) {
    this.distributionVehicleAdministrationInstanceReportRecord = distributionVehicleAdministrationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return distributionVehicleAdministrationInstanceReportType
  **/

  public String getDistributionVehicleAdministrationInstanceReportType() {
    return distributionVehicleAdministrationInstanceReportType;
  }

  public void setDistributionVehicleAdministrationInstanceReportType(String distributionVehicleAdministrationInstanceReportType) {
    this.distributionVehicleAdministrationInstanceReportType = distributionVehicleAdministrationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return distributionVehicleAdministrationInstanceReportParameters
  **/

  public String getDistributionVehicleAdministrationInstanceReportParameters() {
    return distributionVehicleAdministrationInstanceReportParameters;
  }

  public void setDistributionVehicleAdministrationInstanceReportParameters(String distributionVehicleAdministrationInstanceReportParameters) {
    this.distributionVehicleAdministrationInstanceReportParameters = distributionVehicleAdministrationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return distributionVehicleAdministrationInstanceReport
  **/

  public Object getDistributionVehicleAdministrationInstanceReport() {
    return distributionVehicleAdministrationInstanceReport;
  }

  public void setDistributionVehicleAdministrationInstanceReport(Object distributionVehicleAdministrationInstanceReport) {
    this.distributionVehicleAdministrationInstanceReport = distributionVehicleAdministrationInstanceReport;
  }


}

