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
public class FraudResolutionApiServiceImpl implements FraudResolutionApiService {

	public SDFraudResolutionActivateOutputModel activate(SDFraudResolutionActivateInputModel request){
		return JsonReader.read("activate-SDFraudResolutionActivateOutputModel.json",new TypeReference<SDFraudResolutionActivateOutputModel>(){});
	}
	
	public SDFraudResolutionConfigureOutputModel configure(String sdReferenceId, SDFraudResolutionConfigureInputModel request){
		return JsonReader.read("configure-SDFraudResolutionConfigureOutputModel.json",new TypeReference<SDFraudResolutionConfigureOutputModel>(){});
	}
	
	public BQCaseDeterminationExchangeOutputModel exchangeCasedetermination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaseDeterminationExchangeInputModel request){
		return JsonReader.read("exchange-BQCaseDeterminationExchangeOutputModel.json",new TypeReference<BQCaseDeterminationExchangeOutputModel>(){});
	}
	
	public CRFraudResolutionProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRFraudResolutionProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRFraudResolutionProcedureExchangeOutputModel.json",new TypeReference<CRFraudResolutionProcedureExchangeOutputModel>(){});
	}
	
	public SDFraudResolutionFeedbackOutputModel feedback(String sdReferenceId, SDFraudResolutionFeedbackInputModel request){
		return JsonReader.read("feedback-SDFraudResolutionFeedbackOutputModel.json",new TypeReference<SDFraudResolutionFeedbackOutputModel>(){});
	}
	
	public CRFraudResolutionProcedureInitiateOutputModel initiate(String sdReferenceId, CRFraudResolutionProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRFraudResolutionProcedureInitiateOutputModel.json",new TypeReference<CRFraudResolutionProcedureInitiateOutputModel>(){});
	}
	
	public BQCaseResolutionRequestOutputModel requestCaseresolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaseResolutionRequestInputModel request){
		return JsonReader.read("request-BQCaseResolutionRequestOutputModel.json",new TypeReference<BQCaseResolutionRequestOutputModel>(){});
	}
	
	public CRFraudResolutionProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFraudResolutionProcedureRetrieveOutputModel.json",new TypeReference<CRFraudResolutionProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCaseAnalysisRetrieveOutputModel retrieveCaseanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCaseAnalysisRetrieveOutputModel.json",new TypeReference<BQCaseAnalysisRetrieveOutputModel>(){});
	}
	
	public BQCaseDeterminationRetrieveOutputModel retrieveCasedetermination(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCaseDeterminationRetrieveOutputModel.json",new TypeReference<BQCaseDeterminationRetrieveOutputModel>(){});
	}
	
	public BQCaseResolutionRetrieveOutputModel retrieveCaseresolution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCaseResolutionRetrieveOutputModel.json",new TypeReference<BQCaseResolutionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDFraudResolutionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFraudResolutionRetrieveOutputModel.json",new TypeReference<SDFraudResolutionRetrieveOutputModel>(){});
	}
	
	public CRFraudResolutionProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFraudResolutionProcedureUpdateInputModel request){
		return JsonReader.read("update-CRFraudResolutionProcedureUpdateOutputModel.json",new TypeReference<CRFraudResolutionProcedureUpdateOutputModel>(){});
	}
	
}
