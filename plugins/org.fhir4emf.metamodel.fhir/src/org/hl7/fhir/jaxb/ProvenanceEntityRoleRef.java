package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProvenanceEntityRole;

@XmlRootElement(name = "ProvenanceEntityRoleRefElement")
public class ProvenanceEntityRoleRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ProvenanceEntityRole createInstance() {
		return FhirFactory.eINSTANCE.createProvenanceEntityRole();
	}
	
	public static ProvenanceEntityRoleRef valueOf(String id) {
		ProvenanceEntityRoleRef result = new ProvenanceEntityRoleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}