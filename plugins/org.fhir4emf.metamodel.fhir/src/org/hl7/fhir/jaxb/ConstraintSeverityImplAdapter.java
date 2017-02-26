package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConstraintSeverityList;
	
	
	
	

public class ConstraintSeverityImplAdapter extends XmlAdapter<String, ConstraintSeverity> {

	@Override
	public ConstraintSeverity unmarshal(String v) throws Exception {
		ConstraintSeverity result = FhirFactory.eINSTANCE.createConstraintSeverity();
		result.setValue(ConstraintSeverityList.get(v));
		return result;
	}

	@Override
	public String marshal(ConstraintSeverity v) throws Exception {
		return v.getValue().getLiteral();
	}

}
