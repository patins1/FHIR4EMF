package org.hl7.fhir.jaxb;

import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CapabilityStatementKindList;
	
	
	
	

public class CapabilityStatementKindImplAdapter extends XmlAdapter<String, CapabilityStatementKind> {

	@Override
	public CapabilityStatementKind unmarshal(String v) throws Exception {
		CapabilityStatementKind result = FhirFactory.eINSTANCE.createCapabilityStatementKind();
		result.setValue(CapabilityStatementKindList.get(v));
		return result;
	}

	@Override
	public String marshal(CapabilityStatementKind v) throws Exception {
		return v.getValue().getLiteral();
	}

}
