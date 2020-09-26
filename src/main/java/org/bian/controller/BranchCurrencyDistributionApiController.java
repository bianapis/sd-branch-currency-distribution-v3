/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class BranchCurrencyDistributionApiController {

	@Autowired
	BranchCurrencyDistributionApiService service;
	
	@Process.Activate
	public BianResponse<SDBranchCurrencyDistributionActivateOutputModel> activate(@RequestBody BianRequest<SDBranchCurrencyDistributionActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDBranchCurrencyDistributionConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBranchCurrencyDistributionConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRCashDistributionProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCashDistributionProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("distributionplanning")
	@Process.Exchange
	public BianResponse<BQDistributionPlanningExchangeOutputModel> exchangeDistributionplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionPlanningExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDistributionplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventoryprovisioning")
	@Process.Exchange
	public BianResponse<BQInventoryProvisioningExchangeOutputModel> exchangeInventoryprovisioning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryProvisioningExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeInventoryprovisioning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Exchange
	public BianResponse<CRCashDistributionProcedureExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCashDistributionProcedureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRCashDistributionProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCashDistributionProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDBranchCurrencyDistributionFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBranchCurrencyDistributionFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCashDistributionProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCashDistributionProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("distributionplanning")
	@Process.Request
	public BianResponse<BQDistributionPlanningRequestOutputModel> requestDistributionplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionPlanningRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestDistributionplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("distributionvehicleadministration")
	@Process.Request
	public BianResponse<BQDistributionVehicleAdministrationRequestOutputModel> requestDistributionvehicleadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionVehicleAdministrationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestDistributionvehicleadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventorydistributionoversight")
	@Process.Request
	public BianResponse<BQInventoryDistributionOversightRequestOutputModel> requestInventorydistributionoversight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryDistributionOversightRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestInventorydistributionoversight(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventoryprovisioning")
	@Process.Request
	public BianResponse<BQInventoryProvisioningRequestOutputModel> requestInventoryprovisioning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryProvisioningRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestInventoryprovisioning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRCashDistributionProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCashDistributionProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRCashDistributionProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("distributionplanning")
	@Process.Retrieve
	public BianResponse<BQDistributionPlanningRetrieveOutputModel> retrieveDistributionplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDistributionplanning(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("distributionvehicleadministration")
	@Process.Retrieve
	public BianResponse<BQDistributionVehicleAdministrationRetrieveOutputModel> retrieveDistributionvehicleadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDistributionvehicleadministration(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("inventorydistributionoversight")
	@Process.Retrieve
	public BianResponse<BQInventoryDistributionOversightRetrieveOutputModel> retrieveInventorydistributionoversight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventorydistributionoversight(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("inventoryprovisioning")
	@Process.Retrieve
	public BianResponse<BQInventoryProvisioningRetrieveOutputModel> retrieveInventoryprovisioning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventoryprovisioning(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDBranchCurrencyDistributionRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCashDistributionProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCashDistributionProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("distributionplanning")
	@Process.Update
	public BianResponse<BQDistributionPlanningUpdateOutputModel> updateDistributionplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionPlanningUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDistributionplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("distributionvehicleadministration")
	@Process.Update
	public BianResponse<BQDistributionVehicleAdministrationUpdateOutputModel> updateDistributionvehicleadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionVehicleAdministrationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDistributionvehicleadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventorydistributionoversight")
	@Process.Update
	public BianResponse<BQInventoryDistributionOversightUpdateOutputModel> updateInventorydistributionoversight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryDistributionOversightUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInventorydistributionoversight(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventoryprovisioning")
	@Process.Update
	public BianResponse<BQInventoryProvisioningUpdateOutputModel> updateInventoryprovisioning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryProvisioningUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInventoryprovisioning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
