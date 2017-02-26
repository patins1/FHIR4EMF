package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Instant;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import javax.xml.datatype.XMLGregorianCalendar;
	
	
	
	

public class InstantImplAdapter extends XmlAdapter<XMLGregorianCalendar, Instant> {

	@Override
	public Instant unmarshal(XMLGregorianCalendar v) throws Exception {
		Instant result = FhirFactory.eINSTANCE.createInstant();
		result.setValue(v);
		return result;
	}

	@Override
	public XMLGregorianCalendar marshal(Instant v) throws Exception {
		return v.getValue();
	}

}
