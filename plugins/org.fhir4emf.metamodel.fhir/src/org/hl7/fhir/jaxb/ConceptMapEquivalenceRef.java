package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConceptMapEquivalenceRefElement")
public class ConceptMapEquivalenceRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConceptMapEquivalence createInstance() {
		return FhirFactory.eINSTANCE.createConceptMapEquivalence();
	}
	
	public static ConceptMapEquivalenceRef valueOf(String id) {
		ConceptMapEquivalenceRef result = new ConceptMapEquivalenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}