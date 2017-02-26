package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RiskAssessmentPrediction;

@XmlRootElement(name = "RiskAssessmentPredictionRefElement")
public class RiskAssessmentPredictionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public RiskAssessmentPrediction createInstance() {
		return FhirFactory.eINSTANCE.createRiskAssessmentPrediction();
	}
	
	public static RiskAssessmentPredictionRef valueOf(String id) {
		RiskAssessmentPredictionRef result = new RiskAssessmentPredictionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}