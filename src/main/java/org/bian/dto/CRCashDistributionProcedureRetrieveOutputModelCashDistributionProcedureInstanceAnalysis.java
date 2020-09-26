package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashDistributionProcedureRetrieveOutputModelCashDistributionProcedureInstanceAnalysis
 */
public class CRCashDistributionProcedureRetrieveOutputModelCashDistributionProcedureInstanceAnalysis   {
  private String cashDistributionProcedureInstanceAnalysisData = null;

  private String cashDistributionProcedureInstanceAnalysisReportType = null;

  private Object cashDistributionProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cashDistributionProcedureInstanceAnalysisData
  **/

  public String getCashDistributionProcedureInstanceAnalysisData() {
    return cashDistributionProcedureInstanceAnalysisData;
  }

  public void setCashDistributionProcedureInstanceAnalysisData(String cashDistributionProcedureInstanceAnalysisData) {
    this.cashDistributionProcedureInstanceAnalysisData = cashDistributionProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cashDistributionProcedureInstanceAnalysisReportType
  **/

  public String getCashDistributionProcedureInstanceAnalysisReportType() {
    return cashDistributionProcedureInstanceAnalysisReportType;
  }

  public void setCashDistributionProcedureInstanceAnalysisReportType(String cashDistributionProcedureInstanceAnalysisReportType) {
    this.cashDistributionProcedureInstanceAnalysisReportType = cashDistributionProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cashDistributionProcedureInstanceAnalysisReport
  **/

  public Object getCashDistributionProcedureInstanceAnalysisReport() {
    return cashDistributionProcedureInstanceAnalysisReport;
  }

  public void setCashDistributionProcedureInstanceAnalysisReport(Object cashDistributionProcedureInstanceAnalysisReport) {
    this.cashDistributionProcedureInstanceAnalysisReport = cashDistributionProcedureInstanceAnalysisReport;
  }


}

