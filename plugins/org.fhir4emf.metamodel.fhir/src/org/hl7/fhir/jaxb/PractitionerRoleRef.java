package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PractitionerRole;

@XmlRootElement(name = "PractitionerRoleRefElement")
public class PractitionerRoleRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public PractitionerRole createInstance() {
		return FhirFactory.eINSTANCE.createPractitionerRole();
	}
	
	public static PractitionerRoleRef valueOf(String id) {
		PractitionerRoleRef result = new PractitionerRoleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}