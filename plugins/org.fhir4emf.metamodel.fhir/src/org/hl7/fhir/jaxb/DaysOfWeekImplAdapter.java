package org.hl7.fhir.jaxb;

import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DaysOfWeekList;
	
	
	
	

public class DaysOfWeekImplAdapter extends XmlAdapter<String, DaysOfWeek> {

	@Override
	public DaysOfWeek unmarshal(String v) throws Exception {
		DaysOfWeek result = FhirFactory.eINSTANCE.createDaysOfWeek();
		result.setValue(DaysOfWeekList.get(v));
		return result;
	}

	@Override
	public String marshal(DaysOfWeek v) throws Exception {
		return v.getValue().getLiteral();
	}

}
