package org.hl7.fhir.jaxb;

import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CarePlanStatusList;
	
	
	
	

public class CarePlanStatusImplAdapter extends XmlAdapter<String, CarePlanStatus> {

	@Override
	public CarePlanStatus unmarshal(String v) throws Exception {
		CarePlanStatus result = FhirFactory.eINSTANCE.createCarePlanStatus();
		result.setValue(CarePlanStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(CarePlanStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
