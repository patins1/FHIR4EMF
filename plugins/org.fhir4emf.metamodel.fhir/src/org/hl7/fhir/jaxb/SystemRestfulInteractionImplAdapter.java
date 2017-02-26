package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SystemRestfulInteraction;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SystemRestfulInteractionList;
	
	
	
	

public class SystemRestfulInteractionImplAdapter extends XmlAdapter<String, SystemRestfulInteraction> {

	@Override
	public SystemRestfulInteraction unmarshal(String v) throws Exception {
		SystemRestfulInteraction result = FhirFactory.eINSTANCE.createSystemRestfulInteraction();
		result.setValue(SystemRestfulInteractionList.get(v));
		return result;
	}

	@Override
	public String marshal(SystemRestfulInteraction v) throws Exception {
		return v.getValue().getLiteral();
	}

}
