package org.hl7.fhir.jaxb;

import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AuditEventActionList;
	
	
	
	

public class AuditEventActionImplAdapter extends XmlAdapter<String, AuditEventAction> {

	@Override
	public AuditEventAction unmarshal(String v) throws Exception {
		AuditEventAction result = FhirFactory.eINSTANCE.createAuditEventAction();
		result.setValue(AuditEventActionList.get(v));
		return result;
	}

	@Override
	public String marshal(AuditEventAction v) throws Exception {
		return v.getValue().getLiteral();
	}

}
