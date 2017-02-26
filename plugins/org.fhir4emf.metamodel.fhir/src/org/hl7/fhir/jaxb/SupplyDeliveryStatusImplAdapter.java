package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyDeliveryStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SupplyDeliveryStatusList;
	
	
	
	

public class SupplyDeliveryStatusImplAdapter extends XmlAdapter<String, SupplyDeliveryStatus> {

	@Override
	public SupplyDeliveryStatus unmarshal(String v) throws Exception {
		SupplyDeliveryStatus result = FhirFactory.eINSTANCE.createSupplyDeliveryStatus();
		result.setValue(SupplyDeliveryStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(SupplyDeliveryStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
