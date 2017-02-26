package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementKindRefElement")
public class CapabilityStatementKindRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CapabilityStatementKind createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementKind();
	}
	
	public static CapabilityStatementKindRef valueOf(String id) {
		CapabilityStatementKindRef result = new CapabilityStatementKindRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}