package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PractitionerRoleAvailableTime;

@XmlRootElement(name = "PractitionerRoleAvailableTimeRefElement")
public class PractitionerRoleAvailableTimeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PractitionerRoleAvailableTime createInstance() {
		return FhirFactory.eINSTANCE.createPractitionerRoleAvailableTime();
	}
	
	public static PractitionerRoleAvailableTimeRef valueOf(String id) {
		PractitionerRoleAvailableTimeRef result = new PractitionerRoleAvailableTimeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}