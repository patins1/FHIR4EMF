package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitSubDetailRefElement")
public class ExplanationOfBenefitSubDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitSubDetail createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitSubDetail();
	}
	
	public static ExplanationOfBenefitSubDetailRef valueOf(String id) {
		ExplanationOfBenefitSubDetailRef result = new ExplanationOfBenefitSubDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}