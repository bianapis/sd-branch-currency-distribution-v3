package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryDistributionOversightRetrieveOutputModelInventoryDistributionOversightInstanceReport
 */
public class BQInventoryDistributionOversightRetrieveOutputModelInventoryDistributionOversightInstanceReport   {
  private Object inventoryDistributionOversightInstanceReportRecord = null;

  private String inventoryDistributionOversightInstanceReportType = null;

  private String inventoryDistributionOversightInstanceReportParameters = null;

  private Object inventoryDistributionOversightInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return inventoryDistributionOversightInstanceReportRecord
  **/

  public Object getInventoryDistributionOversightInstanceReportRecord() {
    return inventoryDistributionOversightInstanceReportRecord;
  }

  public void setInventoryDistributionOversightInstanceReportRecord(Object inventoryDistributionOversightInstanceReportRecord) {
    this.inventoryDistributionOversightInstanceReportRecord = inventoryDistributionOversightInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return inventoryDistributionOversightInstanceReportType
  **/

  public String getInventoryDistributionOversightInstanceReportType() {
    return inventoryDistributionOversightInstanceReportType;
  }

  public void setInventoryDistributionOversightInstanceReportType(String inventoryDistributionOversightInstanceReportType) {
    this.inventoryDistributionOversightInstanceReportType = inventoryDistributionOversightInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return inventoryDistributionOversightInstanceReportParameters
  **/

  public String getInventoryDistributionOversightInstanceReportParameters() {
    return inventoryDistributionOversightInstanceReportParameters;
  }

  public void setInventoryDistributionOversightInstanceReportParameters(String inventoryDistributionOversightInstanceReportParameters) {
    this.inventoryDistributionOversightInstanceReportParameters = inventoryDistributionOversightInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return inventoryDistributionOversightInstanceReport
  **/

  public Object getInventoryDistributionOversightInstanceReport() {
    return inventoryDistributionOversightInstanceReport;
  }

  public void setInventoryDistributionOversightInstanceReport(Object inventoryDistributionOversightInstanceReport) {
    this.inventoryDistributionOversightInstanceReport = inventoryDistributionOversightInstanceReport;
  }


}

