package org.hl7.fhir.jaxb;

import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ChargeItemStatusList;
	
	
	
	

public class ChargeItemStatusImplAdapter extends XmlAdapter<String, ChargeItemStatus> {

	@Override
	public ChargeItemStatus unmarshal(String v) throws Exception {
		ChargeItemStatus result = FhirFactory.eINSTANCE.createChargeItemStatus();
		result.setValue(ChargeItemStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ChargeItemStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
