package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PractitionerRoleNotAvailable;

@XmlRootElement(name = "PractitionerRoleNotAvailableRefElement")
public class PractitionerRoleNotAvailableRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PractitionerRoleNotAvailable createInstance() {
		return FhirFactory.eINSTANCE.createPractitionerRoleNotAvailable();
	}
	
	public static PractitionerRoleNotAvailableRef valueOf(String id) {
		PractitionerRoleNotAvailableRef result = new PractitionerRoleNotAvailableRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}