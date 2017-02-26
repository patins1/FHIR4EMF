package org.hl7.fhir.jaxb;

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import javax.xml.datatype.XMLGregorianCalendar;
	
	
	
	

public class DateTimeImplAdapter extends XmlAdapter<XMLGregorianCalendar, DateTime> {

	@Override
	public DateTime unmarshal(XMLGregorianCalendar v) throws Exception {
		DateTime result = FhirFactory.eINSTANCE.createDateTime();
		result.setValue(v);
		return result;
	}

	@Override
	public XMLGregorianCalendar marshal(DateTime v) throws Exception {
		return v.getValue();
	}

}
