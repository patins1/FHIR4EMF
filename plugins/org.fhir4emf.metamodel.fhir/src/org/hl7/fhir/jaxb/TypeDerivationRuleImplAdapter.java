package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TypeDerivationRule;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TypeDerivationRuleList;
	
	
	
	

public class TypeDerivationRuleImplAdapter extends XmlAdapter<String, TypeDerivationRule> {

	@Override
	public TypeDerivationRule unmarshal(String v) throws Exception {
		TypeDerivationRule result = FhirFactory.eINSTANCE.createTypeDerivationRule();
		result.setValue(TypeDerivationRuleList.get(v));
		return result;
	}

	@Override
	public String marshal(TypeDerivationRule v) throws Exception {
		return v.getValue().getLiteral();
	}

}
