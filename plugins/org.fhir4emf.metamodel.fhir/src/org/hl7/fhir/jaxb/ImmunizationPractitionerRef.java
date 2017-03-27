package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationPractitioner;

@XmlRootElement(name = "ImmunizationPractitionerRefElement")
public class ImmunizationPractitionerRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImmunizationPractitioner createInstance() {
		return FhirFactory.eINSTANCE.createImmunizationPractitioner();
	}
	
	public static ImmunizationPractitionerRef valueOf(String id) {
		ImmunizationPractitionerRef result = new ImmunizationPractitionerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}