package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GuidanceResponseStatus;

@XmlRootElement(name = "GuidanceResponseStatusRefElement")
public class GuidanceResponseStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public GuidanceResponseStatus createInstance() {
		return FhirFactory.eINSTANCE.createGuidanceResponseStatus();
	}
	
	public static GuidanceResponseStatusRef valueOf(String id) {
		GuidanceResponseStatusRef result = new GuidanceResponseStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}