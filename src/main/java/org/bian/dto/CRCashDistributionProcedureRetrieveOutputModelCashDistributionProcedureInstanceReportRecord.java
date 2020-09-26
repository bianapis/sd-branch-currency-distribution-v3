package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashDistributionProcedureRetrieveOutputModelCashDistributionProcedureInstanceReportRecord
 */
public class CRCashDistributionProcedureRetrieveOutputModelCashDistributionProcedureInstanceReportRecord   {
  private String cashDistributionProcedureInstanceReportData = null;

  private String cashDistributionProcedureInstanceReportType = null;

  private Object cashDistributionProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cashDistributionProcedureInstanceReportData
  **/

  public String getCashDistributionProcedureInstanceReportData() {
    return cashDistributionProcedureInstanceReportData;
  }

  public void setCashDistributionProcedureInstanceReportData(String cashDistributionProcedureInstanceReportData) {
    this.cashDistributionProcedureInstanceReportData = cashDistributionProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cashDistributionProcedureInstanceReportType
  **/

  public String getCashDistributionProcedureInstanceReportType() {
    return cashDistributionProcedureInstanceReportType;
  }

  public void setCashDistributionProcedureInstanceReportType(String cashDistributionProcedureInstanceReportType) {
    this.cashDistributionProcedureInstanceReportType = cashDistributionProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cashDistributionProcedureInstanceReport
  **/

  public Object getCashDistributionProcedureInstanceReport() {
    return cashDistributionProcedureInstanceReport;
  }

  public void setCashDistributionProcedureInstanceReport(Object cashDistributionProcedureInstanceReport) {
    this.cashDistributionProcedureInstanceReport = cashDistributionProcedureInstanceReport;
  }


}

