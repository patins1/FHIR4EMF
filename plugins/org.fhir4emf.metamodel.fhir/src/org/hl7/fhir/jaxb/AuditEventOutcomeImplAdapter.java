package org.hl7.fhir.jaxb;

import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AuditEventOutcomeList;
	
	
	
	

public class AuditEventOutcomeImplAdapter extends XmlAdapter<String, AuditEventOutcome> {

	@Override
	public AuditEventOutcome unmarshal(String v) throws Exception {
		AuditEventOutcome result = FhirFactory.eINSTANCE.createAuditEventOutcome();
		result.setValue(AuditEventOutcomeList.get(v));
		return result;
	}

	@Override
	public String marshal(AuditEventOutcome v) throws Exception {
		return v.getValue().getLiteral();
	}

}
