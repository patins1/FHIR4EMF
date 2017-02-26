package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitCareTeamRefElement")
public class ExplanationOfBenefitCareTeamRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitCareTeam createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitCareTeam();
	}
	
	public static ExplanationOfBenefitCareTeamRef valueOf(String id) {
		ExplanationOfBenefitCareTeamRef result = new ExplanationOfBenefitCareTeamRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}