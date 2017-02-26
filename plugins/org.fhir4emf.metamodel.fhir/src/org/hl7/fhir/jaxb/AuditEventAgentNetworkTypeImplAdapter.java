package org.hl7.fhir.jaxb;

import org.hl7.fhir.AuditEventAgentNetworkType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AuditEventAgentNetworkTypeList;
	
	
	
	

public class AuditEventAgentNetworkTypeImplAdapter extends XmlAdapter<String, AuditEventAgentNetworkType> {

	@Override
	public AuditEventAgentNetworkType unmarshal(String v) throws Exception {
		AuditEventAgentNetworkType result = FhirFactory.eINSTANCE.createAuditEventAgentNetworkType();
		result.setValue(AuditEventAgentNetworkTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(AuditEventAgentNetworkType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
