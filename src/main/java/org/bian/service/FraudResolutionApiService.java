/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FraudResolutionApiService {

	SDFraudResolutionActivateOutputModel activate(SDFraudResolutionActivateInputModel request);
	
	SDFraudResolutionConfigureOutputModel configure(String sdReferenceId, SDFraudResolutionConfigureInputModel request);
	
	BQCaseDeterminationExchangeOutputModel exchangeCasedetermination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaseDeterminationExchangeInputModel request);
	
	CRFraudResolutionProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRFraudResolutionProcedureExchangeInputModel request);
	
	SDFraudResolutionFeedbackOutputModel feedback(String sdReferenceId, SDFraudResolutionFeedbackInputModel request);
	
	CRFraudResolutionProcedureInitiateOutputModel initiate(String sdReferenceId, CRFraudResolutionProcedureInitiateInputModel request);
	
	BQCaseResolutionRequestOutputModel requestCaseresolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaseResolutionRequestInputModel request);
	
	CRFraudResolutionProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQCaseAnalysisRetrieveOutputModel retrieveCaseanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCaseDeterminationRetrieveOutputModel retrieveCasedetermination(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCaseResolutionRetrieveOutputModel retrieveCaseresolution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDFraudResolutionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFraudResolutionProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFraudResolutionProcedureUpdateInputModel request);
	
}
