package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyRequestStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SupplyRequestStatusList;
	
	
	
	

public class SupplyRequestStatusImplAdapter extends XmlAdapter<String, SupplyRequestStatus> {

	@Override
	public SupplyRequestStatus unmarshal(String v) throws Exception {
		SupplyRequestStatus result = FhirFactory.eINSTANCE.createSupplyRequestStatus();
		result.setValue(SupplyRequestStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(SupplyRequestStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
