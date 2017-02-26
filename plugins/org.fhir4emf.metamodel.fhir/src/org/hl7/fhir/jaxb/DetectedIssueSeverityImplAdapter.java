package org.hl7.fhir.jaxb;

import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DetectedIssueSeverityList;
	
	
	
	

public class DetectedIssueSeverityImplAdapter extends XmlAdapter<String, DetectedIssueSeverity> {

	@Override
	public DetectedIssueSeverity unmarshal(String v) throws Exception {
		DetectedIssueSeverity result = FhirFactory.eINSTANCE.createDetectedIssueSeverity();
		result.setValue(DetectedIssueSeverityList.get(v));
		return result;
	}

	@Override
	public String marshal(DetectedIssueSeverity v) throws Exception {
		return v.getValue().getLiteral();
	}

}
