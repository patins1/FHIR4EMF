package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConceptMapElementRefElement")
public class ConceptMapElementRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConceptMapElement createInstance() {
		return FhirFactory.eINSTANCE.createConceptMapElement();
	}
	
	public static ConceptMapElementRef valueOf(String id) {
		ConceptMapElementRef result = new ConceptMapElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}