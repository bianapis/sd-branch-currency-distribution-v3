package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceReport
 */
public class BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceReport   {
  private String inventoryDistributionOversightInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return inventoryDistributionOversightInstanceReportReference
  **/

  public String getInventoryDistributionOversightInstanceReportReference() {
    return inventoryDistributionOversightInstanceReportReference;
  }

  public void setInventoryDistributionOversightInstanceReportReference(String inventoryDistributionOversightInstanceReportReference) {
    this.inventoryDistributionOversightInstanceReportReference = inventoryDistributionOversightInstanceReportReference;
  }


}

