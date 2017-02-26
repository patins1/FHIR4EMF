package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.InstanceAvailability;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.InstanceAvailabilityList;
	
	
	
	

public class InstanceAvailabilityImplAdapter extends XmlAdapter<String, InstanceAvailability> {

	@Override
	public InstanceAvailability unmarshal(String v) throws Exception {
		InstanceAvailability result = FhirFactory.eINSTANCE.createInstanceAvailability();
		result.setValue(InstanceAvailabilityList.get(v));
		return result;
	}

	@Override
	public String marshal(InstanceAvailability v) throws Exception {
		return v.getValue().getLiteral();
	}

}
