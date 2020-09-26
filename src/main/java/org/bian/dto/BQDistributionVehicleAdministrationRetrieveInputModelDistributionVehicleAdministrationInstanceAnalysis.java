package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceAnalysis
 */
public class BQDistributionVehicleAdministrationRetrieveInputModelDistributionVehicleAdministrationInstanceAnalysis   {
  private String distributionVehicleAdministrationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return distributionVehicleAdministrationInstanceAnalysisReference
  **/

  public String getDistributionVehicleAdministrationInstanceAnalysisReference() {
    return distributionVehicleAdministrationInstanceAnalysisReference;
  }

  public void setDistributionVehicleAdministrationInstanceAnalysisReference(String distributionVehicleAdministrationInstanceAnalysisReference) {
    this.distributionVehicleAdministrationInstanceAnalysisReference = distributionVehicleAdministrationInstanceAnalysisReference;
  }


}

