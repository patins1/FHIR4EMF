package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementInteraction1RefElement")
public class CapabilityStatementInteraction1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementInteraction1 createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementInteraction1();
	}
	
	public static CapabilityStatementInteraction1Ref valueOf(String id) {
		CapabilityStatementInteraction1Ref result = new CapabilityStatementInteraction1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}