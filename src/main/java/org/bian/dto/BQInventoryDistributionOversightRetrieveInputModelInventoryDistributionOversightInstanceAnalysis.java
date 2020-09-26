package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceAnalysis
 */
public class BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceAnalysis   {
  private String inventoryDistributionOversightInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return inventoryDistributionOversightInstanceAnalysisReference
  **/

  public String getInventoryDistributionOversightInstanceAnalysisReference() {
    return inventoryDistributionOversightInstanceAnalysisReference;
  }

  public void setInventoryDistributionOversightInstanceAnalysisReference(String inventoryDistributionOversightInstanceAnalysisReference) {
    this.inventoryDistributionOversightInstanceAnalysisReference = inventoryDistributionOversightInstanceAnalysisReference;
  }


}

