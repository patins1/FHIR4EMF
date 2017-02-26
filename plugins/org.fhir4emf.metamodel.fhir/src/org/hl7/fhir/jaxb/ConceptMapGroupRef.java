package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConceptMapGroupRefElement")
public class ConceptMapGroupRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConceptMapGroup createInstance() {
		return FhirFactory.eINSTANCE.createConceptMapGroup();
	}
	
	public static ConceptMapGroupRef valueOf(String id) {
		ConceptMapGroupRef result = new ConceptMapGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}