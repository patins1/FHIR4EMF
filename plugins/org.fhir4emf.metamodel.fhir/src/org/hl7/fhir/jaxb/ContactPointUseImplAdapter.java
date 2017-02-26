package org.hl7.fhir.jaxb;

import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ContactPointUseList;
	
	
	
	

public class ContactPointUseImplAdapter extends XmlAdapter<String, ContactPointUse> {

	@Override
	public ContactPointUse unmarshal(String v) throws Exception {
		ContactPointUse result = FhirFactory.eINSTANCE.createContactPointUse();
		result.setValue(ContactPointUseList.get(v));
		return result;
	}

	@Override
	public String marshal(ContactPointUse v) throws Exception {
		return v.getValue().getLiteral();
	}

}
