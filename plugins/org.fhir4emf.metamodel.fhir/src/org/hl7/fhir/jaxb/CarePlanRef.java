package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CarePlan;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CarePlanRefElement")
public class CarePlanRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public CarePlan createInstance() {
		return FhirFactory.eINSTANCE.createCarePlan();
	}
	
	public static CarePlanRef valueOf(String id) {
		CarePlanRef result = new CarePlanRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}