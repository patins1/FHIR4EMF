package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.HTTPVerb;

@XmlRootElement(name = "HTTPVerbRefElement")
public class HTTPVerbRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public HTTPVerb createInstance() {
		return FhirFactory.eINSTANCE.createHTTPVerb();
	}
	
	public static HTTPVerbRef valueOf(String id) {
		HTTPVerbRef result = new HTTPVerbRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}