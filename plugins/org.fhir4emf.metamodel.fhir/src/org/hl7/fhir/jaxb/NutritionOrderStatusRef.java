package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrderStatus;

@XmlRootElement(name = "NutritionOrderStatusRefElement")
public class NutritionOrderStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public NutritionOrderStatus createInstance() {
		return FhirFactory.eINSTANCE.createNutritionOrderStatus();
	}
	
	public static NutritionOrderStatusRef valueOf(String id) {
		NutritionOrderStatusRef result = new NutritionOrderStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}