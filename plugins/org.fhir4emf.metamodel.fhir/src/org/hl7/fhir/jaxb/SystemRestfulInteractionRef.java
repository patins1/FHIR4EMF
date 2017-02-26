package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SystemRestfulInteraction;

@XmlRootElement(name = "SystemRestfulInteractionRefElement")
public class SystemRestfulInteractionRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SystemRestfulInteraction createInstance() {
		return FhirFactory.eINSTANCE.createSystemRestfulInteraction();
	}
	
	public static SystemRestfulInteractionRef valueOf(String id) {
		SystemRestfulInteractionRef result = new SystemRestfulInteractionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}