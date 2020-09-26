package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceAnalysis
 */
public class BQDistributionPlanningRetrieveInputModelDistributionPlanningInstanceAnalysis   {
  private String distributionPlanningInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return distributionPlanningInstanceAnalysisReference
  **/

  public String getDistributionPlanningInstanceAnalysisReference() {
    return distributionPlanningInstanceAnalysisReference;
  }

  public void setDistributionPlanningInstanceAnalysisReference(String distributionPlanningInstanceAnalysisReference) {
    this.distributionPlanningInstanceAnalysisReference = distributionPlanningInstanceAnalysisReference;
  }


}

