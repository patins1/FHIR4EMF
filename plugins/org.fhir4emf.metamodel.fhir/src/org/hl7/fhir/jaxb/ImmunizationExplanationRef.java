package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationExplanation;

@XmlRootElement(name = "ImmunizationExplanationRefElement")
public class ImmunizationExplanationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImmunizationExplanation createInstance() {
		return FhirFactory.eINSTANCE.createImmunizationExplanation();
	}
	
	public static ImmunizationExplanationRef valueOf(String id) {
		ImmunizationExplanationRef result = new ImmunizationExplanationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}