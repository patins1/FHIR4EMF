package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrderOralDiet;

@XmlRootElement(name = "NutritionOrderOralDietRefElement")
public class NutritionOrderOralDietRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public NutritionOrderOralDiet createInstance() {
		return FhirFactory.eINSTANCE.createNutritionOrderOralDiet();
	}
	
	public static NutritionOrderOralDietRef valueOf(String id) {
		NutritionOrderOralDietRef result = new NutritionOrderOralDietRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}