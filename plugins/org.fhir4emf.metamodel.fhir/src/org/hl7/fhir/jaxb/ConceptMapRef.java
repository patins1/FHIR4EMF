package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConceptMapRefElement")
public class ConceptMapRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ConceptMap createInstance() {
		return FhirFactory.eINSTANCE.createConceptMap();
	}
	
	public static ConceptMapRef valueOf(String id) {
		ConceptMapRef result = new ConceptMapRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}