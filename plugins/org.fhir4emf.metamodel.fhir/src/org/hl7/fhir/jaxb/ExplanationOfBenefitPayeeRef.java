package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitPayeeRefElement")
public class ExplanationOfBenefitPayeeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitPayee createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitPayee();
	}
	
	public static ExplanationOfBenefitPayeeRef valueOf(String id) {
		ExplanationOfBenefitPayeeRef result = new ExplanationOfBenefitPayeeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}