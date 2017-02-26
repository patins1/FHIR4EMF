package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitRelatedRefElement")
public class ExplanationOfBenefitRelatedRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitRelated createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitRelated();
	}
	
	public static ExplanationOfBenefitRelatedRef valueOf(String id) {
		ExplanationOfBenefitRelatedRef result = new ExplanationOfBenefitRelatedRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}