package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceAnalysis;
import org.bian.dto.CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCashDistributionProcedureRetrieveInputModel
 */
public class CRCashDistributionProcedureRetrieveInputModel   {
  private Object cashDistributionProcedureRetrieveActionTaskRecord = null;

  private String cashDistributionProcedureRetrieveActionRequest = null;

  private CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceReportRecord cashDistributionProcedureInstanceReportRecord = null;

  private CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceAnalysis cashDistributionProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cashDistributionProcedureRetrieveActionTaskRecord
  **/

  public Object getCashDistributionProcedureRetrieveActionTaskRecord() {
    return cashDistributionProcedureRetrieveActionTaskRecord;
  }

  public void setCashDistributionProcedureRetrieveActionTaskRecord(Object cashDistributionProcedureRetrieveActionTaskRecord) {
    this.cashDistributionProcedureRetrieveActionTaskRecord = cashDistributionProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cashDistributionProcedureRetrieveActionRequest
  **/

  public String getCashDistributionProcedureRetrieveActionRequest() {
    return cashDistributionProcedureRetrieveActionRequest;
  }

  public void setCashDistributionProcedureRetrieveActionRequest(String cashDistributionProcedureRetrieveActionRequest) {
    this.cashDistributionProcedureRetrieveActionRequest = cashDistributionProcedureRetrieveActionRequest;
  }


  /**
   * Get cashDistributionProcedureInstanceReportRecord
   * @return cashDistributionProcedureInstanceReportRecord
  **/

  public CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceReportRecord getCashDistributionProcedureInstanceReportRecord() {
    return cashDistributionProcedureInstanceReportRecord;
  }

  public void setCashDistributionProcedureInstanceReportRecord(CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceReportRecord cashDistributionProcedureInstanceReportRecord) {
    this.cashDistributionProcedureInstanceReportRecord = cashDistributionProcedureInstanceReportRecord;
  }


  /**
   * Get cashDistributionProcedureInstanceAnalysis
   * @return cashDistributionProcedureInstanceAnalysis
  **/

  public CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceAnalysis getCashDistributionProcedureInstanceAnalysis() {
    return cashDistributionProcedureInstanceAnalysis;
  }

  public void setCashDistributionProcedureInstanceAnalysis(CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceAnalysis cashDistributionProcedureInstanceAnalysis) {
    this.cashDistributionProcedureInstanceAnalysis = cashDistributionProcedureInstanceAnalysis;
  }


}

