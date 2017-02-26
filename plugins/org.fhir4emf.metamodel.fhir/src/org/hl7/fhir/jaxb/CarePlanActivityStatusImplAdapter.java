package org.hl7.fhir.jaxb;

import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CarePlanActivityStatusList;
	
	
	
	

public class CarePlanActivityStatusImplAdapter extends XmlAdapter<String, CarePlanActivityStatus> {

	@Override
	public CarePlanActivityStatus unmarshal(String v) throws Exception {
		CarePlanActivityStatus result = FhirFactory.eINSTANCE.createCarePlanActivityStatus();
		result.setValue(CarePlanActivityStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(CarePlanActivityStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
