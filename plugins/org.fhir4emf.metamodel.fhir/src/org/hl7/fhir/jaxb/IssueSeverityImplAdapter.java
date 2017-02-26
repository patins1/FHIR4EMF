package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IssueSeverity;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.IssueSeverityList;
	
	
	
	

public class IssueSeverityImplAdapter extends XmlAdapter<String, IssueSeverity> {

	@Override
	public IssueSeverity unmarshal(String v) throws Exception {
		IssueSeverity result = FhirFactory.eINSTANCE.createIssueSeverity();
		result.setValue(IssueSeverityList.get(v));
		return result;
	}

	@Override
	public String marshal(IssueSeverity v) throws Exception {
		return v.getValue().getLiteral();
	}

}
