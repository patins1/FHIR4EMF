package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CarePlanDetailRefElement")
public class CarePlanDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CarePlanDetail createInstance() {
		return FhirFactory.eINSTANCE.createCarePlanDetail();
	}
	
	public static CarePlanDetailRef valueOf(String id) {
		CarePlanDetailRef result = new CarePlanDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}