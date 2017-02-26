package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSetConcept;

@XmlRootElement(name = "ValueSetConceptRefElement")
public class ValueSetConceptRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ValueSetConcept createInstance() {
		return FhirFactory.eINSTANCE.createValueSetConcept();
	}
	
	public static ValueSetConceptRef valueOf(String id) {
		ValueSetConceptRef result = new ValueSetConceptRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}