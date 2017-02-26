package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IdentityAssuranceLevel;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.IdentityAssuranceLevelList;
	
	
	
	

public class IdentityAssuranceLevelImplAdapter extends XmlAdapter<String, IdentityAssuranceLevel> {

	@Override
	public IdentityAssuranceLevel unmarshal(String v) throws Exception {
		IdentityAssuranceLevel result = FhirFactory.eINSTANCE.createIdentityAssuranceLevel();
		result.setValue(IdentityAssuranceLevelList.get(v));
		return result;
	}

	@Override
	public String marshal(IdentityAssuranceLevel v) throws Exception {
		return v.getValue().getLiteral();
	}

}
