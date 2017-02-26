package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImplementationGuideResource;

@XmlRootElement(name = "ImplementationGuideResourceRefElement")
public class ImplementationGuideResourceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImplementationGuideResource createInstance() {
		return FhirFactory.eINSTANCE.createImplementationGuideResource();
	}
	
	public static ImplementationGuideResourceRef valueOf(String id) {
		ImplementationGuideResourceRef result = new ImplementationGuideResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}