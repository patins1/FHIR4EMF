package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConceptMapDependsOnRefElement")
public class ConceptMapDependsOnRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConceptMapDependsOn createInstance() {
		return FhirFactory.eINSTANCE.createConceptMapDependsOn();
	}
	
	public static ConceptMapDependsOnRef valueOf(String id) {
		ConceptMapDependsOnRef result = new ConceptMapDependsOnRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}