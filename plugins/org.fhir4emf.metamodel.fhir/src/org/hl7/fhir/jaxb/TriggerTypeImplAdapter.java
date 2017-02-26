package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TriggerType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TriggerTypeList;
	
	
	
	

public class TriggerTypeImplAdapter extends XmlAdapter<String, TriggerType> {

	@Override
	public TriggerType unmarshal(String v) throws Exception {
		TriggerType result = FhirFactory.eINSTANCE.createTriggerType();
		result.setValue(TriggerTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(TriggerType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
