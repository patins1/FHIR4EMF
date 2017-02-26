package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitStatusRefElement")
public class ExplanationOfBenefitStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ExplanationOfBenefitStatus createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitStatus();
	}
	
	public static ExplanationOfBenefitStatusRef valueOf(String id) {
		ExplanationOfBenefitStatusRef result = new ExplanationOfBenefitStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}