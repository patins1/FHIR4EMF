package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CarePlanActivityStatusRefElement")
public class CarePlanActivityStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CarePlanActivityStatus createInstance() {
		return FhirFactory.eINSTANCE.createCarePlanActivityStatus();
	}
	
	public static CarePlanActivityStatusRef valueOf(String id) {
		CarePlanActivityStatusRef result = new CarePlanActivityStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}