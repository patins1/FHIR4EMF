package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProvenanceEntity;

@XmlRootElement(name = "ProvenanceEntityRefElement")
public class ProvenanceEntityRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ProvenanceEntity createInstance() {
		return FhirFactory.eINSTANCE.createProvenanceEntity();
	}
	
	public static ProvenanceEntityRef valueOf(String id) {
		ProvenanceEntityRef result = new ProvenanceEntityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}