package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceReportRecord
 */
public class CRCashDistributionProcedureRetrieveInputModelCashDistributionProcedureInstanceReportRecord   {
  private String cashDistributionProcedureInstanceReportReference = null;

  private String cashDistributionProcedureInstanceReportType = null;

  private String cashDistributionProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cashDistributionProcedureInstanceReportReference
  **/

  public String getCashDistributionProcedureInstanceReportReference() {
    return cashDistributionProcedureInstanceReportReference;
  }

  public void setCashDistributionProcedureInstanceReportReference(String cashDistributionProcedureInstanceReportReference) {
    this.cashDistributionProcedureInstanceReportReference = cashDistributionProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cashDistributionProcedureInstanceReportParameters
  **/

  public String getCashDistributionProcedureInstanceReportParameters() {
    return cashDistributionProcedureInstanceReportParameters;
  }

  public void setCashDistributionProcedureInstanceReportParameters(String cashDistributionProcedureInstanceReportParameters) {
    this.cashDistributionProcedureInstanceReportParameters = cashDistributionProcedureInstanceReportParameters;
  }


}

