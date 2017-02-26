package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Provenance;

@XmlRootElement(name = "ProvenanceRefElement")
public class ProvenanceRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Provenance createInstance() {
		return FhirFactory.eINSTANCE.createProvenance();
	}
	
	public static ProvenanceRef valueOf(String id) {
		ProvenanceRef result = new ProvenanceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}