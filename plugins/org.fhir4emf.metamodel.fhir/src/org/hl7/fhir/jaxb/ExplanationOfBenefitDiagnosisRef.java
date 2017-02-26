package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitDiagnosisRefElement")
public class ExplanationOfBenefitDiagnosisRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitDiagnosis createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitDiagnosis();
	}
	
	public static ExplanationOfBenefitDiagnosisRef valueOf(String id) {
		ExplanationOfBenefitDiagnosisRef result = new ExplanationOfBenefitDiagnosisRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}