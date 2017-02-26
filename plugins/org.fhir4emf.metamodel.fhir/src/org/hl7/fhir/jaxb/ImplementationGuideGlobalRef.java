package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImplementationGuideGlobal;

@XmlRootElement(name = "ImplementationGuideGlobalRefElement")
public class ImplementationGuideGlobalRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImplementationGuideGlobal createInstance() {
		return FhirFactory.eINSTANCE.createImplementationGuideGlobal();
	}
	
	public static ImplementationGuideGlobalRef valueOf(String id) {
		ImplementationGuideGlobalRef result = new ImplementationGuideGlobalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}