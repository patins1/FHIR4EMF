package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProvenanceAgent;

@XmlRootElement(name = "ProvenanceAgentRefElement")
public class ProvenanceAgentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ProvenanceAgent createInstance() {
		return FhirFactory.eINSTANCE.createProvenanceAgent();
	}
	
	public static ProvenanceAgentRef valueOf(String id) {
		ProvenanceAgentRef result = new ProvenanceAgentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}