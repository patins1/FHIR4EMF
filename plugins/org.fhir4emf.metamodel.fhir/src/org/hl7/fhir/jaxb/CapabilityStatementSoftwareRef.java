package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementSoftware;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementSoftwareRefElement")
public class CapabilityStatementSoftwareRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementSoftware createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementSoftware();
	}
	
	public static CapabilityStatementSoftwareRef valueOf(String id) {
		CapabilityStatementSoftwareRef result = new CapabilityStatementSoftwareRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}