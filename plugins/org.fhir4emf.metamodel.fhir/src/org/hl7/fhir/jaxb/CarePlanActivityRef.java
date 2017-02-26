package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CarePlanActivityRefElement")
public class CarePlanActivityRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CarePlanActivity createInstance() {
		return FhirFactory.eINSTANCE.createCarePlanActivity();
	}
	
	public static CarePlanActivityRef valueOf(String id) {
		CarePlanActivityRef result = new CarePlanActivityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}