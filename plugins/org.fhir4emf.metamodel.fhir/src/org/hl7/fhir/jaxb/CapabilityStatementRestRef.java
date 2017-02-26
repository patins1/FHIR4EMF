package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementRestRefElement")
public class CapabilityStatementRestRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementRest createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementRest();
	}
	
	public static CapabilityStatementRestRef valueOf(String id) {
		CapabilityStatementRestRef result = new CapabilityStatementRestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}