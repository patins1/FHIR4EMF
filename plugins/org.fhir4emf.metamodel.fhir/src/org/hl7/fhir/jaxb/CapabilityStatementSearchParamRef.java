package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementSearchParamRefElement")
public class CapabilityStatementSearchParamRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementSearchParam createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementSearchParam();
	}
	
	public static CapabilityStatementSearchParamRef valueOf(String id) {
		CapabilityStatementSearchParamRef result = new CapabilityStatementSearchParamRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}