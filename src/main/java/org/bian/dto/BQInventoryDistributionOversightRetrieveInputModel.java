package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceAnalysis;
import org.bian.dto.BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInventoryDistributionOversightRetrieveInputModel
 */
public class BQInventoryDistributionOversightRetrieveInputModel   {
  private Object inventoryDistributionOversightRetrieveActionTaskRecord = null;

  private String inventoryDistributionOversightRetrieveActionRequest = null;

  private BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceReport inventoryDistributionOversightInstanceReport = null;

  private BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceAnalysis inventoryDistributionOversightInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inventoryDistributionOversightRetrieveActionTaskRecord
  **/

  public Object getInventoryDistributionOversightRetrieveActionTaskRecord() {
    return inventoryDistributionOversightRetrieveActionTaskRecord;
  }

  public void setInventoryDistributionOversightRetrieveActionTaskRecord(Object inventoryDistributionOversightRetrieveActionTaskRecord) {
    this.inventoryDistributionOversightRetrieveActionTaskRecord = inventoryDistributionOversightRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return inventoryDistributionOversightRetrieveActionRequest
  **/

  public String getInventoryDistributionOversightRetrieveActionRequest() {
    return inventoryDistributionOversightRetrieveActionRequest;
  }

  public void setInventoryDistributionOversightRetrieveActionRequest(String inventoryDistributionOversightRetrieveActionRequest) {
    this.inventoryDistributionOversightRetrieveActionRequest = inventoryDistributionOversightRetrieveActionRequest;
  }


  /**
   * Get inventoryDistributionOversightInstanceReport
   * @return inventoryDistributionOversightInstanceReport
  **/

  public BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceReport getInventoryDistributionOversightInstanceReport() {
    return inventoryDistributionOversightInstanceReport;
  }

  public void setInventoryDistributionOversightInstanceReport(BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceReport inventoryDistributionOversightInstanceReport) {
    this.inventoryDistributionOversightInstanceReport = inventoryDistributionOversightInstanceReport;
  }


  /**
   * Get inventoryDistributionOversightInstanceAnalysis
   * @return inventoryDistributionOversightInstanceAnalysis
  **/

  public BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceAnalysis getInventoryDistributionOversightInstanceAnalysis() {
    return inventoryDistributionOversightInstanceAnalysis;
  }

  public void setInventoryDistributionOversightInstanceAnalysis(BQInventoryDistributionOversightRetrieveInputModelInventoryDistributionOversightInstanceAnalysis inventoryDistributionOversightInstanceAnalysis) {
    this.inventoryDistributionOversightInstanceAnalysis = inventoryDistributionOversightInstanceAnalysis;
  }


}

