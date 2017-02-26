package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CarePlanStatusRefElement")
public class CarePlanStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CarePlanStatus createInstance() {
		return FhirFactory.eINSTANCE.createCarePlanStatus();
	}
	
	public static CarePlanStatusRef valueOf(String id) {
		CarePlanStatusRef result = new CarePlanStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}