package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitRefElement")
public class ExplanationOfBenefitRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ExplanationOfBenefit createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefit();
	}
	
	public static ExplanationOfBenefitRef valueOf(String id) {
		ExplanationOfBenefitRef result = new ExplanationOfBenefitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}