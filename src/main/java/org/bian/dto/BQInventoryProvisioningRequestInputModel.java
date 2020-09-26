package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashDistributionProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQInventoryProvisioningRequestInputModel
 */
public class BQInventoryProvisioningRequestInputModel   {
  private String cashDistributionProcedureInstanceReference = null;

  private String inventoryProvisioningInstanceReference = null;

  private Object inventoryProvisioningRequestActionTaskRecord = null;

  private CRCashDistributionProcedureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Cash Distribution Procedure instance 
   * @return cashDistributionProcedureInstanceReference
  **/

  public String getCashDistributionProcedureInstanceReference() {
    return cashDistributionProcedureInstanceReference;
  }

  public void setCashDistributionProcedureInstanceReference(String cashDistributionProcedureInstanceReference) {
    this.cashDistributionProcedureInstanceReference = cashDistributionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inventory Provisioning instance 
   * @return inventoryProvisioningInstanceReference
  **/

  public String getInventoryProvisioningInstanceReference() {
    return inventoryProvisioningInstanceReference;
  }

  public void setInventoryProvisioningInstanceReference(String inventoryProvisioningInstanceReference) {
    this.inventoryProvisioningInstanceReference = inventoryProvisioningInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return inventoryProvisioningRequestActionTaskRecord
  **/

  public Object getInventoryProvisioningRequestActionTaskRecord() {
    return inventoryProvisioningRequestActionTaskRecord;
  }

  public void setInventoryProvisioningRequestActionTaskRecord(Object inventoryProvisioningRequestActionTaskRecord) {
    this.inventoryProvisioningRequestActionTaskRecord = inventoryProvisioningRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCashDistributionProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCashDistributionProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

