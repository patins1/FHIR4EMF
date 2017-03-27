package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConceptMapGroupUnmappedModeRefElement")
public class ConceptMapGroupUnmappedModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConceptMapGroupUnmappedMode createInstance() {
		return FhirFactory.eINSTANCE.createConceptMapGroupUnmappedMode();
	}
	
	public static ConceptMapGroupUnmappedModeRef valueOf(String id) {
		ConceptMapGroupUnmappedModeRef result = new ConceptMapGroupUnmappedModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}