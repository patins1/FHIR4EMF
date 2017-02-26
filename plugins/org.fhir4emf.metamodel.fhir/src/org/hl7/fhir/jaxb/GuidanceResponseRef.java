package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GuidanceResponse;

@XmlRootElement(name = "GuidanceResponseRefElement")
public class GuidanceResponseRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public GuidanceResponse createInstance() {
		return FhirFactory.eINSTANCE.createGuidanceResponse();
	}
	
	public static GuidanceResponseRef valueOf(String id) {
		GuidanceResponseRef result = new GuidanceResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}