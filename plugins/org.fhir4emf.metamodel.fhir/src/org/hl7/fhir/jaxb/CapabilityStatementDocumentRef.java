package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementDocumentRefElement")
public class CapabilityStatementDocumentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementDocument createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementDocument();
	}
	
	public static CapabilityStatementDocumentRef valueOf(String id) {
		CapabilityStatementDocumentRef result = new CapabilityStatementDocumentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}