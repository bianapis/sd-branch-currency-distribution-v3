package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceAnalysis;
import org.bian.dto.BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDistributionVehicleAdministrationRetrieveInputModel
 */
public class BQDistributionVehicleAdministrationRetrieveInputModel   {
  private Object distributionVehicleAdministrationRetrieveActionTaskRecord = null;

  private String distributionVehicleAdministrationRetrieveActionRequest = null;

  private BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceReport distributionVehicleAdministrationInstanceReport = null;

  private BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceAnalysis distributionVehicleAdministrationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return distributionVehicleAdministrationRetrieveActionTaskRecord
  **/

  public Object getDistributionVehicleAdministrationRetrieveActionTaskRecord() {
    return distributionVehicleAdministrationRetrieveActionTaskRecord;
  }

  public void setDistributionVehicleAdministrationRetrieveActionTaskRecord(Object distributionVehicleAdministrationRetrieveActionTaskRecord) {
    this.distributionVehicleAdministrationRetrieveActionTaskRecord = distributionVehicleAdministrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return distributionVehicleAdministrationRetrieveActionRequest
  **/

  public String getDistributionVehicleAdministrationRetrieveActionRequest() {
    return distributionVehicleAdministrationRetrieveActionRequest;
  }

  public void setDistributionVehicleAdministrationRetrieveActionRequest(String distributionVehicleAdministrationRetrieveActionRequest) {
    this.distributionVehicleAdministrationRetrieveActionRequest = distributionVehicleAdministrationRetrieveActionRequest;
  }


  /**
   * Get distributionVehicleAdministrationInstanceReport
   * @return distributionVehicleAdministrationInstanceReport
  **/

  public BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceReport getDistributionVehicleAdministrationInstanceReport() {
    return distributionVehicleAdministrationInstanceReport;
  }

  public void setDistributionVehicleAdministrationInstanceReport(BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceReport distributionVehicleAdministrationInstanceReport) {
    this.distributionVehicleAdministrationInstanceReport = distributionVehicleAdministrationInstanceReport;
  }


  /**
   * Get distributionVehicleAdministrationInstanceAnalysis
   * @return distributionVehicleAdministrationInstanceAnalysis
  **/

  public BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceAnalysis getDistributionVehicleAdministrationInstanceAnalysis() {
    return distributionVehicleAdministrationInstanceAnalysis;
  }

  public void setDistributionVehicleAdministrationInstanceAnalysis(BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceAnalysis distributionVehicleAdministrationInstanceAnalysis) {
    this.distributionVehicleAdministrationInstanceAnalysis = distributionVehicleAdministrationInstanceAnalysis;
  }


}

