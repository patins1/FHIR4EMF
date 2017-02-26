package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResponseType;

@XmlRootElement(name = "ResponseTypeRefElement")
public class ResponseTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ResponseType createInstance() {
		return FhirFactory.eINSTANCE.createResponseType();
	}
	
	public static ResponseTypeRef valueOf(String id) {
		ResponseTypeRef result = new ResponseTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}