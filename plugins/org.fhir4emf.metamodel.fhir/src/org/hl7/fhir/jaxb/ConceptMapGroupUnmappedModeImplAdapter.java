package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConceptMapGroupUnmappedModeList;
	
	
	
	

public class ConceptMapGroupUnmappedModeImplAdapter extends XmlAdapter<String, ConceptMapGroupUnmappedMode> {

	@Override
	public ConceptMapGroupUnmappedMode unmarshal(String v) throws Exception {
		ConceptMapGroupUnmappedMode result = FhirFactory.eINSTANCE.createConceptMapGroupUnmappedMode();
		result.setValue(ConceptMapGroupUnmappedModeList.get(v));
		return result;
	}

	@Override
	public String marshal(ConceptMapGroupUnmappedMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
