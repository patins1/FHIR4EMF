package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ReferenceVersionRules;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ReferenceVersionRulesList;
	
	
	
	

public class ReferenceVersionRulesImplAdapter extends XmlAdapter<String, ReferenceVersionRules> {

	@Override
	public ReferenceVersionRules unmarshal(String v) throws Exception {
		ReferenceVersionRules result = FhirFactory.eINSTANCE.createReferenceVersionRules();
		result.setValue(ReferenceVersionRulesList.get(v));
		return result;
	}

	@Override
	public String marshal(ReferenceVersionRules v) throws Exception {
		return v.getValue().getLiteral();
	}

}
