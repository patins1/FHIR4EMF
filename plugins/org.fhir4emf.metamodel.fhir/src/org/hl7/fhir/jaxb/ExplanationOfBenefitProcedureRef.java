package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitProcedureRefElement")
public class ExplanationOfBenefitProcedureRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitProcedure createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitProcedure();
	}
	
	public static ExplanationOfBenefitProcedureRef valueOf(String id) {
		ExplanationOfBenefitProcedureRef result = new ExplanationOfBenefitProcedureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}