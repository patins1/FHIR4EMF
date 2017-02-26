package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
	
	
	

public class BooleanImplAdapter extends XmlAdapter<Boolean, org.hl7.fhir.Boolean> {

	@Override
	public org.hl7.fhir.Boolean unmarshal(Boolean v) throws Exception {
		org.hl7.fhir.Boolean result = FhirFactory.eINSTANCE.createBoolean();
		result.setValue(v);
		return result;
	}

	@Override
	public Boolean marshal(org.hl7.fhir.Boolean v) throws Exception {
		return v.isValue();
	}

}
