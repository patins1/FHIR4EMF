package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GraphCompartmentRule;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.GraphCompartmentRuleList;
	
	
	
	

public class GraphCompartmentRuleImplAdapter extends XmlAdapter<String, GraphCompartmentRule> {

	@Override
	public GraphCompartmentRule unmarshal(String v) throws Exception {
		GraphCompartmentRule result = FhirFactory.eINSTANCE.createGraphCompartmentRule();
		result.setValue(GraphCompartmentRuleList.get(v));
		return result;
	}

	@Override
	public String marshal(GraphCompartmentRule v) throws Exception {
		return v.getValue().getLiteral();
	}

}
