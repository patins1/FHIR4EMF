package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestIntent;

@XmlRootElement(name = "RequestIntentRefElement")
public class RequestIntentRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public RequestIntent createInstance() {
		return FhirFactory.eINSTANCE.createRequestIntent();
	}
	
	public static RequestIntentRef valueOf(String id) {
		RequestIntentRef result = new RequestIntentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}