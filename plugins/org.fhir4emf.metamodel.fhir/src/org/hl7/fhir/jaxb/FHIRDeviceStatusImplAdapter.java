package org.hl7.fhir.jaxb;

import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.FHIRDeviceStatusList;
	
	
	
	

public class FHIRDeviceStatusImplAdapter extends XmlAdapter<String, FHIRDeviceStatus> {

	@Override
	public FHIRDeviceStatus unmarshal(String v) throws Exception {
		FHIRDeviceStatus result = FhirFactory.eINSTANCE.createFHIRDeviceStatus();
		result.setValue(FHIRDeviceStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(FHIRDeviceStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
