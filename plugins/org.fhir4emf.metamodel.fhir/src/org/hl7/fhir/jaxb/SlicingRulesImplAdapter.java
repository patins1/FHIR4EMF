package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SlicingRules;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SlicingRulesList;
	
	
	
	

public class SlicingRulesImplAdapter extends XmlAdapter<String, SlicingRules> {

	@Override
	public SlicingRules unmarshal(String v) throws Exception {
		SlicingRules result = FhirFactory.eINSTANCE.createSlicingRules();
		result.setValue(SlicingRulesList.get(v));
		return result;
	}

	@Override
	public String marshal(SlicingRules v) throws Exception {
		return v.getValue().getLiteral();
	}

}
