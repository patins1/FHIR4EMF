package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrderNutrient;

@XmlRootElement(name = "NutritionOrderNutrientRefElement")
public class NutritionOrderNutrientRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public NutritionOrderNutrient createInstance() {
		return FhirFactory.eINSTANCE.createNutritionOrderNutrient();
	}
	
	public static NutritionOrderNutrientRef valueOf(String id) {
		NutritionOrderNutrientRef result = new NutritionOrderNutrientRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}