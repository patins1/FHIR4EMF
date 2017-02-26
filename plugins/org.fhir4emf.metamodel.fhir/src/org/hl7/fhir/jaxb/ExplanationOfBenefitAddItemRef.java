package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitAddItemRefElement")
public class ExplanationOfBenefitAddItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitAddItem createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitAddItem();
	}
	
	public static ExplanationOfBenefitAddItemRef valueOf(String id) {
		ExplanationOfBenefitAddItemRef result = new ExplanationOfBenefitAddItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}