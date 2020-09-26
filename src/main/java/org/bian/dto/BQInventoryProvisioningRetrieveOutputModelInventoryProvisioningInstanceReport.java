package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceReport
 */
public class BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceReport   {
  private Object inventoryProvisioningInstanceReportRecord = null;

  private String inventoryProvisioningInstanceReportType = null;

  private String inventoryProvisioningInstanceReportParameters = null;

  private Object inventoryProvisioningInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return inventoryProvisioningInstanceReportRecord
  **/

  public Object getInventoryProvisioningInstanceReportRecord() {
    return inventoryProvisioningInstanceReportRecord;
  }

  public void setInventoryProvisioningInstanceReportRecord(Object inventoryProvisioningInstanceReportRecord) {
    this.inventoryProvisioningInstanceReportRecord = inventoryProvisioningInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return inventoryProvisioningInstanceReportType
  **/

  public String getInventoryProvisioningInstanceReportType() {
    return inventoryProvisioningInstanceReportType;
  }

  public void setInventoryProvisioningInstanceReportType(String inventoryProvisioningInstanceReportType) {
    this.inventoryProvisioningInstanceReportType = inventoryProvisioningInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return inventoryProvisioningInstanceReportParameters
  **/

  public String getInventoryProvisioningInstanceReportParameters() {
    return inventoryProvisioningInstanceReportParameters;
  }

  public void setInventoryProvisioningInstanceReportParameters(String inventoryProvisioningInstanceReportParameters) {
    this.inventoryProvisioningInstanceReportParameters = inventoryProvisioningInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return inventoryProvisioningInstanceReport
  **/

  public Object getInventoryProvisioningInstanceReport() {
    return inventoryProvisioningInstanceReport;
  }

  public void setInventoryProvisioningInstanceReport(Object inventoryProvisioningInstanceReport) {
    this.inventoryProvisioningInstanceReport = inventoryProvisioningInstanceReport;
  }


}

