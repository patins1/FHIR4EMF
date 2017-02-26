package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConceptMapTargetRefElement")
public class ConceptMapTargetRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConceptMapTarget createInstance() {
		return FhirFactory.eINSTANCE.createConceptMapTarget();
	}
	
	public static ConceptMapTargetRef valueOf(String id) {
		ConceptMapTargetRef result = new ConceptMapTargetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}