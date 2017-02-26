package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Uri;

@XmlRootElement(name = "UriRefElement")
public class UriRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Uri createInstance() {
		return FhirFactory.eINSTANCE.createUri();
	}
	
	public static UriRef valueOf(String id) {
		UriRef result = new UriRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}