package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceReport
 */
public class BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceReport   {
  private String distributionVehicleAdministrationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return distributionVehicleAdministrationInstanceReportReference
  **/

  public String getDistributionVehicleAdministrationInstanceReportReference() {
    return distributionVehicleAdministrationInstanceReportReference;
  }

  public void setDistributionVehicleAdministrationInstanceReportReference(String distributionVehicleAdministrationInstanceReportReference) {
    this.distributionVehicleAdministrationInstanceReportReference = distributionVehicleAdministrationInstanceReportReference;
  }


}

