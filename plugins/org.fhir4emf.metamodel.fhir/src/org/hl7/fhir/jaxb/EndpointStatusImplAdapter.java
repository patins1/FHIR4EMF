package org.hl7.fhir.jaxb;

import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.EndpointStatusList;
	
	
	
	

public class EndpointStatusImplAdapter extends XmlAdapter<String, EndpointStatus> {

	@Override
	public EndpointStatus unmarshal(String v) throws Exception {
		EndpointStatus result = FhirFactory.eINSTANCE.createEndpointStatus();
		result.setValue(EndpointStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(EndpointStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
