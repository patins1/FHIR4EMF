package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitItemRefElement")
public class ExplanationOfBenefitItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitItem createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitItem();
	}
	
	public static ExplanationOfBenefitItemRef valueOf(String id) {
		ExplanationOfBenefitItemRef result = new ExplanationOfBenefitItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}