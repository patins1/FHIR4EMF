package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Time;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import javax.xml.datatype.XMLGregorianCalendar;
	
	
	
	

public class TimeImplAdapter extends XmlAdapter<XMLGregorianCalendar, Time> {

	@Override
	public Time unmarshal(XMLGregorianCalendar v) throws Exception {
		Time result = FhirFactory.eINSTANCE.createTime();
		result.setValue(v);
		return result;
	}

	@Override
	public XMLGregorianCalendar marshal(Time v) throws Exception {
		return v.getValue();
	}

}
