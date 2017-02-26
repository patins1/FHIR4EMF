package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConceptMapEquivalenceList;
	
	
	
	

public class ConceptMapEquivalenceImplAdapter extends XmlAdapter<String, ConceptMapEquivalence> {

	@Override
	public ConceptMapEquivalence unmarshal(String v) throws Exception {
		ConceptMapEquivalence result = FhirFactory.eINSTANCE.createConceptMapEquivalence();
		result.setValue(ConceptMapEquivalenceList.get(v));
		return result;
	}

	@Override
	public String marshal(ConceptMapEquivalence v) throws Exception {
		return v.getValue().getLiteral();
	}

}
