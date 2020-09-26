/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BranchCurrencyDistributionApiServiceImpl implements BranchCurrencyDistributionApiService {

	public SDBranchCurrencyDistributionActivateOutputModel activate(SDBranchCurrencyDistributionActivateInputModel request){
		return JsonReader.read("activate-SDBranchCurrencyDistributionActivateOutputModel.json",new TypeReference<SDBranchCurrencyDistributionActivateOutputModel>(){});
	}
	
	public SDBranchCurrencyDistributionConfigureOutputModel configure(String sdReferenceId, SDBranchCurrencyDistributionConfigureInputModel request){
		return JsonReader.read("configure-SDBranchCurrencyDistributionConfigureOutputModel.json",new TypeReference<SDBranchCurrencyDistributionConfigureOutputModel>(){});
	}
	
	public CRCashDistributionProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureControlInputModel request){
		return JsonReader.read("control-CRCashDistributionProcedureControlOutputModel.json",new TypeReference<CRCashDistributionProcedureControlOutputModel>(){});
	}
	
	public BQDistributionPlanningExchangeOutputModel exchangeDistributionplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionPlanningExchangeInputModel request){
		return JsonReader.read("exchange-BQDistributionPlanningExchangeOutputModel.json",new TypeReference<BQDistributionPlanningExchangeOutputModel>(){});
	}
	
	public BQInventoryProvisioningExchangeOutputModel exchangeInventoryprovisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryProvisioningExchangeInputModel request){
		return JsonReader.read("exchange-BQInventoryProvisioningExchangeOutputModel.json",new TypeReference<BQInventoryProvisioningExchangeOutputModel>(){});
	}
	
	public CRCashDistributionProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRCashDistributionProcedureExchangeOutputModel.json",new TypeReference<CRCashDistributionProcedureExchangeOutputModel>(){});
	}
	
	public CRCashDistributionProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCashDistributionProcedureExecuteOutputModel.json",new TypeReference<CRCashDistributionProcedureExecuteOutputModel>(){});
	}
	
	public SDBranchCurrencyDistributionFeedbackOutputModel feedback(String sdReferenceId, SDBranchCurrencyDistributionFeedbackInputModel request){
		return JsonReader.read("feedback-SDBranchCurrencyDistributionFeedbackOutputModel.json",new TypeReference<SDBranchCurrencyDistributionFeedbackOutputModel>(){});
	}
	
	public CRCashDistributionProcedureInitiateOutputModel initiate(String sdReferenceId, CRCashDistributionProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCashDistributionProcedureInitiateOutputModel.json",new TypeReference<CRCashDistributionProcedureInitiateOutputModel>(){});
	}
	
	public BQDistributionPlanningRequestOutputModel requestDistributionplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionPlanningRequestInputModel request){
		return JsonReader.read("request-BQDistributionPlanningRequestOutputModel.json",new TypeReference<BQDistributionPlanningRequestOutputModel>(){});
	}
	
	public BQDistributionVehicleAdministrationRequestOutputModel requestDistributionvehicleadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionVehicleAdministrationRequestInputModel request){
		return JsonReader.read("request-BQDistributionVehicleAdministrationRequestOutputModel.json",new TypeReference<BQDistributionVehicleAdministrationRequestOutputModel>(){});
	}
	
	public BQInventoryDistributionOversightRequestOutputModel requestInventorydistributionoversight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryDistributionOversightRequestInputModel request){
		return JsonReader.read("request-BQInventoryDistributionOversightRequestOutputModel.json",new TypeReference<BQInventoryDistributionOversightRequestOutputModel>(){});
	}
	
	public BQInventoryProvisioningRequestOutputModel requestInventoryprovisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryProvisioningRequestInputModel request){
		return JsonReader.read("request-BQInventoryProvisioningRequestOutputModel.json",new TypeReference<BQInventoryProvisioningRequestOutputModel>(){});
	}
	
	public CRCashDistributionProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureRequestInputModel request){
		return JsonReader.read("request-CRCashDistributionProcedureRequestOutputModel.json",new TypeReference<CRCashDistributionProcedureRequestOutputModel>(){});
	}
	
	public CRCashDistributionProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCashDistributionProcedureRetrieveOutputModel.json",new TypeReference<CRCashDistributionProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQDistributionPlanningRetrieveOutputModel retrieveDistributionplanning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDistributionPlanningRetrieveOutputModel.json",new TypeReference<BQDistributionPlanningRetrieveOutputModel>(){});
	}
	
	public BQDistributionVehicleAdministrationRetrieveOutputModel retrieveDistributionvehicleadministration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDistributionVehicleAdministrationRetrieveOutputModel.json",new TypeReference<BQDistributionVehicleAdministrationRetrieveOutputModel>(){});
	}
	
	public BQInventoryDistributionOversightRetrieveOutputModel retrieveInventorydistributionoversight(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInventoryDistributionOversightRetrieveOutputModel.json",new TypeReference<BQInventoryDistributionOversightRetrieveOutputModel>(){});
	}
	
	public BQInventoryProvisioningRetrieveOutputModel retrieveInventoryprovisioning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInventoryProvisioningRetrieveOutputModel.json",new TypeReference<BQInventoryProvisioningRetrieveOutputModel>(){});
	}
	
	public SDBranchCurrencyDistributionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDBranchCurrencyDistributionRetrieveOutputModel.json",new TypeReference<SDBranchCurrencyDistributionRetrieveOutputModel>(){});
	}
	
	public CRCashDistributionProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCashDistributionProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCashDistributionProcedureUpdateOutputModel.json",new TypeReference<CRCashDistributionProcedureUpdateOutputModel>(){});
	}
	
	public BQDistributionPlanningUpdateOutputModel updateDistributionplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionPlanningUpdateInputModel request){
		return JsonReader.read("update-BQDistributionPlanningUpdateOutputModel.json",new TypeReference<BQDistributionPlanningUpdateOutputModel>(){});
	}
	
	public BQDistributionVehicleAdministrationUpdateOutputModel updateDistributionvehicleadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionVehicleAdministrationUpdateInputModel request){
		return JsonReader.read("update-BQDistributionVehicleAdministrationUpdateOutputModel.json",new TypeReference<BQDistributionVehicleAdministrationUpdateOutputModel>(){});
	}
	
	public BQInventoryDistributionOversightUpdateOutputModel updateInventorydistributionoversight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryDistributionOversightUpdateInputModel request){
		return JsonReader.read("update-BQInventoryDistributionOversightUpdateOutputModel.json",new TypeReference<BQInventoryDistributionOversightUpdateOutputModel>(){});
	}
	
	public BQInventoryProvisioningUpdateOutputModel updateInventoryprovisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryProvisioningUpdateInputModel request){
		return JsonReader.read("update-BQInventoryProvisioningUpdateOutputModel.json",new TypeReference<BQInventoryProvisioningUpdateOutputModel>(){});
	}
	
}
