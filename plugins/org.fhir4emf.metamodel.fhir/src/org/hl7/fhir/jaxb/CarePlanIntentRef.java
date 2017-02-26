package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CarePlanIntentRefElement")
public class CarePlanIntentRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CarePlanIntent createInstance() {
		return FhirFactory.eINSTANCE.createCarePlanIntent();
	}
	
	public static CarePlanIntentRef valueOf(String id) {
		CarePlanIntentRef result = new CarePlanIntentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}