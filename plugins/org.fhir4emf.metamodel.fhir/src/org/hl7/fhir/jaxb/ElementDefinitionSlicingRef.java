package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionSlicingRefElement")
public class ElementDefinitionSlicingRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinitionSlicing createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinitionSlicing();
	}
	
	public static ElementDefinitionSlicingRef valueOf(String id) {
		ElementDefinitionSlicingRef result = new ElementDefinitionSlicingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}