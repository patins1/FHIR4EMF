package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImplementationGuide;

@XmlRootElement(name = "ImplementationGuideRefElement")
public class ImplementationGuideRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ImplementationGuide createInstance() {
		return FhirFactory.eINSTANCE.createImplementationGuide();
	}
	
	public static ImplementationGuideRef valueOf(String id) {
		ImplementationGuideRef result = new ImplementationGuideRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}