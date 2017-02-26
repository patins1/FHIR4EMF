package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TypeRestfulInteraction;

@XmlRootElement(name = "TypeRestfulInteractionRefElement")
public class TypeRestfulInteractionRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TypeRestfulInteraction createInstance() {
		return FhirFactory.eINSTANCE.createTypeRestfulInteraction();
	}
	
	public static TypeRestfulInteractionRef valueOf(String id) {
		TypeRestfulInteractionRef result = new TypeRestfulInteractionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}