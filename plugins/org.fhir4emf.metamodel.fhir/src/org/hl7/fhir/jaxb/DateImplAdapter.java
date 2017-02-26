package org.hl7.fhir.jaxb;

import org.hl7.fhir.Date;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import javax.xml.datatype.XMLGregorianCalendar;
	
	
	
	

public class DateImplAdapter extends XmlAdapter<XMLGregorianCalendar, Date> {

	@Override
	public Date unmarshal(XMLGregorianCalendar v) throws Exception {
		Date result = FhirFactory.eINSTANCE.createDate();
		result.setValue(v);
		return result;
	}

	@Override
	public XMLGregorianCalendar marshal(Date v) throws Exception {
		return v.getValue();
	}

}
