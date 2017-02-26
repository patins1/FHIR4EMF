package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RemittanceOutcome;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.RemittanceOutcomeList;
	
	
	
	

public class RemittanceOutcomeImplAdapter extends XmlAdapter<String, RemittanceOutcome> {

	@Override
	public RemittanceOutcome unmarshal(String v) throws Exception {
		RemittanceOutcome result = FhirFactory.eINSTANCE.createRemittanceOutcome();
		result.setValue(RemittanceOutcomeList.get(v));
		return result;
	}

	@Override
	public String marshal(RemittanceOutcome v) throws Exception {
		return v.getValue().getLiteral();
	}

}
