package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProvenanceEntityRole;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ProvenanceEntityRoleList;
	
	
	
	

public class ProvenanceEntityRoleImplAdapter extends XmlAdapter<String, ProvenanceEntityRole> {

	@Override
	public ProvenanceEntityRole unmarshal(String v) throws Exception {
		ProvenanceEntityRole result = FhirFactory.eINSTANCE.createProvenanceEntityRole();
		result.setValue(ProvenanceEntityRoleList.get(v));
		return result;
	}

	@Override
	public String marshal(ProvenanceEntityRole v) throws Exception {
		return v.getValue().getLiteral();
	}

}
