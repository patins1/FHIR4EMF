package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExtensionContextRefElement")
public class ExtensionContextRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ExtensionContext createInstance() {
		return FhirFactory.eINSTANCE.createExtensionContext();
	}
	
	public static ExtensionContextRef valueOf(String id) {
		ExtensionContextRef result = new ExtensionContextRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}