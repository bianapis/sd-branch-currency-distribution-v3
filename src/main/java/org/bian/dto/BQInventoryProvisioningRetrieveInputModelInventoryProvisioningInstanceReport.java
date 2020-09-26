package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryProvisioningRetrieveInputModelInventoryProvisioningInstanceReport
 */
public class BQInventoryProvisioningRetrieveInputModelInventoryProvisioningInstanceReport   {
  private String inventoryProvisioningInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return inventoryProvisioningInstanceReportReference
  **/

  public String getInventoryProvisioningInstanceReportReference() {
    return inventoryProvisioningInstanceReportReference;
  }

  public void setInventoryProvisioningInstanceReportReference(String inventoryProvisioningInstanceReportReference) {
    this.inventoryProvisioningInstanceReportReference = inventoryProvisioningInstanceReportReference;
  }


}

