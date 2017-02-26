package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitInformation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitInformationRefElement")
public class ExplanationOfBenefitInformationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitInformation createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitInformation();
	}
	
	public static ExplanationOfBenefitInformationRef valueOf(String id) {
		ExplanationOfBenefitInformationRef result = new ExplanationOfBenefitInformationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}