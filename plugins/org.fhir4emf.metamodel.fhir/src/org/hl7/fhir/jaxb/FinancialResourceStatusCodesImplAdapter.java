package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FinancialResourceStatusCodes;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.FinancialResourceStatusCodesList;
	
	
	
	

public class FinancialResourceStatusCodesImplAdapter extends XmlAdapter<String, FinancialResourceStatusCodes> {

	@Override
	public FinancialResourceStatusCodes unmarshal(String v) throws Exception {
		FinancialResourceStatusCodes result = FhirFactory.eINSTANCE.createFinancialResourceStatusCodes();
		result.setValue(FinancialResourceStatusCodesList.get(v));
		return result;
	}

	@Override
	public String marshal(FinancialResourceStatusCodes v) throws Exception {
		return v.getValue().getLiteral();
	}

}
