/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface BranchCurrencyDistributionApiService {

	SDBranchCurrencyDistributionActivateOutputModel activate(SDBranchCurrencyDistributionActivateInputModel request);
	
	SDBranchCurrencyDistributionConfigureOutputModel configure(String sdReferenceId, SDBranchCurrencyDistributionConfigureInputModel request);
	
	CRCashDistributionProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureControlInputModel request);
	
	BQDistributionPlanningExchangeOutputModel exchangeDistributionplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionPlanningExchangeInputModel request);
	
	BQInventoryProvisioningExchangeOutputModel exchangeInventoryprovisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryProvisioningExchangeInputModel request);
	
	CRCashDistributionProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureExchangeInputModel request);
	
	CRCashDistributionProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureExecuteInputModel request);
	
	SDBranchCurrencyDistributionFeedbackOutputModel feedback(String sdReferenceId, SDBranchCurrencyDistributionFeedbackInputModel request);
	
	CRCashDistributionProcedureInitiateOutputModel initiate(String sdReferenceId, CRCashDistributionProcedureInitiateInputModel request);
	
	BQDistributionPlanningRequestOutputModel requestDistributionplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionPlanningRequestInputModel request);
	
	BQDistributionVehicleAdministrationRequestOutputModel requestDistributionvehicleadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionVehicleAdministrationRequestInputModel request);
	
	BQInventoryDistributionOversightRequestOutputModel requestInventorydistributionoversight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryDistributionOversightRequestInputModel request);
	
	BQInventoryProvisioningRequestOutputModel requestInventoryprovisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryProvisioningRequestInputModel request);
	
	CRCashDistributionProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureRequestInputModel request);
	
	CRCashDistributionProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQDistributionPlanningRetrieveOutputModel retrieveDistributionplanning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDistributionVehicleAdministrationRetrieveOutputModel retrieveDistributionvehicleadministration(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInventoryDistributionOversightRetrieveOutputModel retrieveInventorydistributionoversight(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInventoryProvisioningRetrieveOutputModel retrieveInventoryprovisioning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDBranchCurrencyDistributionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCashDistributionProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureUpdateInputModel request);
	
	BQDistributionPlanningUpdateOutputModel updateDistributionplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionPlanningUpdateInputModel request);
	
	BQDistributionVehicleAdministrationUpdateOutputModel updateDistributionvehicleadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionVehicleAdministrationUpdateInputModel request);
	
	BQInventoryDistributionOversightUpdateOutputModel updateInventorydistributionoversight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryDistributionOversightUpdateInputModel request);
	
	BQInventoryProvisioningUpdateOutputModel updateInventoryprovisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryProvisioningUpdateInputModel request);
	
}
