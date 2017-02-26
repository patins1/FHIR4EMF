package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Extension;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExtensionRefElement")
public class ExtensionRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Extension createInstance() {
		return FhirFactory.eINSTANCE.createExtension();
	}
	
	public static ExtensionRef valueOf(String id) {
		ExtensionRef result = new ExtensionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}