package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PublicationStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.PublicationStatusList;
	
	
	
	

public class PublicationStatusImplAdapter extends XmlAdapter<String, PublicationStatus> {

	@Override
	public PublicationStatus unmarshal(String v) throws Exception {
		PublicationStatus result = FhirFactory.eINSTANCE.createPublicationStatus();
		result.setValue(PublicationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(PublicationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
