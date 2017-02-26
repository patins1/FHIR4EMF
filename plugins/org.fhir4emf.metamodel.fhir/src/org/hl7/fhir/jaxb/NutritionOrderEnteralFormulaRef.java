package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrderEnteralFormula;

@XmlRootElement(name = "NutritionOrderEnteralFormulaRefElement")
public class NutritionOrderEnteralFormulaRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public NutritionOrderEnteralFormula createInstance() {
		return FhirFactory.eINSTANCE.createNutritionOrderEnteralFormula();
	}
	
	public static NutritionOrderEnteralFormulaRef valueOf(String id) {
		NutritionOrderEnteralFormulaRef result = new NutritionOrderEnteralFormulaRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}