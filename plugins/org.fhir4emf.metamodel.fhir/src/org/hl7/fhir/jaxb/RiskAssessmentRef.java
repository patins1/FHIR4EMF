package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RiskAssessment;

@XmlRootElement(name = "RiskAssessmentRefElement")
public class RiskAssessmentRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public RiskAssessment createInstance() {
		return FhirFactory.eINSTANCE.createRiskAssessment();
	}
	
	public static RiskAssessmentRef valueOf(String id) {
		RiskAssessmentRef result = new RiskAssessmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}