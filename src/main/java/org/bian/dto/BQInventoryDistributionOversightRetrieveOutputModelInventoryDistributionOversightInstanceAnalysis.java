package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryDistributionOversightRetrieveOutputModelInventoryDistributionOversightInstanceAnalysis
 */
public class BQInventoryDistributionOversightRetrieveOutputModelInventoryDistributionOversightInstanceAnalysis   {
  private Object inventoryDistributionOversightInstanceAnalysisRecord = null;

  private String inventoryDistributionOversightInstanceAnalysisReportType = null;

  private String inventoryDistributionOversightInstanceAnalysisParameters = null;

  private Object inventoryDistributionOversightInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return inventoryDistributionOversightInstanceAnalysisRecord
  **/

  public Object getInventoryDistributionOversightInstanceAnalysisRecord() {
    return inventoryDistributionOversightInstanceAnalysisRecord;
  }

  public void setInventoryDistributionOversightInstanceAnalysisRecord(Object inventoryDistributionOversightInstanceAnalysisRecord) {
    this.inventoryDistributionOversightInstanceAnalysisRecord = inventoryDistributionOversightInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return inventoryDistributionOversightInstanceAnalysisReportType
  **/

  public String getInventoryDistributionOversightInstanceAnalysisReportType() {
    return inventoryDistributionOversightInstanceAnalysisReportType;
  }

  public void setInventoryDistributionOversightInstanceAnalysisReportType(String inventoryDistributionOversightInstanceAnalysisReportType) {
    this.inventoryDistributionOversightInstanceAnalysisReportType = inventoryDistributionOversightInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return inventoryDistributionOversightInstanceAnalysisParameters
  **/

  public String getInventoryDistributionOversightInstanceAnalysisParameters() {
    return inventoryDistributionOversightInstanceAnalysisParameters;
  }

  public void setInventoryDistributionOversightInstanceAnalysisParameters(String inventoryDistributionOversightInstanceAnalysisParameters) {
    this.inventoryDistributionOversightInstanceAnalysisParameters = inventoryDistributionOversightInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return inventoryDistributionOversightInstanceAnalysisReport
  **/

  public Object getInventoryDistributionOversightInstanceAnalysisReport() {
    return inventoryDistributionOversightInstanceAnalysisReport;
  }

  public void setInventoryDistributionOversightInstanceAnalysisReport(Object inventoryDistributionOversightInstanceAnalysisReport) {
    this.inventoryDistributionOversightInstanceAnalysisReport = inventoryDistributionOversightInstanceAnalysisReport;
  }


}

