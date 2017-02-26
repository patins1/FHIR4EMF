package org.hl7.fhir.jaxb;

import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ContactPointSystemList;
	
	
	
	

public class ContactPointSystemImplAdapter extends XmlAdapter<String, ContactPointSystem> {

	@Override
	public ContactPointSystem unmarshal(String v) throws Exception {
		ContactPointSystem result = FhirFactory.eINSTANCE.createContactPointSystem();
		result.setValue(ContactPointSystemList.get(v));
		return result;
	}

	@Override
	public String marshal(ContactPointSystem v) throws Exception {
		return v.getValue().getLiteral();
	}

}
