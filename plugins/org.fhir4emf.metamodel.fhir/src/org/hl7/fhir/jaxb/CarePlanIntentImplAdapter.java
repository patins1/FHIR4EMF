package org.hl7.fhir.jaxb;

import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CarePlanIntentList;
	
	
	
	

public class CarePlanIntentImplAdapter extends XmlAdapter<String, CarePlanIntent> {

	@Override
	public CarePlanIntent unmarshal(String v) throws Exception {
		CarePlanIntent result = FhirFactory.eINSTANCE.createCarePlanIntent();
		result.setValue(CarePlanIntentList.get(v));
		return result;
	}

	@Override
	public String marshal(CarePlanIntent v) throws Exception {
		return v.getValue().getLiteral();
	}

}
