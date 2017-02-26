package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UnitsOfTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.UnitsOfTimeList;
	
	
	
	

public class UnitsOfTimeImplAdapter extends XmlAdapter<String, UnitsOfTime> {

	@Override
	public UnitsOfTime unmarshal(String v) throws Exception {
		UnitsOfTime result = FhirFactory.eINSTANCE.createUnitsOfTime();
		result.setValue(UnitsOfTimeList.get(v));
		return result;
	}

	@Override
	public String marshal(UnitsOfTime v) throws Exception {
		return v.getValue().getLiteral();
	}

}
