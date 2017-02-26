package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitAccidentRefElement")
public class ExplanationOfBenefitAccidentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitAccident createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitAccident();
	}
	
	public static ExplanationOfBenefitAccidentRef valueOf(String id) {
		ExplanationOfBenefitAccidentRef result = new ExplanationOfBenefitAccidentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}