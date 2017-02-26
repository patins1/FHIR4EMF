package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitDetail1RefElement")
public class ExplanationOfBenefitDetail1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitDetail1 createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitDetail1();
	}
	
	public static ExplanationOfBenefitDetail1Ref valueOf(String id) {
		ExplanationOfBenefitDetail1Ref result = new ExplanationOfBenefitDetail1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}