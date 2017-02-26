package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SlotStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SlotStatusList;
	
	
	
	

public class SlotStatusImplAdapter extends XmlAdapter<String, SlotStatus> {

	@Override
	public SlotStatus unmarshal(String v) throws Exception {
		SlotStatus result = FhirFactory.eINSTANCE.createSlotStatus();
		result.setValue(SlotStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(SlotStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
