package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConceptMapUnmapped;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConceptMapUnmappedRefElement")
public class ConceptMapUnmappedRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConceptMapUnmapped createInstance() {
		return FhirFactory.eINSTANCE.createConceptMapUnmapped();
	}
	
	public static ConceptMapUnmappedRef valueOf(String id) {
		ConceptMapUnmappedRef result = new ConceptMapUnmappedRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}