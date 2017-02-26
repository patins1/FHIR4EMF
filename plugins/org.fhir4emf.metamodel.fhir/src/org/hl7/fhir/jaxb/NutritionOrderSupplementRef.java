package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrderSupplement;

@XmlRootElement(name = "NutritionOrderSupplementRefElement")
public class NutritionOrderSupplementRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public NutritionOrderSupplement createInstance() {
		return FhirFactory.eINSTANCE.createNutritionOrderSupplement();
	}
	
	public static NutritionOrderSupplementRef valueOf(String id) {
		NutritionOrderSupplementRef result = new NutritionOrderSupplementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}