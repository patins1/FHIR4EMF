package org.hl7.fhir.jaxb;

import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.BindingStrengthList;
	
	
	
	

public class BindingStrengthImplAdapter extends XmlAdapter<String, BindingStrength> {

	@Override
	public BindingStrength unmarshal(String v) throws Exception {
		BindingStrength result = FhirFactory.eINSTANCE.createBindingStrength();
		result.setValue(BindingStrengthList.get(v));
		return result;
	}

	@Override
	public String marshal(BindingStrength v) throws Exception {
		return v.getValue().getLiteral();
	}

}
