package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitDetailRefElement")
public class ExplanationOfBenefitDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitDetail createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitDetail();
	}
	
	public static ExplanationOfBenefitDetailRef valueOf(String id) {
		ExplanationOfBenefitDetailRef result = new ExplanationOfBenefitDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}