package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceAnalysis
 */
public class CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceAnalysis   {
  private String cashDistributionProcedureInstanceAnalysisReference = null;

  private String cashDistributionProcedureInstanceAnalysisReportType = null;

  private String cashDistributionProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cashDistributionProcedureInstanceAnalysisReference
  **/

  public String getCashDistributionProcedureInstanceAnalysisReference() {
    return cashDistributionProcedureInstanceAnalysisReference;
  }

  public void setCashDistributionProcedureInstanceAnalysisReference(String cashDistributionProcedureInstanceAnalysisReference) {
    this.cashDistributionProcedureInstanceAnalysisReference = cashDistributionProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cashDistributionProcedureInstanceAnalysisParameters
  **/

  public String getCashDistributionProcedureInstanceAnalysisParameters() {
    return cashDistributionProcedureInstanceAnalysisParameters;
  }

  public void setCashDistributionProcedureInstanceAnalysisParameters(String cashDistributionProcedureInstanceAnalysisParameters) {
    this.cashDistributionProcedureInstanceAnalysisParameters = cashDistributionProcedureInstanceAnalysisParameters;
  }


}

