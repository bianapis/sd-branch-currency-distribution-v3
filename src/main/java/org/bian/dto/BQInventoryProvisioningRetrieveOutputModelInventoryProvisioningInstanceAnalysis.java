package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceAnalysis
 */
public class BQInventoryProvisioningRetrieveOutputModelInventoryProvisioningInstanceAnalysis   {
  private Object inventoryProvisioningInstanceAnalysisRecord = null;

  private String inventoryProvisioningInstanceAnalysisReportType = null;

  private String inventoryProvisioningInstanceAnalysisParameters = null;

  private Object inventoryProvisioningInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return inventoryProvisioningInstanceAnalysisRecord
  **/

  public Object getInventoryProvisioningInstanceAnalysisRecord() {
    return inventoryProvisioningInstanceAnalysisRecord;
  }

  public void setInventoryProvisioningInstanceAnalysisRecord(Object inventoryProvisioningInstanceAnalysisRecord) {
    this.inventoryProvisioningInstanceAnalysisRecord = inventoryProvisioningInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return inventoryProvisioningInstanceAnalysisReportType
  **/

  public String getInventoryProvisioningInstanceAnalysisReportType() {
    return inventoryProvisioningInstanceAnalysisReportType;
  }

  public void setInventoryProvisioningInstanceAnalysisReportType(String inventoryProvisioningInstanceAnalysisReportType) {
    this.inventoryProvisioningInstanceAnalysisReportType = inventoryProvisioningInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return inventoryProvisioningInstanceAnalysisParameters
  **/

  public String getInventoryProvisioningInstanceAnalysisParameters() {
    return inventoryProvisioningInstanceAnalysisParameters;
  }

  public void setInventoryProvisioningInstanceAnalysisParameters(String inventoryProvisioningInstanceAnalysisParameters) {
    this.inventoryProvisioningInstanceAnalysisParameters = inventoryProvisioningInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return inventoryProvisioningInstanceAnalysisReport
  **/

  public Object getInventoryProvisioningInstanceAnalysisReport() {
    return inventoryProvisioningInstanceAnalysisReport;
  }

  public void setInventoryProvisioningInstanceAnalysisReport(Object inventoryProvisioningInstanceAnalysisReport) {
    this.inventoryProvisioningInstanceAnalysisReport = inventoryProvisioningInstanceAnalysisReport;
  }


}

