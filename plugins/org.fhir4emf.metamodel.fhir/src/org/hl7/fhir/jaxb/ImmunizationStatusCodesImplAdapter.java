package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationStatusCodes;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ImmunizationStatusCodesList;
	
	
	
	

public class ImmunizationStatusCodesImplAdapter extends XmlAdapter<String, ImmunizationStatusCodes> {

	@Override
	public ImmunizationStatusCodes unmarshal(String v) throws Exception {
		ImmunizationStatusCodes result = FhirFactory.eINSTANCE.createImmunizationStatusCodes();
		result.setValue(ImmunizationStatusCodesList.get(v));
		return result;
	}

	@Override
	public String marshal(ImmunizationStatusCodes v) throws Exception {
		return v.getValue().getLiteral();
	}

}
